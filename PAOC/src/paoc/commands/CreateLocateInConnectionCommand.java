package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.LocateInConnection;
import paoc.model.Owner;

public class CreateLocateInConnectionCommand extends Command {
	private Owner source, target;
	
	private LocateInConnection connection;
	
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
		if(model instanceof LocateInConnection)
			this.connection = (LocateInConnection) model;
	}
	
	public void setSource(Object model){
		if(model instanceof Owner){
			this.source  = (Owner) model;
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
