package paoc.model;

import java.util.ArrayList;
import java.util.List;

public class ContentsModel extends AbstractModel{
	private List<Object> children = new ArrayList<Object>();
	
	public static final String P_CHILDREN = "_children_contentsModel";
	
	public void addChild(Object child){
		children.add(child);
		this.firePropertyChange(P_CHILDREN, null, null);
	}
	
	public List<Object> getChildren(){
		return children;
	}
	
	public void removeChild(Object child){
		children.remove(child);
		this.firePropertyChange(P_CHILDREN, null, null);
	}

}
