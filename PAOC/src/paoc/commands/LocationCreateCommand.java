package paoc.commands;

import org.eclipse.gef.commands.Command;

import paoc.model.ContentsModel;
import paoc.model.Location;

public class LocationCreateCommand extends Command {
	private ContentsModel contentsModel;
	private Location model;
	
	public void execute(){
		this.contentsModel.addChild(this.model);
	}
	
	public void setContentsModel(Object model){
		if(model instanceof ContentsModel)
			this.contentsModel = (ContentsModel)model;
	}
	
	public void setModel(Object model){
		if(model instanceof Location)
			this.model = (Location)model;
	}
	
	public void undo(){
		this.contentsModel.removeChild(this.model);
	}

}