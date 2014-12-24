package paoc.commands;

import javax.swing.JOptionPane;

import org.eclipse.gef.commands.Command;

import paoc.model.Actuator;

public class ActuatorDirectEditCommand extends Command {
	private String oldText, newText;
	private Actuator model;
	
	public void execute(){
		if(model.ifNewNameValid(newText)){
			if(model.ifNewNameMatch(newText)){
				this.oldText = model.getActuatorType();
				model.setActuatorType(this.newText);			
			}
			else{
				JOptionPane.showMessageDialog(null, "The new actuator type is not matched with feature type", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "The new actuator type is invalid", 
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setModel(Object model){
		if(model instanceof Actuator)
			this.model = (Actuator)model;
	}
	
	public void setText(String text){
		this.newText = text;
	}
	
	public void undo(){
		if(model.ifNewNameValid(this.newText)){
			if(model.ifNewNameMatch(this.newText))
				this.model.setActuatorType(oldText);
		}
	}
}
