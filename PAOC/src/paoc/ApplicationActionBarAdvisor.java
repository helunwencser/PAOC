package paoc;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import paoc.actions.ActuatorToFeatureMappingAction;
import paoc.actions.PAOCEnvironmentAction;
import paoc.actions.PAOCRequirementAction;
import paoc.actions.ProbeToFeatureMappingAction;
import paoc.helper.IImageKeys;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction exitAction;
	private IWorkbenchAction aboutAction;
	private PAOCEnvironmentAction environmentAction;
	private PAOCRequirementAction requirementAction;
	
	private ProbeToFeatureMappingAction probeToAttributeMappingAction;
	private ActuatorToFeatureMappingAction actuatorToAttributeMappingAction;
	
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    	exitAction = ActionFactory.QUIT.create(window);
    	exitAction.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.EXIT));
    	register(exitAction);
    	
    	aboutAction = ActionFactory.ABOUT.create(window);
    	aboutAction.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Application.PIUGIN_ID, IImageKeys.ABOUT));
    	register(aboutAction);
    	
    	environmentAction = new PAOCEnvironmentAction(window);
    	register(environmentAction);
    	
    	requirementAction = new PAOCRequirementAction(window);
    	register(requirementAction);
    	
    	this.probeToAttributeMappingAction = new ProbeToFeatureMappingAction(window);
    	this.register(this.probeToAttributeMappingAction);
    	this.actuatorToAttributeMappingAction = new ActuatorToFeatureMappingAction(window);
    	this.register(this.actuatorToAttributeMappingAction);
    }

    protected void fillMenuBar(IMenuManager menuBar) {
    	MenuManager fileMenu = new MenuManager("&File", "File");
    	fileMenu.add(environmentAction);
    	fileMenu.add(new Separator());
    	fileMenu.add(requirementAction);
    	fileMenu.add(new Separator());
    	fileMenu.add(exitAction);
    	
    	MenuManager helpMenu = new MenuManager("&Help", "Help");
    	helpMenu.add(aboutAction);
    	
    	MenuManager mappingMenu = new MenuManager("&Mapping", "Mapping");
    	mappingMenu.add(probeToAttributeMappingAction);
    	mappingMenu.add(actuatorToAttributeMappingAction);
    	
    	menuBar.add(fileMenu);
    	menuBar.add(mappingMenu);
    	menuBar.add(helpMenu);

    }
    
}












