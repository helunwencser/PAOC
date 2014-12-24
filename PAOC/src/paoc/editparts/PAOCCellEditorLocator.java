package paoc.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Text;

public class PAOCCellEditorLocator implements CellEditorLocator{

	private IFigure figure;
	
	public PAOCCellEditorLocator(IFigure figure){
		this.figure = figure;
	}
	

	@Override
	public void relocate(CellEditor celleditor) {
		// TODO Auto-generated method stub
		Text text = (Text)celleditor.getControl();
		Rectangle rect = figure.getBounds().getCopy();
		figure.translateToAbsolute(rect);
		text.setBounds(rect.x, rect.y, rect.width, rect.height);
		
	}

}
