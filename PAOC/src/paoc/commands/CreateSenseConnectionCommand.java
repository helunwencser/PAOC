package paoc.commands;

import javax.swing.JOptionPane;

import org.eclipse.gef.commands.Command;

import paoc.model.Feature;
import paoc.model.Probe;
import paoc.model.SenseConnection;

public class CreateSenseConnectionCommand extends Command {
	private Probe source;
	private Feature target;
	
	private SenseConnection connection;
	
	public boolean canExecute(){
		if(this.source == null || this.target == null)
			return false;
		if(source.equals(target))
			return false;
		return true;
	}
	
	public void execute(){
		if(this.connection.isIfMatch()){
			this.connection.attachSource();
			this.connection.attachTarget();	
		}
		else{
			JOptionPane.showMessageDialog(null, "Probe type is not matched with feature type", 
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setConnection(Object model){
		if(model instanceof SenseConnection)
			this.connection = (SenseConnection) model;
	}
	
	public void setSource(Object model){
		if(model instanceof Probe){
			this.source = (Probe) model;
			this.connection.setSource(source);
		}
	}

	public void setTarget(Object model){
		if(model instanceof Feature){
			this.target = (Feature) model;
			this.connection.setTarget(target);
		}
	}
	
	public void undo(){
		if(this.connection.isIfMatch()){
			this.connection.detachSource();
			this.connection.detachTarget();			
		}

	}
}
