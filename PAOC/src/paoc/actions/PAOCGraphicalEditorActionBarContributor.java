package paoc.actions;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.AlignmentRetargetAction;
import org.eclipse.gef.ui.actions.DeleteRetargetAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.actions.ZoomInRetargetAction;
import org.eclipse.gef.ui.actions.ZoomOutRetargetAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.actions.ActionFactory;


public class PAOCGraphicalEditorActionBarContributor extends ActionBarContributor {

	@Override
	protected void buildActions() {
		// TODO Auto-generated method stub
		
		this.addRetargetAction(new UndoRetargetAction());
		this.addRetargetAction(new RedoRetargetAction());
		
		this.addRetargetAction(new DeleteRetargetAction());
		
		this.addRetargetAction(new ZoomInRetargetAction());
		this.addRetargetAction(new ZoomOutRetargetAction());
		
		this.addRetargetAction(new AlignmentRetargetAction(PositionConstants.LEFT));
		this.addRetargetAction(new AlignmentRetargetAction(PositionConstants.CENTER));
		this.addRetargetAction(new AlignmentRetargetAction(PositionConstants.RIGHT));
		this.addRetargetAction(new AlignmentRetargetAction(PositionConstants.TOP));
		this.addRetargetAction(new AlignmentRetargetAction(PositionConstants.MIDDLE));
		this.addRetargetAction(new AlignmentRetargetAction(PositionConstants.BOTTOM));
		
	}

	public void contributeToToolBar(IToolBarManager toolBarManager){
		toolBarManager.add(this.getAction(ActionFactory.UNDO.getId()));
		toolBarManager.add(this.getAction(ActionFactory.REDO.getId()));
		
		toolBarManager.add(this.getAction(ActionFactory.DELETE.getId()));
		
		toolBarManager.add(new Separator());
		
		toolBarManager.add(this.getActionRegistry().getAction(GEFActionConstants.ALIGN_LEFT));
		toolBarManager.add(this.getActionRegistry().getAction(GEFActionConstants.ALIGN_CENTER));
		toolBarManager.add(this.getActionRegistry().getAction(GEFActionConstants.ALIGN_RIGHT));
		toolBarManager.add(this.getActionRegistry().getAction(GEFActionConstants.ALIGN_TOP));
		toolBarManager.add(this.getActionRegistry().getAction(GEFActionConstants.ALIGN_MIDDLE));
		toolBarManager.add(this.getActionRegistry().getAction(GEFActionConstants.ALIGN_BOTTOM));
		
		toolBarManager.add(new Separator());
		
		toolBarManager.add(this.getActionRegistry().getAction(GEFActionConstants.ZOOM_IN));
		toolBarManager.add(this.getActionRegistry().getAction(GEFActionConstants.ZOOM_OUT));
		
		toolBarManager.add(new ZoomComboContributionItem(this.getPage()));
	}
	
	@Override
	protected void declareGlobalActionKeys() {
		// TODO Auto-generated method stub
		
	}
	
	

}
