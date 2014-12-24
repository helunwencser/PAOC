package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.LocateInConnection;

public class MoveLocateInBendpointCommand extends Command {
	private LocateInConnection connection;
	private Point oldLocation,newLocation;
	private int index;
	
	public void execute(){
		this.oldLocation = (Point) this.connection.getBendpoints().get(index);
		this.connection.replaceBendpoint(index, newLocation);
	}
	
	public void setConnection(Object model){
		if(model instanceof LocateInConnection)
			this.connection = (LocateInConnection) model;
	}
	
	public void setIndex(int i){
		this.index = i;
	}
	
	public void setNewLocation(Point newLocation){
		this.newLocation = newLocation;
	}
	
	public void undo(){
		this.connection.replaceBendpoint(index, oldLocation);
	}
}
