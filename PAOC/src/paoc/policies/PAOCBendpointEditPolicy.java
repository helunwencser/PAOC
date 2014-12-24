package paoc.policies;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import paoc.commands.CreateBelongToBendpointCommand;
import paoc.commands.CreateControlBendpointCommand;
import paoc.commands.CreateLocateInBendpointCommand;
import paoc.commands.CreateSenseBendpointCommand;
import paoc.commands.DeleteBelongToBendpointCommand;
import paoc.commands.DeleteControlBendpointCommand;
import paoc.commands.DeleteLocateInBendpointCommand;
import paoc.commands.DeleteSenseBendpointCommand;
import paoc.commands.MoveBelongToBendpointCommand;
import paoc.commands.MoveControlBendpointCommand;
import paoc.commands.MoveLocateInBendpointCommand;
import paoc.commands.MoveSenseBendpointCommand;
import paoc.model.BelongToConnection;
import paoc.model.ControlConnection;
import paoc.model.LocateInConnection;
import paoc.model.SenseConnection;

public class PAOCBendpointEditPolicy extends BendpointEditPolicy {

	@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		// TODO Auto-generated method stub
		Object model = this.getHost().getModel();
		if(model instanceof LocateInConnection){
			Point point = request.getLocation();
			getConnection().translateToRelative(point);
			
			CreateLocateInBendpointCommand command = new CreateLocateInBendpointCommand();
			command.setLocation(point);
			command.setConnection(model);
			command.setIndex(request.getIndex());
			
			return command;
		}
		else if(model instanceof SenseConnection){
			Point point = request.getLocation();
			getConnection().translateToRelative(point);
			
			CreateSenseBendpointCommand command = new CreateSenseBendpointCommand();
			command.setLocation(point);
			command.setConnection(model);
			command.setIndex(request.getIndex());
			
			return command;
		}
		else if(model instanceof ControlConnection){
			Point point = request.getLocation();
			getConnection().translateToRelative(point);
			
			CreateControlBendpointCommand command = new CreateControlBendpointCommand();
			command.setLocation(point);
			command.setConnection(model);
			command.setIndex(request.getIndex());
			
			return command;
		}
		else if(model instanceof BelongToConnection){
			Point point = request.getLocation();
			getConnection().translateToRelative(point);
			
			CreateBelongToBendpointCommand command = new CreateBelongToBendpointCommand();
			command.setLocation(point);
			command.setConnection(model);
			command.setIndex(request.getIndex());
			
			return command;
		}
		
		return null;

	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		// TODO Auto-generated method stub
		Object model = this.getHost().getModel();
		if(model instanceof LocateInConnection){
			DeleteLocateInBendpointCommand command = new DeleteLocateInBendpointCommand();
			command.setConnection(model);
			command.setIndex(request.getIndex());
			
			return command;
		}
		else if(model instanceof SenseConnection){
			DeleteSenseBendpointCommand command = new DeleteSenseBendpointCommand();
			command.setConnection(model);
			command.setIndex(request.getIndex());
			
			return command;
		}
		else if(model instanceof ControlConnection){
			DeleteControlBendpointCommand command = new DeleteControlBendpointCommand();
			command.setConnection(model);
			command.setIndex(request.getIndex());
			
			return command;
		}
		else if(model instanceof BelongToConnection){
			DeleteBelongToBendpointCommand command = new DeleteBelongToBendpointCommand();
			command.setConnection(model);
			command.setIndex(request.getIndex());
			
			return command;
		}
		return null;

	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		// TODO Auto-generated method stub
		Object model = this.getHost().getModel();
		if(model instanceof LocateInConnection){
			Point location = request.getLocation();
			this.getConnection().translateToRelative(location);
			
			MoveLocateInBendpointCommand command = new MoveLocateInBendpointCommand();
			command.setConnection(model);
			command.setIndex(request.getIndex());
			command.setNewLocation(location);
			
			return command;
		}
		else if(model instanceof SenseConnection){
			Point location = request.getLocation();
			this.getConnection().translateToRelative(location);
			
			MoveSenseBendpointCommand command = new MoveSenseBendpointCommand();
			command.setConnection(model);
			command.setIndex(request.getIndex());
			command.setNewLocation(location);
			
			return command;
		}
		else if(model instanceof ControlConnection){
			Point location = request.getLocation();
			this.getConnection().translateToRelative(location);
			
			MoveControlBendpointCommand command = new MoveControlBendpointCommand();
			command.setConnection(model);
			command.setIndex(request.getIndex());
			command.setNewLocation(location);
			
			return command;
		}
		else if(model instanceof BelongToConnection){
			Point location = request.getLocation();
			this.getConnection().translateToRelative(location);
			
			MoveBelongToBendpointCommand command = new MoveBelongToBendpointCommand();
			command.setConnection(model);
			command.setIndex(request.getIndex());
			command.setNewLocation(location);
			
			return command;
		}
		return null;

	}

}
