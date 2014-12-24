package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.BelongToConnection;
import paoc.model.Feature;
import paoc.model.Owner;

public class CreateBelongToConnectionCommand extends Command {
	private Feature source;
	private Owner target;
	
	private BelongToConnection connection;
	
	
	public boolean canExecute(){
		if(source == null || target == null)
			return false;
		if(source.equals(target))
			return false;
		return true;
	}
	
	public void execute(){
		connection.attachSource();
		connection.attachTarget();
	}
	
	public void setConnection(Object model){
		if(model instanceof BelongToConnection)
			this.connection = (BelongToConnection) model;
	}
	
	public void setSource(Object model){
		if(model instanceof Feature){
			this.source  = (Feature) model;
			connection.setSource(source);
		}
	}
	
	public void setTarget(Object model){
		if(model instanceof Owner){
			this.target = (Owner) model;
			connection.setTarget(target);
		}
	}
	
	public void undo(){
		connection.detachSource();
		connection.detachTarget();
	}

}
