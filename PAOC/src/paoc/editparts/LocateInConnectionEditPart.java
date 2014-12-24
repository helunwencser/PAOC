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
import paoc.model.LocateInConnection;
import paoc.policies.PAOCBendpointEditPolicy;
import paoc.policies.PAOCConnectionEditPolicy;
import paoc.policies.PAOCConnectionEndpointEditPolicy;

public class LocateInConnectionEditPart extends AbstractConnectionEditPart implements PropertyChangeListener{

	protected IFigure createFigure(){
		PolylineConnection connection = (PolylineConnection)super.createFigure();
		connection.setConnectionRouter(new BendpointConnectionRouter());
		//PolylineConnection connection = new PolylineConnection();
		connection.setTargetDecoration(new PolygonDecoration());
		
		final Label label = new Label(IConnectionLabel.LOCATEIN);
		label.setOpaque(true);
		connection.add(label, new MidpointLocator(connection, 0));
		
		return connection;
	}
	
	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		this.installEditPolicy(EditPolicy.CONNECTION_ROLE, new PAOCConnectionEditPolicy());
		this.installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new PAOCConnectionEndpointEditPolicy());
		this.installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new PAOCBendpointEditPolicy());
	}
	
	public void activate(){
		super.activate();
		((LocateInConnection)this.getModel()).addPropertyChangeListener(this);
	}
	
	public void deactivate(){
		((LocateInConnection)this.getModel()).removePropertyChangeListener(this);
		super.deactivate();
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// TODO Auto-generated method stub
		if(event.getPropertyName().equals(LocateInConnection.P_BEND_POINT))
			refreshBendpoints();
	}
	
	protected void refreshBendpoints(){
		List<Point> bendpoints = ((LocateInConnection)this.getModel()).getBendpoints();
		List<AbsoluteBendpoint> constraint = new ArrayList<AbsoluteBendpoint>();
		for(int i = 0; i < bendpoints.size(); i++){
			constraint.add(new AbsoluteBendpoint((Point)bendpoints.get(i)));
		}
		this.getConnectionFigure().setRoutingConstraint(constraint);
	}
	
	protected void refreshVisuals(){
		refreshBendpoints();
	}

}
