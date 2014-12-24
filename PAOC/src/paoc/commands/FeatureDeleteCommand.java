package paoc.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;

import paoc.model.BelongToConnection;
import paoc.model.ContentsModel;
import paoc.model.ControlConnection;
import paoc.model.Feature;
import paoc.model.SenseConnection;

public class FeatureDeleteCommand extends Command{
	private ContentsModel contentsModel;
	private Feature model;
	
	private List<Object> sourceConnections = new ArrayList<Object>();
	private List<Object> targetConnections = new ArrayList<Object>();
	
	public void execute(){
		this.sourceConnections.addAll(model.getSourceConnections());
		this.targetConnections.addAll(model.getTargetConnections());
		
		for(int i = 0; i < this.sourceConnections.size(); i++){
			BelongToConnection model = (BelongToConnection) this.sourceConnections.get(i);
			model.detachSource();
			model.detachTarget();
		}
		
		for(int i = 0; i < this.targetConnections.size(); i++){
			Object model = this.targetConnections.get(i);
			if(model instanceof SenseConnection){
				((SenseConnection) model).detachSource();
				((SenseConnection) model).detachTarget();
			}
			else if(model instanceof ControlConnection){
				((ControlConnection) model).detachSource();
				((ControlConnection) model).detachTarget();
			}
		}
		
		this.contentsModel.removeChild(this.model);
	}

	public void setContentsModel(Object contentsModel) {
		if(contentsModel instanceof ContentsModel)
			this.contentsModel = (ContentsModel) contentsModel;
	}

	public void setModel(Object model) {
		this.model = (Feature) model;
	}
	
	public void undo(){
		this.contentsModel.addChild(this.model);
		
		for(int i = 0; i < this.sourceConnections.size(); i++){
			BelongToConnection model = (BelongToConnection) this.sourceConnections.get(i);
			model.attachSource();
			model.attachTarget();
		}
		
		for(int i = 0; i < this.targetConnections.size(); i++){
			Object model = this.targetConnections.get(i);
			if(model instanceof SenseConnection){
				((SenseConnection) model).attachSource();
				((SenseConnection) model).attachTarget();
			}
			else if(model instanceof ControlConnection){
				((ControlConnection) model).attachSource();
				((ControlConnection) model).attachTarget();
			}
		}
		
		this.sourceConnections.clear();
		this.targetConnections.clear();
	}
	
}
