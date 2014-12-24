package paoc.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import paoc.commands.AbstractLayoutCommand;
import paoc.commands.ActuatorChangeConstraintCommand;
import paoc.commands.ActuatorCreateCommand;
import paoc.commands.DeviceChangeConstraintCommand;
import paoc.commands.DeviceCreateCommand;
import paoc.commands.FeatureChangeConstraintCommand;
import paoc.commands.FeatureCreateCommand;
import paoc.commands.LocationChangeConstraintCommand;
import paoc.commands.LocationCreateCommand;
import paoc.commands.ProbeChangeConstraintCommand;
import paoc.commands.ProbeCreateCommand;
import paoc.commands.UserChangeConstraintCommand;
import paoc.commands.UserCreateCommand;
import paoc.editparts.ActuatorEditPart;
import paoc.editparts.DeviceEditPart;
import paoc.editparts.FeatureEditPart;
import paoc.editparts.LocationEditPart;
import paoc.editparts.ProbeEditPart;
import paoc.editparts.UserEditPart;
import paoc.model.Actuator;
import paoc.model.Device;
import paoc.model.Feature;
import paoc.model.Location;
import paoc.model.Probe;
import paoc.model.User;


public class EditLayoutPolicy extends XYLayoutEditPolicy{

	protected Command createChangeConstraintCommand(EditPart child, Object constraint){
		AbstractLayoutCommand command = null;
		
		if(child instanceof FeatureEditPart){
			command = new FeatureChangeConstraintCommand();
		}
		else if(child instanceof ProbeEditPart){
			command = new ProbeChangeConstraintCommand();
		}
		else if(child instanceof ActuatorEditPart){
			command = new ActuatorChangeConstraintCommand();
		}
		else if(child instanceof UserEditPart){
			command = new UserChangeConstraintCommand();
		}
		else if(child instanceof LocationEditPart){
			command = new LocationChangeConstraintCommand();
		}
		else if(child instanceof DeviceEditPart){
			command = new DeviceChangeConstraintCommand();
		}

		command.setModel(child.getModel());
		command.setConstraint((Rectangle)constraint);
		return command;
	}
	
	protected Command createAddCommand(EditPart child, Object constraint){
		return null;
	}
	
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// TODO Auto-generated method stub

		Rectangle constraint = (Rectangle)this.getConstraintFor(request);
		
		Object model = request.getNewObject();
		
		if(model instanceof Feature){
			((Feature) model).setConstraint(constraint);
			((Feature) model).setFeatureName(Feature.initialName);
			FeatureCreateCommand command = new FeatureCreateCommand();
			command.setContentsModel(this.getHost().getModel());
			command.setModel(model);
			return command;
		}
		else if(model instanceof Probe){
			((Probe) model).setConstraint(constraint);
			((Probe) model).setProbeType(Probe.initialName);
			ProbeCreateCommand command = new ProbeCreateCommand();
			command.setContentsModel(this.getHost().getModel());
			command.setModel(model);
			return command;
		}
		else if(model instanceof Actuator){
			((Actuator) model).setConstraint(constraint);
			((Actuator) model).setActuatorType(Actuator.initialName);
			ActuatorCreateCommand command = new ActuatorCreateCommand();
			command.setContentsModel(this.getHost().getModel());
			command.setModel(model);
			return command;
		}
		else if(model instanceof User){
			((User) model).setConstraint(constraint);
			((User) model).setOwnerName(User.initialName);
			UserCreateCommand command = new UserCreateCommand();
			command.setContentsModel(this.getHost().getModel());
			command.setModel(model);
			return command;
		}
		else if(model instanceof Location){
			((Location) model).setConstraint(constraint);
			((Location) model).setOwnerName(Location.initialName);
			LocationCreateCommand command = new LocationCreateCommand();
			command.setContentsModel(this.getHost().getModel());
			command.setModel(model);
			return command;
		}
		else if(model instanceof Device){
			((Device) model).setConstraint(constraint);
			((Device) model).setOwnerName(Device.initialName);
			DeviceCreateCommand command = new DeviceCreateCommand();
			command.setContentsModel(this.getHost().getModel());
			command.setModel(model);
			return command;
		}
		return null;
}
	
	protected Command getDeleteDependantCommand(Request requsest){
		return null;
	}

}
