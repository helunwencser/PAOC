package paoc.editparts;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.jface.viewers.TextCellEditor;

import paoc.model.User;
import paoc.policies.DeleteComponentEditPolicy;
import paoc.policies.PAOCDirectEditPolicy;
import paoc.policies.PAOCGraphicalNodeEditPolicy;

public class UserEditPart extends EditPartWithListener implements NodeEditPart{

	private UserDirectEditManager directManager = null;
	
	public void performRequest(Request request){
		if(request.getType().equals(RequestConstants.REQ_DIRECT_EDIT)){
			performDirectEdit();
			return;
		}
		super.performRequest(request);
	}
	
	private void performDirectEdit(){
		if(directManager == null){
			directManager = new UserDirectEditManager(
					this, 
					TextCellEditor.class, 
					new PAOCCellEditorLocator(getFigure()));
		}
		directManager.show();
	}
	
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		User model = (User)getModel();
		
		Label label = new Label();
		label.setText(User.type + "\n" + model.getOwnerName());
		
		label.setBorder(new CompoundBorder(new LineBorder(), new MarginBorder(3)));
		
		label.setBackgroundColor(ColorConstants.yellow);
		label.setOpaque(true);

		return label;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		this.installEditPolicy(EditPolicy.COMPONENT_ROLE, new DeleteComponentEditPolicy());
		this.installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new PAOCDirectEditPolicy());
		this.installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new PAOCGraphicalNodeEditPolicy());
	}
	
	public void propertyChange(PropertyChangeEvent event){
		if(event.getPropertyName().equals(User.P_CONSTRAINT))
			this.refreshVisuals();
		else if(event.getPropertyName().equals(User.P_TEXT)){
			Label label = (Label)this.getFigure();
			label.setText(User.type + "\n" + (String)event.getNewValue());
		}
		else if(event.getPropertyName().equals(User.P_SOURCE_LOCATEIN_CONNECTION))
			refreshSourceConnections();
		else if(event.getPropertyName().equals(User.P_TARGET_LOCATEIN_CONNECTION))
			refreshTargetConnections();
		else if(event.getPropertyName().equals(User.P_TARGET_BELONGTO_CONNECTION))
			refreshTargetConnections();
	}
	
	protected List<?> getModelSourceConnections(){
		return ((User)this.getModel()).getSourceConnections();
	}
	
	protected List<?> getModelTargetConnections(){
		return ((User)this.getModel()).getTargetConnections();
	}
	
	protected void refreshVisuals(){
		Rectangle constraint = ((User)getModel()).getConstraint();
		
		((GraphicalEditPart)getParent()).setLayoutConstraint(
				this,
				getFigure(),
				constraint);
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		// TODO Auto-generated method stub
		return new ChopboxAnchor(this.getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		// TODO Auto-generated method stub
		return new ChopboxAnchor(this.getFigure());
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		// TODO Auto-generated method stub
		return new ChopboxAnchor(this.getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		// TODO Auto-generated method stub
		return new ChopboxAnchor(this.getFigure());
	}
}
