package paoc.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;

public class BelongToConnection extends AbstractModel{
	private Feature source;
	private Owner target;
	
	public static final String P_BEND_POINT = "_bend_point_belongTo_connection";
	
	private List<Point> bendpoints = new ArrayList<Point>();
	
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
		if(!this.source.getSourceConnections().contains(this)){
			this.source.addSourceConnection(this);
			this.source.addIfOnlyInContentsModel();
		}
		//	this.source.addSourceConnection(this);
	}
	
	public void attachTarget(){
		if(!this.target.getTargetConnections().contains(this)){
			this.target.addTargetConnection(this);
			if(this.target instanceof Location)
				((Location) this.target).firePropertyChangeChildren();
			else if(this.target instanceof Device)
				((Device) this.target).firePropertyChangeChildren();
			else if(this.target instanceof User)
				((User) this.target).firePropertyChangeChildren();
		}
		//	this.target.addTargetConnection(this);
	}
	
	public void detachSource(){
		this.source.removeSourceConnection(this);
		this.source.subIfOnlyInContentsModel();
	}
	
	public void detachTarget(){
		this.target.removeTargetConnection(this);
		if(this.target instanceof Location)
			((Location) this.target).firePropertyChangeChildren();
		else if(this.target instanceof Device)
			((Device) this.target).firePropertyChangeChildren();
		else if(this.target instanceof User)
			((User) this.target).firePropertyChangeChildren();
	}
	
	public Feature getSource(){
		return this.source;
	}
	
	public Owner getTarget(){
		return this.target;
	}
	
	public void setSource(Feature model){
		this.source = model;
	}
	
	public void setTarget(Owner model){
		this.target = model;
	}
}
