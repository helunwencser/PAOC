package paoc.editparts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import paoc.model.AbstractModel;
import paoc.model.ContentsModel;

public class ContentsTreeEditPart extends TreeEditPart {
	
	protected List<AbstractModel> getModelChildren(){
		List<AbstractModel> list = new ArrayList<AbstractModel>();
		List<Object> children = ((ContentsModel) this.getModel()).getChildren();
		for(int i = 0; i < children.size(); i++)
		{
			AbstractModel model = (AbstractModel) children.get(i);
			if(model.isIfOnlyInContentsModel())
				list.add(model);
		}
		return list;
	}
	
	public void propertyChange(PropertyChangeEvent event){
		if(event.getPropertyName().equals(ContentsModel.P_CHILDREN))
			refreshChildren();
	}

}
