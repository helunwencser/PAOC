package paoc.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;

import paoc.helper.IConnectionLabel;
import paoc.model.ControlConnection;
import paoc.policies.PAOCBendpointEditPolicy;
import paoc.policies.PAOCConnectionEditPolicy;
import paoc.policies.PAOCConnectionEndpointEditPolicy;

public class ControlConnectionEditPart extends AbstractConnectionEditPart implements PropertyChangeListener{

	protected IFigure createFigure(){
		PolylineConnection connection = (PolylineConnection)super.createFigure();
		connection.setConnectionRouter(new BendpointConnectionRouter());
		
		final Label label = new Label(IConnectionLabel.CONTROL);
		label.setOpaque(true);
		connection.add(label, new MidpointLocator(connection, 0));
		
		connection.setTargetDecoration(new PolygonDecoration());
		return connection;
	}
	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		this.installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new PAOCConnectionEndpointEditPolicy());
		this.installEditPolicy(EditPolicy.CONNECTION_ROLE, new PAOCConnectionEditPolicy());
		this.installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new PAOCBendpointEditPolicy());
		
	}

	public void activate(){
		super.activate();
		((ControlConnection)this.getModel()).addPropertyChangeListener(this);
	}
	
	public void deactivate(){
		((ControlConnection)this.getModel()).removePropertyChangeListener(this);
		super.deactivate();
	}
	
	protected void refreshBendpoints(){
		List<Point> bendpoints = ((ControlConnection)this.getModel()).getBendpoints();
		List<AbsoluteBendpoint> constraint = new ArrayList<AbsoluteBendpoint>();
		for(int i = 0; i < bendpoints.size(); i++){
			constraint.add(new AbsoluteBendpoint((Point)bendpoints.get(i)));
		}
		
		getConnectionFigure().setRoutingConstraint(constraint);
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getPropertyName().equals(ControlConnection.P_BEND_POINT))
			refreshBendpoints();
	}

}
