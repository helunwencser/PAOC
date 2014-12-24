package paoc.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;

public class LocateInConnection extends AbstractModel{
	private Owner source,target;
	
	private List<Point> bendpoints = new ArrayList<Point>();
	
	public static final String P_BEND_POINT = "_bend_point_locateIn_connection";
	
	public void addBendpoint(int index, Point point){
		this.bendpoints.add(index, point);
		this.firePropertyChange(LocateInConnection.P_BEND_POINT, null, null);
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
	
	public Owner getSource() {
		return source;
	}

	public void setSource(Owner source) {
		this.source = source;
	}

	public Owner getTarget() {
		return target;
	}

	public void setTarget(Owner target) {
		this.target = target;
	}

	public void attachSource(){
		if(!source.getSourceConnections().contains(this)){
			this.source.addSourceConnection(this);
			this.source.addIfOnlyInContentsModel();
		}
			//source.addSourceConnection(this);
	}
	
	public void attachTarget(){
		if(!target.getTargetConnections().contains(this)){
			this.target.addTargetConnection(this);
			if(this.target instanceof Location)
				((Location) this.target).firePropertyChangeChildren();
			else if(this.target instanceof Device)
				((Device) this.target).firePropertyChangeChildren();
			else if(this.target instanceof User)
				((User) this.target).firePropertyChangeChildren();
		}
			//target.addTargetConnection(this);
	}
	
	public void detachSource(){
		source.removeSourceConnection(this);
		this.source.subIfOnlyInContentsModel();
	}
	
	public void detachTarget(){
		target.removeTargetConnection(this);
		if(this.target instanceof Location)
			((Location) this.target).firePropertyChangeChildren();
		else if(this.target instanceof Device)
			((Device) this.target).firePropertyChangeChildren();
		else if(this.target instanceof User)
			((User) this.target).firePropertyChangeChildren();
		
	}

}
