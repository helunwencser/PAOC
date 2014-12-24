package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.LocateInConnection;
import paoc.model.Owner;

public class ReconnectLocateInConnectionCommand extends Command{
	private LocateInConnection connection;
	private Owner oldSource,oldTarget;
	private Owner newSource = null,newTarget = null;
	
	
	public Owner getNewSource() {
		return newSource;
	}

	public void setNewSource(Object object) {
		if(object instanceof Owner){
			newSource = (Owner) object;
			newTarget = connection.getTarget();
		}
	}

	public Owner getNewTarget() {
		return newTarget;
	}

	public void setNewTarget(Object object) {
		if(object instanceof Owner){
			newSource = connection.getSource();
			newTarget = (Owner) object;
		}
	}

	public void execute(){
		if(this.newSource != null && this.newTarget != null){
			oldSource = connection.getSource();
			oldTarget = connection.getTarget();
			connection.detachSource();
			connection.detachTarget();
			connection.setSource(newSource);
			connection.setTarget(newTarget);
			connection.attachSource();
			connection.attachTarget();
		}
	}
	
	public void setConnectionModel(Object model){
		if(model instanceof LocateInConnection)
			connection = (LocateInConnection)model;
	}
	
	public void undo(){		
		if(this.newSource != null && this.newTarget != null){
			connection.detachSource();
			connection.detachTarget();
			connection.setSource(oldSource);
			connection.setTarget(oldTarget);
			connection.attachSource();
			connection.attachTarget();
		}
	}
}
