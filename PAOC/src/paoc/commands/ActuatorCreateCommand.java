package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.Actuator;
import paoc.model.ContentsModel;

public class ActuatorCreateCommand extends Command {
	private ContentsModel contentsModel;
	private Actuator model;
	
	public void execute(){
		this.contentsModel.addChild(this.model);
	}
	
	public void setContentsModel(Object model){
		if(model instanceof ContentsModel)
			this.contentsModel = (ContentsModel)model;
	}
	
	public void setModel(Object model){
		if(model instanceof Actuator)
			this.model = (Actuator)model;
	}
	
	public void undo(){
		this.contentsModel.removeChild(this.model);
	}

}
