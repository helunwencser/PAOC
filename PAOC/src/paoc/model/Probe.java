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

public class Probe extends AbstractModel{
	public static final String type = INodeType.PROBE;
	public static final String initialName = INodeInitialName.PROBE;
	private String probeType = INodeInitialName.PROBE;
	private Feature feature;
	private static int ID = 0;
	
	private Rectangle constraint;
	
	public static final String P_CONSTRAINT = "_constraint_probe";
	public static final String P_TEXT = "_textProbe";
	public static final String P_SOURCE_SENSE_CONNECTION = "_source_sense_connection_probe";
	
	private List<SenseConnection> sourceConnection = new ArrayList<SenseConnection>();
	
	public void addSourceConnection(Object connx){
		if(connx instanceof SenseConnection){
			this.sourceConnection.add((SenseConnection) connx);
			this.firePropertyChange(P_SOURCE_SENSE_CONNECTION, null, null);	
		}
	}
	
	public Rectangle getConstraint() {
		return constraint;
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
		this.firePropertyChange(P_CONSTRAINT, null, constraint);
	}
	
	public List<SenseConnection> getSourceConnections(){
		return this.sourceConnection;
	}
	
	public void removeSourceConnection(Object connx){
		this.sourceConnection.remove(connx);
		this.firePropertyChange(P_SOURCE_SENSE_CONNECTION, null, null);
	}
	
	public Probe(){
		Probe.ID ++;
	}
	
	public String getProbeType() {
		return probeType;
	}
	
	public void setProbeType(String probeType) {
		this.probeType = probeType;
		this.firePropertyChange(P_TEXT, null, probeType);
	}
	
	public IPropertyDescriptor[] getPropertyDescriptors(){
		IPropertyDescriptor[] descriptors = new IPropertyDescriptor[]{
				//new TextPropertyDescriptor(P_TEXT, "Probe type")
				new ComboBoxPropertyDescriptor(P_TEXT, "Probe type", GetExistedTypeArray.getProbeTypes())
		};
		return descriptors;
	}
	
	public Object getPropertyValue(Object id){
//		if(id.equals(P_TEXT))
//			return this.probeType;
		if(id.equals(P_TEXT)){
			String[] types = GetExistedTypeArray.getProbeTypes();
			for(int i = 0; i < types.length; i++){
				if(types[i].equals(this.getProbeType()))
					return new Integer(i);
			}
			JOptionPane.showMessageDialog(null, this.getProbeType() + " has been deleted", 
					"Warning", JOptionPane.WARNING_MESSAGE);
			this.setPropertyValue(P_TEXT, 0);
			return new Integer(0);
		}
		return null;
	}
	
	public boolean isPropertySet(Object id){
		if(id.equals(P_TEXT))
			return true;
		else
			return false;
	}
	
	public void setPropertyValue(Object id, Object value){
//		if(id.equals(P_TEXT))
//			this.setProbeType((String)value);
		if(id.equals(P_TEXT)){
			String[] types = GetExistedTypeArray.getProbeTypes();
			String newName = types[(Integer)value];
			if(this.ifNewNameMatch(newName))
				this.setProbeType(types[(Integer)value]);
			else{
				JOptionPane.showMessageDialog(null, "The new probe type is not matched with feature type", 
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
		if(newName.equals(INodeInitialName.PROBE))
			return true;
		else{
			for(int i = 0; i < this.sourceConnection.size(); i++){
				if(!IfMatch.isIfProbeMathesFeature(newName, 
						this.sourceConnection.get(i).getTarget().getFeatureName()))
					return false;
			}
			return true;
		}
	}
	
	public boolean ifNewNameValid(String newName){
		String[] probeTypes = GetExistedTypeArray.getProbeTypes();
		for(int i = 0; i < probeTypes.length; i++){
			if(newName.equals(probeTypes[i]))
				return true;
		}
		return false;
	}
}
