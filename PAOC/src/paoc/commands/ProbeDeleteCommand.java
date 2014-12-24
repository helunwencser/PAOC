package paoc.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;

import paoc.model.ContentsModel;
import paoc.model.Probe;
import paoc.model.SenseConnection;

public class ProbeDeleteCommand extends Command{
	private ContentsModel contentsModel;
	private Probe model;
	
	private List<SenseConnection> sourceConnections = new ArrayList<SenseConnection>();
	
	public void execute(){
		this.sourceConnections.addAll(model.getSourceConnections());
		
		for(int i = 0; i < this.sourceConnections.size(); i++){
			SenseConnection model = (SenseConnection) this.sourceConnections.get(i);
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
		if(model instanceof Probe)
			this.model = (Probe) model;
	}
	
	public void undo(){
		this.contentsModel.addChild(this.model);
		
		for(int i = 0; i < this.sourceConnections.size(); i++){
			SenseConnection model = (SenseConnection) this.sourceConnections.get(i);
			model.attachSource();
			model.attachTarget();
		}
		
		this.sourceConnections.clear();
	}
	
}
