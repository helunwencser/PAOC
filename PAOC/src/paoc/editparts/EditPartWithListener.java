package paoc.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import paoc.model.AbstractModel;

public class EditPartWithListener extends AbstractGraphicalEditPart implements
		PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub

	}

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}
	
	public void activate(){
		super.activate();
		((AbstractModel)getModel()).addPropertyChangeListener(this);
	}

	public void deactivate(){
		super.deactivate();
		((AbstractModel)getModel()).removePropertyChangeListener(this);
	}
}
