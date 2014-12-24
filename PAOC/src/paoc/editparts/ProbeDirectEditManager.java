package paoc.editparts;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.swt.widgets.Text;

import paoc.model.Probe;

public class ProbeDirectEditManager extends DirectEditManager {
	private Probe model;
	
	public ProbeDirectEditManager(GraphicalEditPart source, Class<?> editorType,
			CellEditorLocator locator) {
		super(source, editorType, locator);
		// TODO Auto-generated constructor stub
		model = (Probe)source.getModel();
	}

	@Override
	protected void initCellEditor() {
		// TODO Auto-generated method stub
		this.getCellEditor().setValue(model.getProbeType());
		
		Text text = (Text)this.getCellEditor().getControl();
		text.selectAll();

	}

}
