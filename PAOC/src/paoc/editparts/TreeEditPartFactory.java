package paoc.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import paoc.model.Actuator;
import paoc.model.ContentsModel;
import paoc.model.Device;
import paoc.model.Feature;
import paoc.model.Location;
import paoc.model.Probe;
import paoc.model.User;

public class TreeEditPartFactory implements EditPartFactory{

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		// TODO Auto-generated method stub
		EditPart part = null;
		
		if(model instanceof ContentsModel)
			part = new ContentsTreeEditPart();
		else if(model instanceof Feature)
			part = new FeatureTreeEditPart();
		else if(model instanceof Probe)
			part = new ProbeTreeEditPart();
		else if(model instanceof Actuator)
			part = new ActuatorTreeEditPart();
		else if(model instanceof Location)
			part = new LocationTreeEditPart();
		else if(model instanceof User)
			part = new UserTreeEditPart();
		else if(model instanceof Device)
			part = new DeviceTreeEditPart();
		
		if(part != null)
			part.setModel(model);
		
		return part;
	}

}
