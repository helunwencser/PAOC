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

import paoc.model.Actuator;
import paoc.model.ControlConnection;
import paoc.policies.DeleteComponentEditPolicy;
import paoc.policies.PAOCDirectEditPolicy;
import paoc.policies.PAOCGraphicalNodeEditPolicy;

public class ActuatorEditPart extends EditPartWithListener implements NodeEditPart{

	private ActuatorDirectEditManager directManager = null;
	
	public void performRequest(Request request){
		if(request.getType().equals(RequestConstants.REQ_DIRECT_EDIT)){
			performDirectEdit();
			return;
		}
		super.performRequest(request);
	}
	
	private void performDirectEdit(){
		if(directManager == null){
			directManager = new ActuatorDirectEditManager(
					this, 
					TextCellEditor.class, 
					new PAOCCellEditorLocator(getFigure()));
		}
		directManager.show();
	}
	
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		Actuator model = (Actuator)getModel();
		
		Label label = new Label();
		label.setText(Actuator.type + "\n" + model.getActuatorType());
		
		label.setBorder(new CompoundBorder(new LineBorder(), new MarginBorder(3)));
		
		label.setBackgroundColor(ColorConstants.blue);
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
		if(event.getPropertyName().equals(Actuator.P_CONSTRAINT))
			this.refreshVisuals();
		else if(event.getPropertyName().equals(Actuator.P_TEXT)){
			Label label = (Label)this.getFigure();
			label.setText(Actuator.type + "\n" + (String)event.getNewValue());
		}
		else if(event.getPropertyName().equals(Actuator.P_SOURCE_CONTROL_CONNECTION))
			refreshSourceConnections();
	}
	
	protected List<ControlConnection> getModelSourceConnections(){
		return ((Actuator)this.getModel()).getSourceConnections();
	}
	
	protected void refreshVisuals(){
		Rectangle constraint = ((Actuator)getModel()).getConstraint();
		
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
