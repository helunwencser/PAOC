package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.SenseConnection;

public class CreateSenseBendpointCommand extends Command {
	private SenseConnection connection;
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
		if(object instanceof SenseConnection)
			this.connection = (SenseConnection) object;
	}
	
	public void undo(){
		this.connection.removeBendpoint(index);
	}
}
