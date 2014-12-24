package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.BelongToConnection;

public class DeleteBelongToConnectionCommand extends Command {
	private BelongToConnection connection;
	
	public void execute(){
		this.connection.detachSource();
		this.connection.detachTarget();
	}
	
	public void setConnectionModel(Object model){
		if(model instanceof BelongToConnection)
			this.connection = (BelongToConnection) model;
	}
	
	public void undo(){
		this.connection.attachSource();
		this.connection.attachTarget();
	}
}
