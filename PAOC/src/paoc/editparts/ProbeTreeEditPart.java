package paoc.editparts;

import java.beans.PropertyChangeEvent;

import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import paoc.model.Probe;
import paoc.policies.DeleteComponentEditPolicy;

public class ProbeTreeEditPart extends TreeEditPart {
	protected void refreshVisuals(){
		Probe model = (Probe) this.getModel();
		this.setWidgetText(model.getProbeType());
		this.setWidgetImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT));
	}
	
	public void propertyChange(PropertyChangeEvent event){
		if(event.getPropertyName().equals(Probe.P_TEXT))
			refreshVisuals();
	}
	
	protected void createEditPolicies(){
		this.installEditPolicy(EditPolicy.COMPONENT_ROLE, new DeleteComponentEditPolicy());
	}

}
