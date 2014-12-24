package paoc.editparts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import paoc.model.ControlConnection;
import paoc.model.Feature;
import paoc.model.SenseConnection;
import paoc.policies.DeleteComponentEditPolicy;

public class FeatureTreeEditPart extends TreeEditPart {
	protected void refreshVisuals(){
		Feature model = (Feature) this.getModel();
		this.setWidgetText(model.getFeatureName());
		this.setWidgetImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT));
	}
	
	public void propertyChange(PropertyChangeEvent event){
		if(event.getPropertyName().equals(Feature.P_TEXT))
			refreshVisuals();
		else if(event.getPropertyName().equals(Feature.P_CHILDREN))
		{
			refreshChildren();
			this.getRoot().getContents().refresh();
		}
	}
	
	protected void createEditPolicies(){
		this.installEditPolicy(EditPolicy.COMPONENT_ROLE, new DeleteComponentEditPolicy());
	}

	protected List<Object> getModelChildren(){
		List<Object> children = new ArrayList<Object>();
		List<?> targetConnections = ((Feature)this.getModel()).getTargetConnections();
		for(int i = 0; i < targetConnections.size(); i++){
			Object connection = targetConnections.get(i);
			if(connection instanceof SenseConnection)
				children.add(((SenseConnection) connection).getSource());
			else if(connection instanceof ControlConnection)
				children.add(((ControlConnection) connection).getSource());
		}
		return children;
	}
}
