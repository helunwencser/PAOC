package paoc.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

public class AbstractModel implements IPropertySource{
	private PropertyChangeSupport listeners = new PropertyChangeSupport(this);
	
	public void addPropertyChangeListener(PropertyChangeListener listener){
		this.listeners.addPropertyChangeListener(listener);
	}
	
	public PropertyChangeSupport getListeners(){
		return this.listeners;
	}
	
	public void firePropertyChange(String propName, Object oldValue, Object newValue){
		this.listeners.firePropertyChange(propName, oldValue, newValue);
	}
	public void removePropertyChangeListener(PropertyChangeListener listener){
		this.listeners.removePropertyChangeListener(listener);
	}

	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		// TODO Auto-generated method stub
		return new IPropertyDescriptor[0];
	}

	@Override
	public Object getPropertyValue(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPropertySet(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub
		
	}
	
	private int ifOnlyInContentsModel = 0;
	
	public boolean isIfOnlyInContentsModel(){
		if(this.ifOnlyInContentsModel > 0)
			return false;
		else 
			return true;
	}
	
	public void addIfOnlyInContentsModel(){
		this.ifOnlyInContentsModel++;
	}
	
	public void subIfOnlyInContentsModel(){
		this.ifOnlyInContentsModel--;
	}
}
