package paoc.editparts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import paoc.model.BelongToConnection;
import paoc.model.LocateInConnection;
import paoc.model.User;
import paoc.policies.DeleteComponentEditPolicy;

public class UserTreeEditPart extends TreeEditPart {
	protected void refreshVisuals(){
		User model = (User) this.getModel();
		this.setWidgetText(model.getOwnerName());
		this.setWidgetImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT));
	}
	
	public void propertyChange(PropertyChangeEvent event){
		if(event.getPropertyName().equals(User.P_TEXT))
			refreshVisuals();
		else if(event.getPropertyName().equals(User.P_CHILDREN))
		{
			refreshChildren();
			this.getRoot().getContents().refresh();
		}
	}
	
	protected void createEditPolicies(){
		this.installEditPolicy(EditPolicy.COMPONENT_ROLE, new DeleteComponentEditPolicy());
	}
	
	protected List<?> getModelChildren(){
		List<Object> children = new ArrayList<Object>();
		List<?> targetConnections = ((User)this.getModel()).getTargetConnections();
		for(int i = 0; i < targetConnections.size(); i++){
			Object connection = targetConnections.get(i);
			if(connection instanceof LocateInConnection)
				children.add(((LocateInConnection) connection).getSource());
			else if(connection instanceof BelongToConnection)
				children.add(((BelongToConnection) connection).getSource());
		}
		return children;
	}

}
