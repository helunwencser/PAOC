package paoc.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;

import paoc.model.BelongToConnection;
import paoc.model.ContentsModel;
import paoc.model.Device;
import paoc.model.LocateInConnection;

public class DeviceDeleteCommand extends Command{
	private ContentsModel contentsModel;
	private Device model;
	
	
	private List<Object> soruceLocateInConnections = new ArrayList<Object>();
	private List<Object> targetLocateInConnections = new ArrayList<Object>();
	
	public void execute(){
		
		this.soruceLocateInConnections.addAll(model.getSourceConnections());
		this.targetLocateInConnections.addAll(model.getTargetConnections());
		
		for(int i = 0; i < this.soruceLocateInConnections.size(); i++){
			LocateInConnection locateInConnection = (LocateInConnection) this.soruceLocateInConnections.get(i);
			locateInConnection.detachSource();
			locateInConnection.detachTarget();
		}
		
		for(int i = 0; i < this.targetLocateInConnections.size(); i++){
			Object model = this.targetLocateInConnections.get(i);
			if(model instanceof LocateInConnection){
				((LocateInConnection) model).detachSource();
				((LocateInConnection) model).detachTarget();
			}
			else if(model instanceof BelongToConnection){
				((BelongToConnection) model).detachSource();
				((BelongToConnection) model).detachTarget();
			}
		}

		this.contentsModel.removeChild(this.model);
	}

	public void setContentsModel(Object contentsModel) {
		if(contentsModel instanceof ContentsModel)
			this.contentsModel = (ContentsModel) contentsModel;
	}

	public void setModel(Object model) {
		if(model instanceof Device)
			this.model = (Device) model;
	}
	
	public void undo(){
		this.contentsModel.addChild(this.model);
		
		for(int i = 0; i < this.soruceLocateInConnections.size(); i++){
			LocateInConnection locateInConnection = (LocateInConnection) this.soruceLocateInConnections.get(i);
			locateInConnection.attachSource();
			locateInConnection.attachTarget();
		}
		
		for(int i = 0; i < this.targetLocateInConnections.size(); i++){
			Object model = this.targetLocateInConnections.get(i);
			if(model instanceof LocateInConnection){
				((LocateInConnection) model).attachSource();
				((LocateInConnection) model).attachTarget();
			}
			else if(model instanceof BelongToConnection){
				((BelongToConnection) model).attachSource();
				((BelongToConnection) model).attachTarget();
			}
		}
		
		this.soruceLocateInConnections.clear();
		this.targetLocateInConnections.clear();
	}
	
}
