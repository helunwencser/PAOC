package paoc.ui;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;

public class PAOCRequirementEditorInput implements IPathEditorInput{

	private IPath path;
	
	public PAOCRequirementEditorInput(IPath path){
		this.path = path;
	}
	
	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return this.path.toFile().exists();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.path.toString();
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return this.path.toString();
	}

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPath getPath() {
		// TODO Auto-generated method stub
		return this.path;
	}
	
	public int hashCode(){
		return this.path.hashCode();
	}

}
