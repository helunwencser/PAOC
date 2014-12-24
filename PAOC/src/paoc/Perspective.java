package paoc;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {


	public void createInitialLayout(IPageLayout layout) {
		final String properties = "org.eclipse.ui.views.PropertySheet";
		final String outline = "org.eclipse.ui.views.ContentOutline";
		final String editorArea = layout.getEditorArea();
	
		IFolderLayout buttomFolder = layout.createFolder("LeftFolder", IPageLayout.LEFT, 0.20f, editorArea);
		buttomFolder.addView(properties);
		layout.setEditorAreaVisible(true);
		
		IFolderLayout rightFolder = layout.createFolder("RightFolder", IPageLayout.RIGHT, 0.8f, editorArea);
		rightFolder.addView(outline);
	}
}
