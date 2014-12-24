package paoc.ui;

import java.util.ArrayList;
import java.util.EventObject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.parts.ScrollableThumbnail;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.SimpleFactory;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.AlignmentAction;
import org.eclipse.gef.ui.actions.DirectEditAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.gef.ui.parts.GraphicalEditorWithPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import paoc.Application;
import paoc.editparts.PartFactory;
import paoc.editparts.TreeEditPartFactory;
import paoc.helper.IImageKeys;
import paoc.model.Actuator;
import paoc.model.BelongToConnection;
import paoc.model.ContentsModel;
import paoc.model.ControlConnection;
import paoc.model.Device;
import paoc.model.Feature;
import paoc.model.LocateInConnection;
import paoc.model.Location;
import paoc.model.Probe;
import paoc.model.SenseConnection;
import paoc.model.User;


public class PAOCEnvironmentEditor extends GraphicalEditorWithPalette{

	public static final String ID = "PAOC.PAOCEnvironmentEditor";
	
	GraphicalViewer viewer;
	
	private ContentsModel contentsModel;

	public PAOCEnvironmentEditor(){
		this.setEditDomain(new DefaultEditDomain(this));
	}
	
	@SuppressWarnings("deprecation")
	protected void configureGraphicalViewer(){
		super.configureGraphicalViewer();
		
		viewer = getGraphicalViewer();
		
		ScalableRootEditPart rootEditPart = new ScalableRootEditPart();
		viewer.setRootEditPart(rootEditPart);
		
		ZoomManager manager = rootEditPart.getZoomManager();
		
		double[] zoomLevels = new double[]{
				0.25, 0.5, 0.75, 1.0, 1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0, 20.0
		};
		manager.setZoomLevels(zoomLevels);
		
		ArrayList<String> zoomContributions = new ArrayList<String>();
		zoomContributions.add(ZoomManager.FIT_ALL);
		zoomContributions.add(ZoomManager.FIT_HEIGHT);
		zoomContributions.add(ZoomManager.FIT_WIDTH);
		manager.setZoomLevelContributions(zoomContributions);
		
		this.getGraphicalViewer().setProperty(SnapToGrid.PROPERTY_GRID_ENABLED, new Boolean(true));
		this.getGraphicalViewer().setProperty(SnapToGrid.PROPERTY_GRID_VISIBLE, true);
		this.getGraphicalViewer().setProperty(SnapToGrid.PROPERTY_GRID_SPACING, new Dimension(25,25));
		
//		this.getGraphicalViewer().setProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED, true);
		
		IAction action = new ZoomInAction(manager);
		this.getActionRegistry().registerAction(action);
		
		action = new ZoomOutAction(manager);
		this.getActionRegistry().registerAction(action);
		
		viewer.setEditPartFactory(new PartFactory());
		
		KeyHandler keyHandler = new KeyHandler();
		
		keyHandler.put(
				KeyStroke.getPressed(SWT.DEL, 127, 0),
				getActionRegistry().getAction(GEFActionConstants.DELETE)
				);
		
		keyHandler.put(KeyStroke.getPressed(
				SWT.F2, 0),
				getActionRegistry().getAction(GEFActionConstants.DIRECT_EDIT));
		
		//this.getGraphicalViewer().setKeyHandler(keyHandler);
		this.getGraphicalViewer().setKeyHandler(new GraphicalViewerKeyHandler(
				this.getGraphicalViewer()).setParent(keyHandler));
		
		viewer.setContextMenu(new PAOCEditorContextMenuProvider(viewer, this.getActionRegistry()));
	}
	
	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
		//viewer.setContents(new TemperatureAttribute());
		//ContentsModel parent = new ContentsModel();


		contentsModel = new ContentsModel();
		
	/*	Feature feature = new Feature();
		feature.setConstraint(new Rectangle(20,20,IRectangleAttribute.WIDTH,IRectangleAttribute.HEIGHT));
		//parent.addChild(feature);
		contentsModel.addChild(feature);
		
		Probe probe= new Probe();
		probe.setConstraint(new Rectangle(20,150,IRectangleAttribute.WIDTH,IRectangleAttribute.HEIGHT));
		//parent.addChild(probe);
		contentsModel.addChild(probe);
		
		Actuator actuator = new Actuator();
		actuator.setConstraint(new Rectangle(20,300,IRectangleAttribute.WIDTH,IRectangleAttribute.HEIGHT));
		//parent.addChild(actuator);
		contentsModel.addChild(actuator);
		
		Location location = new Location();
		location.setOwnerName("Room810");
		location.setConstraint(new Rectangle(300,20,IRectangleAttribute.WIDTH,IRectangleAttribute.HEIGHT));
		//parent.addChild(location);
		contentsModel.addChild(location);
		
		User user = new User();
		user.setOwnerName("Bob");
		user.setConstraint(new Rectangle(300,150,IRectangleAttribute.WIDTH,IRectangleAttribute.HEIGHT));
		//parent.addChild(user);
		contentsModel.addChild(user);
		
		Device device = new Device();
		device.setOwnerName("Computer");
		device.setConstraint(new Rectangle(300,300,IRectangleAttribute.WIDTH,IRectangleAttribute.HEIGHT));
		//parent.addChild(device);
		contentsModel.addChild(device);*/
		
		//viewer.setContents(parent);
		viewer.setContents(contentsModel);
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		this.getCommandStack().markSaveLocation();
		
	}
	
	public boolean isDirty(){
		return this.getCommandStack().isDirty();
	}
	
	public void commandStackChanged(EventObject event){
		this.firePropertyChange(IEditorPart.PROP_DIRTY);
		
		super.commandStackChanged(event);
	}
	
	
	public void doSaveAs(){
		
	}
	
	public boolean isSaveAsAllowed(){
		return false;
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		// TODO Auto-generated method stub
		PaletteRoot root = new PaletteRoot();
		
		PaletteGroup toolGroup = new PaletteGroup("Tool");
		
		ToolEntry tool = new SelectionToolEntry();
		toolGroup.add(tool);
		root.setDefaultEntry(tool);
		
		tool = new MarqueeToolEntry();
		toolGroup.add(tool);
		
		ImageDescriptor descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.FEATURE);
		CreationToolEntry creationEntry = new CreationToolEntry(
				"New Feature",
				"Get new feature",
				new SimpleFactory(Feature.class),
				descriptor,
				descriptor);
		toolGroup.add(creationEntry);
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.PROBE);
		creationEntry = new CreationToolEntry(
				"New Probe",
				"Get new probe",
				new SimpleFactory(Probe.class),
				descriptor,
				descriptor);
		toolGroup.add(creationEntry);
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.ACTUATOR);
		creationEntry = new CreationToolEntry(
				"New Actuator",
				"Get new actuator",
				new SimpleFactory(Actuator.class),
				descriptor,
				descriptor);
		toolGroup.add(creationEntry);
		
		PaletteDrawer drawer = new PaletteDrawer("Owner");
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.LOCATION);
		creationEntry = new CreationToolEntry(
				"New Location",
				"Get new location",
				new SimpleFactory(Location.class),
				descriptor,
				descriptor);
		drawer.add(creationEntry);
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.USER);
		creationEntry = new CreationToolEntry(
				"New User",
				"Get new user",
				new SimpleFactory(User.class),
				descriptor,
				descriptor);
		drawer.add(creationEntry);
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.DEVICE);
		creationEntry = new CreationToolEntry(
				"New Device",
				"Get new device",
				new SimpleFactory(Device.class),
				descriptor,
				descriptor);
		drawer.add(creationEntry);
		
		toolGroup.add(drawer);
		
		drawer = new PaletteDrawer("Connection");
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.LOCATEINCONNECTION);
		ConnectionCreationToolEntry connectionCreationEntry = new ConnectionCreationToolEntry(
				"New Locate In Connection",
				"Get new locate in connnection",
				new SimpleFactory(LocateInConnection.class),
				descriptor,
				descriptor);
		drawer.add(connectionCreationEntry);
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.SENSECONNECTION);
		connectionCreationEntry = new ConnectionCreationToolEntry(
				"New Sense Connection",
				"Get new sense connection",
				new SimpleFactory(SenseConnection.class),
				descriptor,
				descriptor);
		drawer.add(connectionCreationEntry);
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.CONTROLCONNECTION);
		connectionCreationEntry = new ConnectionCreationToolEntry(
				"New Control Connection",
				"Get new control connection",
				new SimpleFactory(ControlConnection.class),
				descriptor,
				descriptor);
		drawer.add(connectionCreationEntry);
		
		descriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.BELONGTOCONNECTION);
		connectionCreationEntry = new ConnectionCreationToolEntry(
				"New Belong To Connection",
				"Get new belong to connection",
				new SimpleFactory(BelongToConnection.class),
				descriptor,
				descriptor);
		drawer.add(connectionCreationEntry);
		
		toolGroup.add(drawer);
		
		root.add(toolGroup);
		return root;
	}
	
	protected void createActions(){
		super.createActions();
		ActionRegistry registry = this.getActionRegistry();
		
		IAction action = new DirectEditAction((IWorkbenchPart)this);
		registry.registerAction(action);
		
		this.getSelectionActions().add(action.getId());
		
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.LEFT);
		registry.registerAction(action);
		this.getSelectionActions().add(action.getId());
		
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.CENTER);
		registry.registerAction(action);
		this.getSelectionActions().add(action.getId());
		
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.RIGHT);
		registry.registerAction(action);
		this.getSelectionActions().add(action.getId());
		
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.TOP);
		registry.registerAction(action);
		this.getSelectionActions().add(action.getId());
		
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.MIDDLE);
		registry.registerAction(action);
		this.getSelectionActions().add(action.getId());
		
		action = new AlignmentAction((IWorkbenchPart)this, PositionConstants.BOTTOM);
		registry.registerAction(action);
		this.getSelectionActions().add(action.getId());
	}
	
	class PAOCContentOutlinePage extends ContentOutlinePage{

		private SashForm sash;
		
		private ScrollableThumbnail thumbnail;
		private DisposeListener disposeListener;
		
		public PAOCContentOutlinePage() {
			super(new TreeViewer());
			// TODO Auto-generated constructor stub
			this.getViewer().setContextMenu(new PAOCEditorContextMenuProvider(this.getViewer(), getActionRegistry()));
		}
		
		@SuppressWarnings("deprecation")
		public void init(IPageSite pageSite){
			super.init(pageSite);
			
			ActionRegistry registry = getActionRegistry();
			IActionBars bars = pageSite.getActionBars();
			
			String id = IWorkbenchActionConstants.UNDO;
			bars.setGlobalActionHandler(id, registry.getAction(id));
			
			id = IWorkbenchActionConstants.REDO;
			bars.setGlobalActionHandler(id, registry.getAction(id));
			
			id = IWorkbenchActionConstants.DELETE;
			bars.setGlobalActionHandler(id, registry.getAction(id));
			bars.updateActionBars();
		}
		
		public void createControl(Composite parent){
			this.sash = new SashForm(parent, SWT.VERTICAL);
			
			this.getViewer().createControl(sash);
			this.getViewer().setEditDomain(getEditDomain());
			this.getViewer().setEditPartFactory(new TreeEditPartFactory());
			this.getViewer().setContents(contentsModel);
			getSelectionSynchronizer().addViewer(this.getViewer());
			
			Canvas canvas = new Canvas(sash, SWT.BORDER);
			LightweightSystem lws = new LightweightSystem(canvas);
			
			thumbnail = new ScrollableThumbnail(
					(Viewport) ((ScalableRootEditPart)getGraphicalViewer()
							.getRootEditPart()).getFigure());
			
			thumbnail.setSource(((ScalableRootEditPart)getGraphicalViewer().getRootEditPart())
					.getLayer(LayerConstants.PRINTABLE_LAYERS));
			lws.setContents(thumbnail);
			
			disposeListener = new DisposeListener(){
				public void widgetDisposed(DisposeEvent e){
					if(thumbnail != null){
						thumbnail.deactivate();
						thumbnail = null;
					}
				}
			};
			
			getGraphicalViewer().getControl().addDisposeListener(disposeListener);
			
		}
		
		public void dispose(){
			getSelectionSynchronizer().removeViewer(this.getViewer());
			
			if(getGraphicalViewer().getControl() != null
					&& !getGraphicalViewer().getControl().isDisposed())
				getGraphicalViewer().getControl().removeDisposeListener(disposeListener);
			
			super.dispose();
		}
		
		public Control getControl(){
			return sash;
		}
		
	}
	
	public Object getAdapter(Class type){
		if(type == ZoomManager.class)
			return ((ScalableRootEditPart)this.getGraphicalViewer().getRootEditPart()).getZoomManager();
		else if(type == IContentOutlinePage.class)
			return new PAOCContentOutlinePage();
/*		else if(type == SnapToHelper.class){
			List snapStrategies = new ArrayList();
			
			Boolean val = (Boolean) this.getGraphicalViewer().getProperty(RulerProvider.PROPERTY_RULER_VISIBILITY);
			if(val != null && val.booleanValue())
				snapStrategies.add(new SnapToGuides((GraphicalEditPart)this));
			
			val = (Boolean) this.getGraphicalViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED);
			if(val != null && val.booleanValue())
				snapStrategies.add(new SnapToGeometry((GraphicalEditPart) this));
			
			val = (Boolean) this.getGraphicalViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED);
			if(val != null && val.booleanValue())
				snapStrategies.add(new SnapToGrid((GraphicalEditPart) this));
			
			if(snapStrategies.size() == 1)
				return (SnapToHelper)snapStrategies.get(0);
			
			SnapToHelper[] sth = new SnapToHelper[snapStrategies.size()];
			for(int i = 0; i < snapStrategies.size(); i++)
				sth[i] = (SnapToHelper) snapStrategies.get(i);
			return new CompoundSnapToHelper(sth);
		}*/
		
		return super.getAdapter(type);
	}
	
	
}






















