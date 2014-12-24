package paoc.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import paoc.commands.DeleteBelongToConnectionCommand;
import paoc.commands.DeleteControlConnectionCommand;
import paoc.commands.DeleteLocateInConnectionCommand;
import paoc.commands.DeleteSenseConnectionCommand;
import paoc.model.BelongToConnection;
import paoc.model.ControlConnection;
import paoc.model.LocateInConnection;
import paoc.model.SenseConnection;

public class PAOCConnectionEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		// TODO Auto-generated method stub
		Object model = this.getHost().getModel();
		
		if(model instanceof LocateInConnection){
			DeleteLocateInConnectionCommand command = new DeleteLocateInConnectionCommand();
			command.setConnectionModel(model);
			return command;
		}
		else if(model instanceof SenseConnection){
			DeleteSenseConnectionCommand command = new DeleteSenseConnectionCommand();
			command.setConnectionModel(model);
			return command;
		}
		else if(model instanceof ControlConnection){
			DeleteControlConnectionCommand command = new DeleteControlConnectionCommand();
			command.setConnectionModel(model);
			return command;
		}
		else if(model instanceof BelongToConnection){
			DeleteBelongToConnectionCommand command = new DeleteBelongToConnectionCommand();
			command.setConnectionModel(model);
			return command;
		}
		
		return null;
	}

}
