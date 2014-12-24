package paoc.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;

import paoc.actions.IfMatch;

public class SenseConnection extends AbstractModel{
	private Probe source;
	private Feature target;
	
	public static final String P_BEND_POINT = "_bend_point_sense_connection";
	
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
			//this.source.addSourceConnection(this);
	}
	
	public void attachTarget(){
		if(!this.target.getTargetConnections().contains(this)){
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
	
	public Probe getSource(){
		return this.source;
	}
	
	public Feature getTarget(){
		return this.target;
	}
	
	public void setSource(Probe model){
		this.source = model;
	}
	
	public void setTarget(Feature model){
		this.target = model;
	}
	
	public boolean isIfMatch(){
		return IfMatch.isIfProbeMathesFeature(this.source.getProbeType(), this.target.getFeatureName());
	}
}
