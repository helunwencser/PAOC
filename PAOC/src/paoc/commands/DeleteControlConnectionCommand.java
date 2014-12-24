package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.ControlConnection;

public class DeleteControlConnectionCommand extends Command {
	private ControlConnection connection;
	
	public void execute(){
		this.connection.detachSource();
		this.connection.detachTarget();
	}
	
	public void setConnectionModel(Object model){
		if(model instanceof ControlConnection)
			this.connection = (ControlConnection) model;
	}
	
	public void undo(){
		this.connection.attachSource();
		this.connection.attachTarget();
	}
}
