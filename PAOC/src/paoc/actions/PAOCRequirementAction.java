package paoc.actions;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import paoc.Application;
import paoc.helper.IImageKeys;
import paoc.ui.PAOCRequirementEditor;
import paoc.ui.PAOCRequirementEditorInput;

public class PAOCRequirementAction extends Action implements ISelectionListener{

	private final IWorkbenchWindow window;
	
	public final static String ID = "PAOC_Requirement_open";
	
	public PAOCRequirementAction(IWorkbenchWindow window){
		this.window = window;
		this.setId(ID);
		this.setText("&New Requirement Editor");
		this.setToolTipText("Open the Requirement editor");
		this.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.NEW));
		this.window.getSelectionService().addSelectionListener(this);
	}
	
	public void dispose(){
		this.window.getSelectionService().removeSelectionListener(this);
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	private String openFileDialog(){
		FileDialog dialog = new FileDialog(window.getShell(), SWT.OPEN);
		dialog.setText("Requirement file");
		dialog.setFilterExtensions(new String[] {".req"});
		return dialog.open();
	}

	public void run(){
		String path = openFileDialog();
		if(path != null){
			IEditorInput input = new PAOCRequirementEditorInput(new Path(path));
			IWorkbenchPage page = window.getActivePage();
			try {
				page.openEditor(input, PAOCRequirementEditor.ID, true);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
