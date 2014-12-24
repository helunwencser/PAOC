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
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import paoc.Application;
import paoc.helper.IImageKeys;
import paoc.ui.PAOCEnvironmentEditor;
import paoc.ui.PAOCEnvironmentEditorInput;

public class PAOCEnvironmentAction extends Action implements ISelectionListener,IWorkbenchAction{

	private final IWorkbenchWindow window;
	
	public final static String ID = "PAOC_Environment_open";
	
	//private IStructuredSelection selection;
	
	public PAOCEnvironmentAction(IWorkbenchWindow window){
		this.window = window;
		this.setId(ID);
		this.setText("&New Environment Editor");
		this.setToolTipText("Open the Environment editor");
		this.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.NEW));
		this.window.getSelectionService().addSelectionListener(this);
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		window.getSelectionService().removeSelectionListener(this);
	}
	
	private String openFileDialog(){
		FileDialog dialog = new FileDialog(window.getShell(), SWT.OPEN);
		dialog.setText("Environment file");
		dialog.setFilterExtensions(new String[] {".env"});
		return dialog.open();
	}
	
	public void run(){
		String path = openFileDialog();
		if(path != null){
			IEditorInput input = new PAOCEnvironmentEditorInput(new Path(path));
			IWorkbenchPage page = window.getActivePage();
			try {
				page.openEditor(input, PAOCEnvironmentEditor.ID, true);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
