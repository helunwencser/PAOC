package paoc.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import paoc.model.Actuator;
import paoc.model.BelongToConnection;
import paoc.model.ContentsModel;
import paoc.model.ControlConnection;
import paoc.model.Device;
import paoc.model.Feature;
import paoc.model.LocateInConnection;
import paoc.model.Location;
import paoc.model.Probe;
import paoc.model.SenseConnection;
import paoc.model.User;

public class PartFactory implements EditPartFactory{

	private EditPart getPartForElement(Object modelElement){
		if(modelElement instanceof ContentsModel)
			return new ContentsEditPart();
		else if(modelElement instanceof Feature)
			return new FeatureEditPart();
		else if(modelElement instanceof Probe)
			return new ProbeEditPart();
		else if(modelElement instanceof Actuator)
			return new ActuatorEditPart();
		else if(modelElement instanceof Location)
			return new LocationEditPart();
		else if(modelElement instanceof User)
			return new UserEditPart();
		else if(modelElement instanceof Device)
			return new DeviceEditPart();
		else if(modelElement instanceof LocateInConnection)
			return new LocateInConnectionEditPart();
		else if(modelElement instanceof SenseConnection)
			return new SenseConnectionEditPart();
		else if(modelElement instanceof ControlConnection)
			return new ControlConnectionEditPart();
		else if(modelElement instanceof BelongToConnection)
			return new BelongToConnectionEditPart();

		

		throw new RuntimeException(
				"Can't create part for model element: "
				+ ((modelElement != null) ? modelElement.getClass().getName() : "null"));
	}
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		// TODO Auto-generated method stub
		EditPart part = getPartForElement(model);
		part.setModel(model);
		return part;
	}

}
