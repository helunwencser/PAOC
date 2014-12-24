package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.ControlConnection;

public class MoveControlBendpointCommand extends Command {
	private ControlConnection connection;
	private Point oldLocation,newLocation;
	private int index;
	
	public void execute(){
		this.oldLocation = (Point) this.connection.getBendpoints().get(index);
		this.connection.replaceBendpoint(index, newLocation);
	}
	
	public void setConnection(Object model){
		if(model instanceof ControlConnection)
			this.connection = (ControlConnection) model;
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
