package paoc.commands;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import paoc.model.BelongToConnection;

public class CreateBelongToBendpointCommand extends Command {
	private BelongToConnection connection;
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
		if(object instanceof BelongToConnection)
			this.connection = (BelongToConnection) object;
	}
	
	public void undo(){
		this.connection.removeBendpoint(index);
	}
}
