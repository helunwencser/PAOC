package paoc.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;

import paoc.actions.IfMatch;

public class ControlConnection extends AbstractModel{
	private Actuator source;
	private Feature target;

	private List<Point> bendpoints = new ArrayList<Point>();
	
	public static final String P_BEND_POINT = "_bend_point_control_connection";
	
	public void addBendpoint(int index, Point point){
		this.bendpoints.add(index, point);
		this.firePropertyChange(P_BEND_POINT, null, null);
	}
	
	public List<Point> getBendpoints(){
		return this.bendpoints;
	}
	
	public void removeBendpoint(int index){
		this.bendpoints.remove(index);
		this.firePropertyChange(P_BEND_POINT, null, null);
	}
	
	public void replaceBendpoint(int index, Point point){
		this.bendpoints.set(index, point);
		this.firePropertyChange(P_BEND_POINT, null, null);
	}
	
	
	public void attachSource(){
		if(!source.getSourceConnections().contains(this)){
			this.source.addSourceConnection(this);
			this.source.addIfOnlyInContentsModel();
		}
			//this.source.addSourceConnection(this);
	}
	
	public void attachTarget(){
		if(!target.getTargetConnections().contains(this)){
			this.target.addTargetConnection(this);
			this.target.firePropertyChangeChildren();
		}
			//this.target.addTargetConnection(this);
	}
	
	public void detachSource(){
		this.source.removeSourceConnection(this);
		this.source.subIfOnlyInContentsModel();
	}
	
	public void detachTarget(){
		this.target.removeTargetConnection(this);
		this.target.firePropertyChangeChildren();
	}
	
	public Actuator getSource() {
		return source;
	}

	public void setSource(Actuator source) {
		this.source = source;
	}

	public Feature getTarget() {
		return target;
	}

	public void setTarget(Feature target) {
		this.target = target;
	}
	
	public boolean isIfMatch(){
		return IfMatch.isIfActuatorMatchesFeature(this.source.getActuatorType(), this.target.getFeatureName());
	}
}
