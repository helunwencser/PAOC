package paoc.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import paoc.actions.GetExistedTypeArray;
import paoc.actions.IfMatch;
import paoc.helper.INodeInitialName;
import paoc.helper.INodeType;

public class Actuator extends AbstractModel{
	public static final String type = INodeType.ACTUATOR;
	public static final String initialName = INodeInitialName.ACTUATOR;
	private String actuatorType = INodeInitialName.ACTUATOR;
	private Feature feature;
	private static int ID = 0;
	
	public static final String P_CONSTRAINT = "_constraint_actuator";
	public static final String P_TEXT = "_textActuator";
	public static final String P_SOURCE_CONTROL_CONNECTION = "_source_control_connection_actuator";
	
	private List<ControlConnection> sourceConnection = new ArrayList<ControlConnection>();
	
	private Rectangle constraint;
	
	public void addSourceConnection(Object connx){
		if(connx instanceof ControlConnection){
			this.sourceConnection.add((ControlConnection) connx);
			this.firePropertyChange(P_SOURCE_CONTROL_CONNECTION, null, null);			
		}
	}
	
	public List<ControlConnection> getSourceConnections(){
		return this.sourceConnection;
	}
	
	public void removeSourceConnection(Object connx){
		this.sourceConnection.remove(connx);
		this.firePropertyChange(P_SOURCE_CONTROL_CONNECTION, null, null);
	}
	
	public Rectangle getConstraint() {
		return constraint;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
		this.firePropertyChange(P_CONSTRAINT, null, constraint);
	}

	public Actuator(){
		Actuator.ID ++;
	}

	public String getActuatorType() {
		return actuatorType;
	}

	public void setActuatorType(String actuatorType) {
		this.actuatorType = actuatorType;
		this.firePropertyChange(P_TEXT, null, actuatorType);
	}
	
	public IPropertyDescriptor[] getPropertyDescriptors(){
		IPropertyDescriptor[] descriptors = new IPropertyDescriptor[]{
//				new TextPropertyDescriptor(Feature.P_TEXT,"Actuator type")
				new ComboBoxPropertyDescriptor(P_TEXT, "Probe type", GetExistedTypeArray.getActuatorTypes())
		};
		return descriptors;
	}
	
	public Object getPropertyValue(Object id){
//		if(id.equals(Feature.P_TEXT))
//			return this.actuatorType;
		if(id.equals(P_TEXT)){
			String[] types = GetExistedTypeArray.getActuatorTypes();
			for(int i = 0; i < types.length; i++){
				if(types[i].equals(this.getActuatorType()))
					return new Integer(i);
			}
			JOptionPane.showMessageDialog(null, this.getActuatorType() + " has been deleted", 
					"Warning", JOptionPane.WARNING_MESSAGE);
			this.setPropertyValue(P_TEXT, 0);
			return new Integer(0);
		}
		return null;
	}
	
	public boolean isProperySet(Object id){
		if(id.equals(Feature.P_TEXT))
			return true;
		else
			return false;
	}
	
	public void setPropertyValue(Object id,Object value){
//		if(id.equals(Feature.P_TEXT))
//			this.setActuatorType((String)value);
		if(id.equals(P_TEXT)){
			String[] types = GetExistedTypeArray.getActuatorTypes();
			String newName = types[(Integer)value];
			if(this.ifNewNameMatch(newName))
				this.setActuatorType(types[(Integer)value]);
			else{
				JOptionPane.showMessageDialog(null, "The new actuator type is not matched with feature type", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public static int getID() {
		return ID;
	}
	
	public boolean ifNewNameMatch(String newName){
		if(newName.equals(INodeInitialName.ACTUATOR))
			return true;
		else{
			for(int i = 0; i < this.sourceConnection.size(); i++){
				if(!IfMatch.isIfActuatorMatchesFeature(newName, 
						this.sourceConnection.get(i).getTarget().getFeatureName()))
					return false;
			}
			return true;
		}
	}

	public boolean ifNewNameValid(String newName){
		String[] actuatorTypes = GetExistedTypeArray.getActuatorTypes();
		for(int i = 0; i < actuatorTypes.length; i++){
			if(newName.equals(actuatorTypes[i]))
				return true;
		}
		return false;
	}
}
