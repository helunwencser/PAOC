package paoc.commands;

import javax.swing.JOptionPane;

import org.eclipse.gef.commands.Command;

import paoc.actions.IfMatch;
import paoc.model.Actuator;
import paoc.model.ControlConnection;
import paoc.model.Feature;

public class ReconnectControlConnectionCommand extends Command{
	private ControlConnection connection;
	private Actuator oldSource;
	private Feature oldTarget;
	private Actuator newSource = null;
	private Feature newTarget = null;
	
	
	public Actuator getNewSource() {
		return newSource;
	}

	public void setNewSource(Object object) {
		if(object instanceof Actuator){
			newSource = (Actuator) object;
			newTarget = connection.getTarget();
		}
	}

	public Feature getNewTarget() {
		return newTarget;
	}

	public void setNewTarget(Object object) {
		if(object instanceof Feature){
			newSource = connection.getSource();
			newTarget = (Feature) object;
		}
	}

	public void execute(){
		if(this.newSource != null && this.newTarget != null){
			if(IfMatch.isIfActuatorMatchesFeature(this.newSource.getActuatorType(), this.newTarget.getFeatureName())){
				oldSource = connection.getSource();
				oldTarget = connection.getTarget();
				connection.detachSource();
				connection.detachTarget();
				connection.setSource(newSource);
				connection.setTarget(newTarget);
				connection.attachSource();
				connection.attachTarget();
			}
			else{
				JOptionPane.showMessageDialog(null, "Actuator type is not matched with feature type", 
						"Erroe", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void setConnectionModel(Object model){
		if(model instanceof ControlConnection)
			connection = (ControlConnection)model;
	}
	
	public void undo(){
		if(this.newSource != null && this.newTarget != null){
			if(IfMatch.isIfActuatorMatchesFeature(this.newSource.getActuatorType(), this.newTarget.getFeatureName())){
				connection.detachSource();
				connection.detachTarget();
				connection.setSource(oldSource);
				connection.setTarget(oldTarget);
				connection.attachSource();
				connection.attachTarget();
			}
		}
	}
}
