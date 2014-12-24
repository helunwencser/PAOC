package paoc.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import paoc.model.Probe;

public class ProbeChangeConstraintCommand extends AbstractLayoutCommand{
	private Probe model;
	private Rectangle constraint;
	private Rectangle oldConstraint;
	
	public void execute(){
		this.model.setConstraint(constraint);
	}

	public void setModel(Object model) {
		if(model instanceof Probe){
			this.model = (Probe) model;
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
