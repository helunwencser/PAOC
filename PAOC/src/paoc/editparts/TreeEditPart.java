package paoc.editparts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.gef.editparts.AbstractTreeEditPart;

import paoc.model.AbstractModel;

public class TreeEditPart extends AbstractTreeEditPart implements PropertyChangeListener {

	public void activate(){
		super.activate();
		((AbstractModel)this.getModel()).addPropertyChangeListener(this);
	}
	
	public void deactivate(){
		((AbstractModel)this.getModel()).removePropertyChangeListener(this);
		super.deactivate();
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub

	}

}
