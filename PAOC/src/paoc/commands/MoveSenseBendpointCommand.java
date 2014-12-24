package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.SenseConnection;

public class MoveSenseBendpointCommand extends Command {
	private SenseConnection connection;
	private Point oldLocation,newLocation;
	private int index;
	
	public void execute(){
		this.oldLocation = (Point) this.connection.getBendpoints().get(index);
		this.connection.replaceBendpoint(index, newLocation);
	}
	
	public void setConnection(Object model){
		if(model instanceof SenseConnection)
			this.connection = (SenseConnection) model;
	}

	public void setNewLocation(Point newLocation) {
		this.newLocation = newLocation;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void undo(){
		this.connection.replaceBendpoint(index, oldLocation);
	}
	

}
