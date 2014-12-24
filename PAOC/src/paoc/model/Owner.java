package paoc.model;

import java.util.List;

public abstract class Owner extends AbstractModel{
	protected String ownerName;
	
	public abstract String getOwnerName();
	
	public abstract void setOwnerName(String ownerName);
	
	public abstract void addSourceConnection(Object connx);
	
	public abstract void addTargetConnection(Object connx);
	
	public abstract List<LocateInConnection> getSourceConnections();
	
	public abstract List<Object> getTargetConnections();
	
	public abstract void removeSourceConnection(Object connx);
	
	public abstract void removeTargetConnection(Object connx);
}
