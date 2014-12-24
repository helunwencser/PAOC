package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.ContentsModel;
import paoc.model.Feature;

public class FeatureCreateCommand extends Command {
	private ContentsModel contentsModel;
	private Feature model;
	
	public void execute(){
		this.contentsModel.addChild(this.model);
	}
	
	public void setContentsModel(Object model){
		if(model instanceof ContentsModel)
			this.contentsModel = (ContentsModel)model;
	}
	
	public void setModel(Object model){
		if(model instanceof Feature)
			this.model = (Feature)model;
	}
	
	public void undo(){
		this.contentsModel.removeChild(this.model);
	}

}
