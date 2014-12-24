package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.Device;

public class DeviceDirectEditCommand extends Command {
	private String oldText, newText;
	private Device model;
	
	public void execute(){
		this.oldText = model.getOwnerName();
		model.setOwnerName(this.newText);
	}
	
	public void setModel(Object model){
		if(model instanceof Device)
			this.model = (Device)model;
	}
	
	public void setText(String text){
		this.newText = text;
	}
	
	public void undo(){
		this.model.setOwnerName(oldText);
	}
}
