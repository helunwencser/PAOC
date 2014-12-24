package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.ContentsModel;
import paoc.model.Probe;

public class ProbeCreateCommand extends Command {
	private ContentsModel contentsModel;
	private Probe model;
	
	public void execute(){
		this.contentsModel.addChild(this.model);
	}
	
	public void setContentsModel(Object model){
		if(model instanceof ContentsModel)
			this.contentsModel = (ContentsModel)model;
	}
	
	public void setModel(Object model){
		if(model instanceof Probe)
			this.model = (Probe)model;
	}
	
	public void undo(){
		this.contentsModel.removeChild(this.model);
	}

}
