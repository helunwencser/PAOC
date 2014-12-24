package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.BelongToConnection;

public class DeleteBelongToBendpointCommand extends Command {
	private BelongToConnection connection;
	private Point oldLocation;
	private int index;
	
	public void execute(){
		this.oldLocation = (Point) this.connection.getBendpoints().get(index);
		this.connection.removeBendpoint(index);
	}
	
	public void setConnection(Object model){
		if(model instanceof BelongToConnection)
			this.connection = (BelongToConnection) model;
	}
	
	public void setIndex(int index){
		this.index = index;
	}
	
	public void undo(){
		this.connection.addBendpoint(index, oldLocation);
	}
}
