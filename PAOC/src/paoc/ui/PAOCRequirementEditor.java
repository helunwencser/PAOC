package paoc.ui;

import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.ui.internal.MyDslActivator;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class PAOCRequirementEditor extends GraphicalEditor {

	public static final String ID = "PAOC.PAOCRequirementEditor";
	
	
	EmbeddedEditor handle;
	
	public PAOCRequirementEditor(){
		this.setEditDomain(new DefaultEditDomain(this));
	}
	
	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
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
		this.firePropertyChange(PROP_DIRTY);
		
		super.commandStackChanged(event);
	}

	public void doSaveAs(){
		
	}
	
	public boolean isSaveAsAllowed(){
		return false;
	}
	
	

	public void createPartControl(Composite parent){	


		IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {
			 
	        @Override
	        public XtextResource createResource() {
	            try {
	                MyDslStandaloneSetup.doSetup();
	                ResourceSet resourceSet = new ResourceSetImpl();
	                Resource resource = resourceSet.createResource(URI.createURI("C:/Users/helunwen/runtime-EclipseXtext/artemis.paoc.eval/src/my.mydsl"));
	 
	                return (XtextResource) resource;
	            } catch (Exception e) {
	                return null;
	            }
	        }
	    };
	 
	    MyDslActivator activator = MyDslActivator.getInstance();
	    Injector injector = activator.getInjector(MyDslActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL);
	    EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
	    handle = factory.newEditor(resourceProvider).withParent(parent);
	    
	    
	    // keep the partialEditor as instance var to read / write the edited text
	    EmbeddedEditorModelAccess partialEditor = handle.createPartialEditor(true);
	    //createGraphicalViewer(parent);
	    handle.getViewer().getControl().setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, true, 2, 2));

	}

}
