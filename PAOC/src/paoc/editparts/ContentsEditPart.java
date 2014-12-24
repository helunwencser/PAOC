package paoc.editparts;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;

import paoc.model.ContentsModel;
import paoc.policies.EditLayoutPolicy;

public class ContentsEditPart extends EditPartWithListener {

	public void propertyChange(PropertyChangeEvent event){
		if(event.getPropertyName().equals(ContentsModel.P_CHILDREN))
			refreshChildren();
	}
	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		Layer figure = new Layer();
		figure.setLayoutManager(new XYLayout());
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		this.installEditPolicy(EditPolicy.LAYOUT_ROLE, new EditLayoutPolicy());
		this.installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}

	protected List<?> getModelChildren(){
		return ((ContentsModel)getModel()).getChildren();
	}
}
