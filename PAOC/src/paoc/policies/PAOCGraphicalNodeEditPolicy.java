package paoc.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import paoc.commands.CreateBelongToConnectionCommand;
import paoc.commands.CreateControlConnectionCommand;
import paoc.commands.CreateLocateInConnectionCommand;
import paoc.commands.CreateSenseConnectionCommand;
import paoc.commands.ReconnectBelongToConnectionCommand;
import paoc.commands.ReconnectControlConnectionCommand;
import paoc.commands.ReconnectLocateInConnectionCommand;
import paoc.commands.ReconnectSenseConnectionCommand;
import paoc.model.BelongToConnection;
import paoc.model.ControlConnection;
import paoc.model.LocateInConnection;
import paoc.model.SenseConnection;

public class PAOCGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		// TODO Auto-generated method stub
		Command command = request.getStartCommand();
		if(command instanceof CreateLocateInConnectionCommand){
			((CreateLocateInConnectionCommand) command).setTarget(this.getHost().getModel());
			return command;
		}
		else if(command instanceof CreateSenseConnectionCommand){
			((CreateSenseConnectionCommand) command).setTarget(this.getHost().getModel());
			return command;
		}
		else if(command instanceof CreateControlConnectionCommand){
			((CreateControlConnectionCommand) command).setTarget(this.getHost().getModel());
			return command;
		}
		else if(command instanceof CreateBelongToConnectionCommand){
			((CreateBelongToConnectionCommand) command).setTarget(this.getHost().getModel());
			return command;
		}
		//CreateLocateInConnectionCommand command = (CreateLocateInConnectionCommand) request.getStartCommand();
		//command.setTarget(this.getHost().getModel());
		//return command;
		return null;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		// TODO Auto-generated method stub
		Object model = request.getNewObject();
		if(model instanceof LocateInConnection)
		{
			CreateLocateInConnectionCommand command = new CreateLocateInConnectionCommand();
			command.setConnection(model);
			command.setSource(this.getHost().getModel());
			request.setStartCommand(command);
			return command;
		}
		else if(model instanceof SenseConnection){
			CreateSenseConnectionCommand command = new CreateSenseConnectionCommand();
			command.setConnection(model);
			command.setSource(this.getHost().getModel());
			request.setStartCommand(command);
			return command;
		}
		else if(model instanceof ControlConnection){
			CreateControlConnectionCommand command = new CreateControlConnectionCommand();
			command.setConnection(model);
			command.setSource(this.getHost().getModel());
			request.setStartCommand(command);
			return command;
		}
		else if(model instanceof BelongToConnection){
			CreateBelongToConnectionCommand command = new CreateBelongToConnectionCommand();
			command.setConnection(model);
			command.setSource(this.getHost().getModel());
			request.setStartCommand(command);
			return command;
		}
		return null;

	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		Object model = request.getConnectionEditPart().getModel();
		if(model instanceof LocateInConnection){
			ReconnectLocateInConnectionCommand command = new ReconnectLocateInConnectionCommand();
			command.setConnectionModel(model);
			command.setNewTarget(this.getHost().getModel());
			return command;
		}
		else if(model instanceof SenseConnection){
			ReconnectSenseConnectionCommand command = new ReconnectSenseConnectionCommand();
			command.setConnectionModel(model);
			command.setNewTarget(this.getHost().getModel());
			return command;
		}
		else if(model instanceof ControlConnection){
			ReconnectControlConnectionCommand command = new ReconnectControlConnectionCommand();
			command.setConnectionModel(model);
			command.setNewTarget(this.getHost().getModel());
			return command;
		}
		else if(model instanceof BelongToConnection){
			ReconnectBelongToConnectionCommand command = new ReconnectBelongToConnectionCommand();
			command.setConnectionModel(model);
			command.setNewTarget(this.getHost().getModel());
			return command;
		}
		
		return null;

	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		// TODO Auto-generated method stub
		
		Object model = request.getConnectionEditPart().getModel();
		if(model instanceof LocateInConnection){
			ReconnectLocateInConnectionCommand command = new ReconnectLocateInConnectionCommand();
			command.setConnectionModel(model);
			command.setNewSource(this.getHost().getModel());
			return command;
		}
		else if(model instanceof SenseConnection){
			ReconnectSenseConnectionCommand command = new ReconnectSenseConnectionCommand();
			command.setConnectionModel(model);
			command.setNewSource(this.getHost().getModel());
			return command;
		}
		else if(model instanceof ControlConnection){
			ReconnectControlConnectionCommand command = new ReconnectControlConnectionCommand();
			command.setConnectionModel(model);
			command.setNewSource(this.getHost().getModel());
			return command;
		}
		else if(model instanceof BelongToConnection){
			ReconnectBelongToConnectionCommand command = new ReconnectBelongToConnectionCommand();
			command.setConnectionModel(model);
			command.setNewSource(this.getHost().getModel());
			return command;
		}
		return null;
	}

}
