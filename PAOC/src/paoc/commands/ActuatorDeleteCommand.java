package paoc.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;

import paoc.model.Actuator;
import paoc.model.ContentsModel;
import paoc.model.ControlConnection;

public class ActuatorDeleteCommand extends Command{
	private ContentsModel contentsModel;
	private Actuator model;
	
	private List<ControlConnection> sourceConnections = new ArrayList<ControlConnection>();
	
	public void execute(){
		this.sourceConnections.addAll(model.getSourceConnections());
		
		for(int i = 0; i < this.sourceConnections.size(); i++){
			ControlConnection model = this.sourceConnections.get(i);
			model.detachSource();
			model.detachTarget();
		}
		this.contentsModel.removeChild(this.model);
	}

	public void setContentsModel(Object contentsModel) {
		if(contentsModel instanceof ContentsModel)
			this.contentsModel = (ContentsModel) contentsModel;
	}

	public void setModel(Object model) {
		if(model instanceof Actuator)
			this.model = (Actuator) model;
	}
	
	public void undo(){
		this.contentsModel.addChild(this.model);
		
		for(int i = 0; i < this.sourceConnections.size(); i++){
			ControlConnection model = this.sourceConnections.get(i);
			model.attachSource();
			model.attachTarget();
		}
		
		this.sourceConnections.clear();
	}
	
}
