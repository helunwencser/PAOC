package paoc.editparts;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.swt.widgets.Text;

import paoc.model.Actuator;

public class ActuatorDirectEditManager extends DirectEditManager {
	private Actuator model;
	
	public ActuatorDirectEditManager(GraphicalEditPart source, Class<?> editorType,
			CellEditorLocator locator) {
		super(source, editorType, locator);
		// TODO Auto-generated constructor stub
		model = (Actuator)source.getModel();
	}

	@Override
	protected void initCellEditor() {
		// TODO Auto-generated method stub
		this.getCellEditor().setValue(model.getActuatorType());
		
		Text text = (Text)this.getCellEditor().getControl();
		text.selectAll();

	}

}
