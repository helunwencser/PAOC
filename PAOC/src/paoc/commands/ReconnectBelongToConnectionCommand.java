package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.BelongToConnection;
import paoc.model.Feature;
import paoc.model.Owner;

public class ReconnectBelongToConnectionCommand extends Command{
	private BelongToConnection connection;
	private Feature oldSource;
	private Owner oldTarget;
	private Feature newSource = null;
	private Owner newTarget = null;
	
	
	public Feature getNewSource() {
		return newSource;
	}

	public void setNewSource(Object object) {
		if(object instanceof Feature){
			newSource = (Feature) object;
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
		if(model instanceof BelongToConnection)
			connection = (BelongToConnection)model;
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
