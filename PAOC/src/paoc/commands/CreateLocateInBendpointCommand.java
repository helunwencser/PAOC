package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.LocateInConnection;

public class CreateLocateInBendpointCommand extends Command {
	private LocateInConnection connection;
	private Point location;
	private int index;
	
	public void execute(){
		this.connection.addBendpoint(index, location);
	}
	
	public void setConnection(Object object){
		if(object instanceof LocateInConnection)
			this.connection = (LocateInConnection) object;
	}
	
	public void setIndex(int i){
		this.index = i;
	}
	
	public void setLocation(Point location){
		this.location = location;
	}
	
	public void undo(){
		this.connection.removeBendpoint(index);
	}
}
