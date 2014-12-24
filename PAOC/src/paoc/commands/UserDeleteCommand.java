package paoc.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;

import paoc.model.BelongToConnection;
import paoc.model.ContentsModel;
import paoc.model.LocateInConnection;
import paoc.model.User;

public class UserDeleteCommand extends Command{
	private ContentsModel contentsModel;
	private User model;
	
	private List<Object> soruceConnections = new ArrayList<Object>();
	private List<Object> targetConnections = new ArrayList<Object>();
	
	
	public void execute(){
		this.soruceConnections.addAll(model.getSourceConnections());
		this.targetConnections.addAll(model.getTargetConnections());
		
		for(int i = 0; i < this.soruceConnections.size(); i++){
			LocateInConnection locateInConnection = (LocateInConnection) this.soruceConnections.get(i);
			locateInConnection.detachSource();
			locateInConnection.detachTarget();
		}
		
		for(int i = 0; i < this.targetConnections.size(); i++){
			Object model = this.targetConnections.get(i);
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
		if(model instanceof User)
			this.model = (User) model;	
	}
	
	public void undo(){
		this.contentsModel.addChild(this.model);
		
		for(int i = 0; i < this.soruceConnections.size(); i++){
			LocateInConnection locateInConnection = (LocateInConnection) this.soruceConnections.get(i);
			locateInConnection.attachSource();
			locateInConnection.attachTarget();
		}
		
		for(int i = 0; i < this.targetConnections.size(); i++){
			Object model = this.targetConnections.get(i);
			if(model instanceof LocateInConnection)
			{
				((LocateInConnection) model).attachSource();
				((LocateInConnection) model).attachTarget();
			}
			else if(model instanceof BelongToConnection){
				((BelongToConnection) model).attachSource();
				((BelongToConnection) model).attachTarget();
			}
		}
		
		this.soruceConnections.clear();
		this.targetConnections.clear();
	}
}
