package paoc.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import paoc.model.Feature;

public class FeatureChangeConstraintCommand extends AbstractLayoutCommand{
	private Feature model;
	private Rectangle constraint;
	private Rectangle oldConstraint;
	
	public void execute(){
		this.model.setConstraint(constraint);
	}

	public void setModel(Object model) {
		if(model instanceof Feature){
			this.model = (Feature) model;
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
