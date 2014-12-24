package paoc.editparts;

import java.beans.PropertyChangeEvent;

import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import paoc.model.Actuator;
import paoc.policies.DeleteComponentEditPolicy;

public class ActuatorTreeEditPart extends TreeEditPart {
	protected void refreshVisuals(){
		Actuator model = (Actuator) this.getModel();
		this.setWidgetText(model.getActuatorType());
		this.setWidgetImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT));
	}
	
	public void propertyChange(PropertyChangeEvent event){
		if(event.getPropertyName().equals(Actuator.P_TEXT))
			refreshVisuals();
	}
	
	protected void createEditPolicies(){
		this.installEditPolicy(EditPolicy.COMPONENT_ROLE, new DeleteComponentEditPolicy());
	}

}
