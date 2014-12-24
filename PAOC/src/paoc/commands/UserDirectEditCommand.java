package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.User;

public class UserDirectEditCommand extends Command {
	private String oldText, newText;
	private User model;
	
	public void execute(){
		this.oldText = model.getOwnerName();
		model.setOwnerName(this.newText);
	}
	
	public void setModel(Object model){
		if(model instanceof User)
			this.model = (User)model;
	}
	
	public void setText(String text){
		this.newText = text;
	}
	
	public void undo(){
		this.model.setOwnerName(oldText);
	}
}
