package paoc.commands;

import javax.swing.JOptionPane;

import org.eclipse.gef.commands.Command;

import paoc.actions.IfMatch;
import paoc.model.Feature;
import paoc.model.Probe;
import paoc.model.SenseConnection;

public class ReconnectSenseConnectionCommand extends Command{
	private SenseConnection connection;
	private Probe oldSource;
	private Feature oldTarget;
	private Probe newSource = null;
	private Feature newTarget = null;
	
	
	public Probe getNewSource() {
		return newSource;
	}

	public void setNewSource(Object object) {
		if(object instanceof Probe){
			newSource = (Probe) object;
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
			if(IfMatch.isIfProbeMathesFeature(this.newSource.getProbeType(), this.newTarget.getFeatureName())){
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
				JOptionPane.showMessageDialog(null, "Probe type is not matched with feature type", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}

	}
	
	public void setConnectionModel(Object model){
		if(model instanceof SenseConnection)
			connection = (SenseConnection)model;
	}
	
	public void undo(){	
		if(this.newSource != null && this.newTarget != null){
			if(IfMatch.isIfProbeMathesFeature(this.newSource.getProbeType(), this.newTarget.getFeatureName())){
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
