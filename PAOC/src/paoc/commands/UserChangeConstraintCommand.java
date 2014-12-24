package paoc.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import paoc.model.User;

public class UserChangeConstraintCommand extends AbstractLayoutCommand{
	private User model;
	private Rectangle constraint;
	private Rectangle oldConstraint;
	
	public void execute(){
		this.model.setConstraint(constraint);
	}

	public void setModel(Object model) {
		if(model instanceof User){
			this.model = (User) model;
			this.oldConstraint = this.model.getConstraint();
		}
	}

	@Override
	public void setConstraint(Rectangle rect) {
		// TODO Auto-generated method stub
		this.constraint = rect;
	}
	
	public void undo(){
		this.model.setConstraint(this.oldConstraint);
	}
}
