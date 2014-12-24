package paoc.editparts;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.swt.widgets.Text;

import paoc.model.Location;

public class LocationDirectEditManager extends DirectEditManager {
	private Location model;
	
	public LocationDirectEditManager(GraphicalEditPart source, Class<?> editorType,
			CellEditorLocator locator) {
		super(source, editorType, locator);
		// TODO Auto-generated constructor stub
		model = (Location)source.getModel();
	}

	@Override
	protected void initCellEditor() {
		// TODO Auto-generated method stub
		this.getCellEditor().setValue(model.getOwnerName());
		
		Text text = (Text)this.getCellEditor().getControl();
		text.selectAll();

	}

}
