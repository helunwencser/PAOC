package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.LocateInConnection;

public class DeleteLocateInBendpointCommand extends Command {
	private LocateInConnection connection;
	private Point oldLocation;
	private int index;
	
	public void execute(){
		this.oldLocation = (Point) this.connection.getBendpoints().get(index);
		this.connection.removeBendpoint(index);
	}
	
	public void setConnection(Object model){
		if(model instanceof LocateInConnection)
			this.connection = (LocateInConnection) model;
	}
	
	public void setIndex(int index){
		this.index = index;
	}
	
	public void undo(){
		this.connection.addBendpoint(index, oldLocation);
	}
}
