package paoc.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import paoc.commands.ActuatorDeleteCommand;
import paoc.commands.DeviceDeleteCommand;
import paoc.commands.FeatureDeleteCommand;
import paoc.commands.LocationDeleteCommand;
import paoc.commands.ProbeDeleteCommand;
import paoc.commands.UserDeleteCommand;
import paoc.model.Actuator;
import paoc.model.Device;
import paoc.model.Feature;
import paoc.model.Location;
import paoc.model.Probe;
import paoc.model.User;

public class DeleteComponentEditPolicy extends ComponentEditPolicy {
	
	protected Command createDeleteCommand(GroupRequest deleteRequest){

		if(this.getHost().getModel() instanceof Feature){
			FeatureDeleteCommand command = new FeatureDeleteCommand();
			command.setContentsModel(this.getHost().getParent().getModel());
			command.setModel(this.getHost().getModel());
			return command;
		}
		else if(this.getHost().getModel() instanceof Probe){
			ProbeDeleteCommand command = new ProbeDeleteCommand();
			command.setContentsModel(this.getHost().getParent().getModel());
			command.setModel(this.getHost().getModel());
			return command;
		}
		else if(this.getHost().getModel() instanceof Actuator){
			ActuatorDeleteCommand command = new ActuatorDeleteCommand();
			command.setContentsModel(this.getHost().getParent().getModel());
			command.setModel(this.getHost().getModel());
			return command;
		}
		else if(this.getHost().getModel() instanceof User){
			UserDeleteCommand command = new UserDeleteCommand();
			command.setContentsModel(this.getHost().getParent().getModel());
			command.setModel(this.getHost().getModel());
			return command;
		}
		else if(this.getHost().getModel() instanceof Location){
			LocationDeleteCommand command = new LocationDeleteCommand();
			command.setContentsModel(this.getHost().getParent().getModel());
			command.setModel(this.getHost().getModel());
			return command;
		}
		else if(this.getHost().getModel() instanceof Device){
			DeviceDeleteCommand command = new DeviceDeleteCommand();
			command.setContentsModel(this.getHost().getParent().getModel());
			command.setModel(this.getHost().getModel());
			return command;
		}
		return null;
	}

}
