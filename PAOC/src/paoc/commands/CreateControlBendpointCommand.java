package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.ControlConnection;

public class CreateControlBendpointCommand extends Command {
	private ControlConnection connection;
	private Point location;
	private int index;
	
	public void setLocation(Point location) {
		this.location = location;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void execute(){
		this.connection.addBendpoint(index, location);
	}
	
	public void setConnection(Object object){
		if(object instanceof ControlConnection)
			this.connection = (ControlConnection) object;
	}
	
	public void undo(){
		this.connection.removeBendpoint(index);
	}
}
