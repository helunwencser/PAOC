package paoc.commands;

import javax.swing.JOptionPane;

import org.eclipse.gef.commands.Command;

import paoc.model.Probe;

public class ProbeDirectEditCommand extends Command {
	private String oldText, newText;
	private Probe model;
	
	public void execute(){
		if(model.ifNewNameValid(newText)){
			if(model.ifNewNameMatch(this.newText)){
				this.oldText = model.getProbeType();
				model.setProbeType(this.newText);
			}
			else{
				JOptionPane.showMessageDialog(null, "The new probe type is not matched with feature type", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "The new probe type is invalid", 
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void setModel(Object model){
		if(model instanceof Probe)
			this.model = (Probe)model;
	}
	
	public void setText(String text){
		this.newText = text;
	}
	
	public void undo(){
		if(model.ifNewNameMatch(this.newText))
			this.model.setProbeType(oldText);
	}
}
