package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.SenseConnection;

public class DeleteSenseConnectionCommand extends Command {
	private SenseConnection connection;
	
	public void execute(){
		this.connection.detachSource();
		this.connection.detachTarget();
	}
	
	public void setConnectionModel(Object model){
		if(model instanceof SenseConnection)
			this.connection = (SenseConnection) model;
	}
	
	public void undo(){
		this.connection.attachSource();
		this.connection.attachTarget();
	}
}
