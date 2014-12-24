package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.Location;

public class LocationDirectEditCommand extends Command {
	private String oldText, newText;
	private Location model;
	
	public void execute(){
		this.oldText = model.getOwnerName();
		model.setOwnerName(this.newText);
	}
	
	public void setModel(Object model){
		if(model instanceof Location)
			this.model = (Location)model;
	}
	
	public void setText(String text){
		this.newText = text;
	}
	
	public void undo(){
		this.model.setOwnerName(oldText);
	}
}
