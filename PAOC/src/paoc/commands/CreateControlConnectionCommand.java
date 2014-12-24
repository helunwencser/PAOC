package paoc.commands;

import javax.swing.JOptionPane;

import org.eclipse.gef.commands.Command;

import paoc.model.Actuator;
import paoc.model.ControlConnection;
import paoc.model.Feature;

public class CreateControlConnectionCommand extends Command {
	private Actuator source;
	private Feature target;
	
	private ControlConnection connection;
	
	
	public boolean canExecute(){
		if(source == null || target == null)
			return false;
		if(source.equals(target))
			return false;
		return true;
	}
	
	public void execute(){
		if(this.connection.isIfMatch()){
			connection.attachSource();
			connection.attachTarget();			
		}
		else{
			JOptionPane.showMessageDialog(null, "Actuator type is not matched with feature type", 
					"Erroe", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setConnection(Object model){
		if(model instanceof ControlConnection)
			this.connection = (ControlConnection) model;
	}
	
	public void setSource(Object model){
		if(model instanceof Actuator){
			this.source  = (Actuator) model;
			connection.setSource(source);
		}
	}
	
	public void setTarget(Object model){
		if(model instanceof Feature){
			this.target = (Feature) model;
			connection.setTarget(target);
		}
	}
	
	public void undo(){
		if(this.connection.isIfMatch()){
			connection.detachSource();
			connection.detachTarget();			
		}
	}
}
