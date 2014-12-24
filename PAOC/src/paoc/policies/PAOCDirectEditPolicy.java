package paoc.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import paoc.commands.ActuatorDirectEditCommand;
import paoc.commands.DeviceDirectEditCommand;
import paoc.commands.FeatureDirectEditCommand;
import paoc.commands.LocationDirectEditCommand;
import paoc.commands.ProbeDirectEditCommand;
import paoc.commands.UserDirectEditCommand;
import paoc.model.Actuator;
import paoc.model.Device;
import paoc.model.Feature;
import paoc.model.Location;
import paoc.model.Probe;
import paoc.model.User;

public class PAOCDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		// TODO Auto-generated method stub
		if(this.getHost().getModel() instanceof Feature){
			FeatureDirectEditCommand command = new FeatureDirectEditCommand();
			command.setModel(this.getHost().getModel());
			command.setText((String)request.getCellEditor().getValue());
			return command;
		}
		else if(this.getHost().getModel() instanceof Probe){
			ProbeDirectEditCommand command = new ProbeDirectEditCommand();
			command.setModel(this.getHost().getModel());
			command.setText((String)request.getCellEditor().getValue());
			return command;
		}
		else if(this.getHost().getModel() instanceof Actuator){
			ActuatorDirectEditCommand command = new ActuatorDirectEditCommand();
			command.setModel(this.getHost().getModel());
			command.setText((String)request.getCellEditor().getValue());
			return command;
		}
		else if(this.getHost().getModel() instanceof Location){
			LocationDirectEditCommand command = new LocationDirectEditCommand();
			command.setModel(this.getHost().getModel());
			command.setText((String)request.getCellEditor().getValue());
			return command;
		}
		else if(this.getHost().getModel() instanceof User){
			UserDirectEditCommand command = new UserDirectEditCommand();
			command.setModel(this.getHost().getModel());
			command.setText((String)request.getCellEditor().getValue());
			return command;
		}
		else if(this.getHost().getModel() instanceof Device){
			DeviceDirectEditCommand command = new DeviceDirectEditCommand();
			command.setModel(this.getHost().getModel());
			command.setText((String)request.getCellEditor().getValue());
			return command;
		}
		
		return null;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		// TODO Auto-generated method stub

	}

}
