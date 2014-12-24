package paoc.editparts;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.swt.widgets.Text;

import paoc.model.User;

public class UserDirectEditManager extends DirectEditManager {
	private User model;
	
	public UserDirectEditManager(GraphicalEditPart source, Class<?> editorType,
			CellEditorLocator locator) {
		super(source, editorType, locator);
		// TODO Auto-generated constructor stub
		model = (User)source.getModel();
	}

	@Override
	protected void initCellEditor() {
		// TODO Auto-generated method stub
		this.getCellEditor().setValue(model.getOwnerName());
		
		Text text = (Text)this.getCellEditor().getControl();
		text.selectAll();

	}

}
