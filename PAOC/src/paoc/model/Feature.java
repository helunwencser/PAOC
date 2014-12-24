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

public class Feature extends AbstractModel{
	public static final String type = INodeType.FEATURE;
	public static final String initialName = INodeInitialName.FEATURE;
	private String featureName = INodeInitialName.FEATURE;
	private Probe probe;
	private Actuator actuator;
	private Owner owner;
	
	public static final String P_CHILDREN = "_children_feature";
	
	public static final String P_CONSTRAINT = "_constraint_feature";
	public static final String P_TEXT = "_textFeature";
	
	public static final String P_TARGET_SENSE_CONNECTION = "_target_sense_connection_feature";
	public static final String P_TARGET_CONTROL_CONNECTION = "_target_control_connection_feature";
	
	public static final String P_SOURCE_BELONGTO_CONNECTION = "_source_belongTo_connection_feature";
	
	private List<BelongToConnection> sourceConnection = new ArrayList<BelongToConnection>();
	private List<Object> targetConnection = new ArrayList<Object>();
	
	private Rectangle constraint;
	
	public Rectangle getConstraint() {
		return constraint;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
		this.firePropertyChange(P_CONSTRAINT, null, constraint);
	}
	
	public void addSourceConnection(Object connx){
		if(connx instanceof BelongToConnection){
			this.sourceConnection.add((BelongToConnection) connx);
			this.firePropertyChange(P_SOURCE_BELONGTO_CONNECTION, null, null);
		}
	}
	
	public void addTargetConnection(Object connx){
		this.targetConnection.add(connx);
		if(connx instanceof SenseConnection)
			this.firePropertyChange(P_TARGET_SENSE_CONNECTION, null, null);
		else if(connx instanceof ControlConnection)
			this.firePropertyChange(P_TARGET_CONTROL_CONNECTION, null, null);
	}
	
	public List<BelongToConnection> getSourceConnections(){
		return this.sourceConnection;
	}
	
	public List<Object> getTargetConnections(){
		return this.targetConnection;
	}

	public void removeSourceConnection(Object connx){
		this.sourceConnection.remove(connx);
		this.firePropertyChange(P_SOURCE_BELONGTO_CONNECTION, null, null);
	}
	
	public void removeTargetConnection(Object connx){
		this.targetConnection.remove(connx);
		if(connx instanceof SenseConnection)
			this.firePropertyChange(P_TARGET_SENSE_CONNECTION, null, null);
		else if(connx instanceof ControlConnection)
			this.firePropertyChange(P_TARGET_CONTROL_CONNECTION, null, null);
	}
	
	public String getFeatureName() {
		return featureName;
	}
	
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
		this.firePropertyChange(Feature.P_TEXT, null, featureName);
	}
	
	public IPropertyDescriptor[] getPropertyDescriptors(){
		IPropertyDescriptor[] descriptors = new IPropertyDescriptor[]{
//				new TextPropertyDescriptor(Feature.P_TEXT,"Feature name")
				new ComboBoxPropertyDescriptor(P_TEXT, "Probe type", GetExistedTypeArray.getFeatureTypes())
		};
		return descriptors; 
	}
	
	public Object getPropertyValue(Object id){
//		if(id.equals(Feature.P_TEXT))
//			return this.featureName;
		if(id.equals(P_TEXT)){
			String[] types = GetExistedTypeArray.getFeatureTypes();
			for(int i = 0; i < types.length; i++){
				if(types[i].equals(this.getFeatureName()))
					return new Integer(i);
			}
			JOptionPane.showMessageDialog(null, this.getFeatureName() + " has been deleted", 
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
//			this.setFeatureName((String)value);
		if(id.equals(P_TEXT)){
			String[] types = GetExistedTypeArray.getFeatureTypes();
			String newName = types[(Integer)value];
			if(this.ifNewNameMatch(newName))
				this.setFeatureName(types[(Integer)value]);
			else{
				JOptionPane.showMessageDialog(null, "The new feature type is not matched with probe or actuator type", 
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public Probe getProbe() {
		return probe;
	}
	
	public void setProbe(Probe probe) {
		this.probe = probe;
	}
	
	public Actuator getActuator() {
		return actuator;
	}
	
	public void setActuator(Actuator actuator) {
		this.actuator = actuator;
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public void firePropertyChangeChildren(){
		this.firePropertyChange(P_CHILDREN, null, null);
	}
	
	public boolean ifNewNameMatch(String newName){
		if(newName.equals(INodeInitialName.FEATURE))
			return true;
		else{
			for(int i = 0; i < this.targetConnection.size(); i++){
				Object connx = this.targetConnection.get(i);
				if(connx instanceof SenseConnection){
					if(! IfMatch.isIfProbeMathesFeature(((SenseConnection) connx).getSource().getProbeType(), newName))
						return false;
				}
				else if(connx instanceof ControlConnection){
					if(!IfMatch.isIfActuatorMatchesFeature(((ControlConnection) connx).getSource().getActuatorType(), newName))
						return false;
				}
			}
			return true;
		}
	}
	
	public boolean ifNewNameValid(String newName){
		String[] featureTypes = GetExistedTypeArray.getFeatureTypes();
		for(int i = 0; i < featureTypes.length; i++){
			if(newName.equals(featureTypes[i]))
				return true;
		}
		return false;
	}
}
