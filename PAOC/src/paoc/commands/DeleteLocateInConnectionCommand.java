package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.LocateInConnection;

public class DeleteLocateInConnectionCommand extends Command {
	private LocateInConnection connection;
	
	public void execute(){
		this.connection.detachSource();
		this.connection.detachTarget();
	}
	
	public void setConnectionModel(Object model){
		if(model instanceof LocateInConnection)
			this.connection = (LocateInConnection) model;
	}
	
	public void undo(){
		this.connection.attachSource();
		this.connection.attachTarget();
	}
}
