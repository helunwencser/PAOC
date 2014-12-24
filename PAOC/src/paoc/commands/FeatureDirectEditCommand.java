package paoc.commands;

import javax.swing.JOptionPane;

import org.eclipse.gef.commands.Command;

import paoc.model.Feature;

public class FeatureDirectEditCommand extends Command {
	private String oldText, newText;
	private Feature model;
	
	public void execute(){
		if(model.ifNewNameValid(newText)){
			if(model.ifNewNameMatch(newText)){
				this.oldText = model.getFeatureName();
				model.setFeatureName(this.newText);
			}
			else{
				JOptionPane.showMessageDialog(null, "The new feature type is not matched with probe type or actuator type", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "The new feature type is invalid", 
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setModel(Object model){
		if(model instanceof Feature)
			this.model = (Feature)model;
	}
	
	public void setText(String text){
		this.newText = text;
	}
	
	public void undo(){
		if(model.ifNewNameValid(newText)){
			if(model.ifNewNameMatch(newText))
				this.model.setFeatureName(oldText);
		}
	}
}
