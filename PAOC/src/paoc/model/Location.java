package paoc.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import paoc.helper.INodeInitialName;
import paoc.helper.INodeType;

public class Location extends Owner{
	public static final String type = INodeType.LOCATION;
	public static final String initialName = INodeInitialName.LOCATION;
	
	public static final String P_CHILDREN = "_children_location";
	
	private Rectangle constraint;
	
	public static final String P_CONSTRAINT = "_constraint_location";
	public static final String P_TEXT = "_textLocation";
	
	
	public static final String P_SOURCE_LOCATEIN_CONNECTION = "_source_locateIn_connection_user";
	public static final String P_TARGET_LOCATEIN_CONNECTION = "_target_locateIn_connection_user";
	
	public static final String P_TARGET_BELONGTO_CONNECTION = "_target_belongTo_connection_user";
	
	protected List<LocateInConnection> sourceConnection = new ArrayList<LocateInConnection>();
	protected List<Object> targetConnection = new ArrayList<Object>();	
	
	public void addSourceConnection(Object connx){
		if(connx instanceof LocateInConnection){
			this.sourceConnection.add((LocateInConnection) connx);
			this.firePropertyChange(Location.P_SOURCE_LOCATEIN_CONNECTION, null, null);	
		}
	}
	
	public void addTargetConnection(Object connx){
		this.targetConnection.add(connx);
		if(connx instanceof LocateInConnection)
			this.firePropertyChange(P_TARGET_LOCATEIN_CONNECTION, null, null);
		else if(connx instanceof BelongToConnection)
			this.firePropertyChange(P_TARGET_BELONGTO_CONNECTION, null, null);
	}
	
	public List<LocateInConnection> getSourceConnections(){
		return this.sourceConnection;
	}
	
	public List<Object> getTargetConnections(){
		return this.targetConnection;
	}
	
	public void removeSourceConnection(Object connx){
		this.sourceConnection.remove(connx);
		this.firePropertyChange(Location.P_SOURCE_LOCATEIN_CONNECTION, null, null);
	}
	
	public void removeTargetConnection(Object connx){
		this.targetConnection.remove(connx);
		if(connx instanceof LocateInConnection)
			this.firePropertyChange(P_TARGET_LOCATEIN_CONNECTION, null, null);
		else if(connx instanceof BelongToConnection)
			this.firePropertyChange(P_TARGET_BELONGTO_CONNECTION, null, null);
	}
		
	public Rectangle getConstraint() {
		return constraint;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
		this.firePropertyChange(P_CONSTRAINT, null, constraint);
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return this.ownerName;
	}

	@Override
	public void setOwnerName(String ownerName) {
		// TODO Auto-generated method stub
		this.ownerName = ownerName;
		this.firePropertyChange(P_TEXT, null, ownerName);
	}
	
	public IPropertyDescriptor[] getPropertyDescriptors(){
		IPropertyDescriptor[] descriptors = new IPropertyDescriptor[]{
				new TextPropertyDescriptor(Feature.P_TEXT,"Feature name")
		};
		return descriptors;
	}
	
	public Object getPropertyValue(Object id){
		if(id.equals(Feature.P_TEXT))
			return this.ownerName;
		return null;
	}
	
	public boolean isProperySet(Object id){
		if(id.equals(Feature.P_TEXT))
			return true;
		else
			return false;
	}
	
	public void setPropertyValue(Object id,Object value){
		if(id.equals(Feature.P_TEXT))
			this.setOwnerName((String)value);
	}

	public void firePropertyChangeChildren(){
		this.firePropertyChange(P_CHILDREN, null, null);
	}
}
