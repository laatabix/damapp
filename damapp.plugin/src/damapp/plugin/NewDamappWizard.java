package damapp.plugin;

import java.io.InputStream;
import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.osgi.framework.Bundle;

public class NewDamappWizard extends Wizard implements INewWizard {
	
	private WizardNewProjectCreationPage _page1;

	public NewDamappWizard() {
		setWindowTitle(("New Damapp Project"));
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void addPages() {
		super.addPages();
		_page1 = new WizardNewProjectCreationPage("New Damapp Project");
		_page1.setTitle("Damapp Project");
		_page1.setDescription("Creating a new damapp project");
 
		addPage(_page1);
	}

	@Override
	public boolean performFinish() {
		
		String name = _page1.getProjectName();
	    URI location = null;
	    if (!_page1.useDefaults()) {
	        location = _page1.getLocationURI();
	    }
	 
	    createBaseProject(name, location);
	    
	    try{
		    Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		    
		    IPath path = new Path("res/model.damapp");
		    InputStream stream = FileLocator.openStream(bundle, path, false);
		    IFile file = project.getFile("model.damapp");
		    file.create(stream, true, null);
		    
		    path = new Path("res/representations.aird");
		    stream = FileLocator.openStream(bundle, path, false);
		    file = project.getFile("representations.aird");
		    file.create(stream, true, null);
		    
		    IFolder folder = project.getFolder("output-texts");
		    if (!folder.exists()) 
		        folder.create(IResource.NONE, true, null);

	    }catch (Exception e) {
	    	e.printStackTrace();
		}
		return true;
	}
	
	private IProject createBaseProject(String projectName, URI location) {
        IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
 
        if (!newProject.exists()) {
            URI projectLocation = location;
            IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
            if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
                projectLocation = null;
            }
 
            desc.setLocationURI(projectLocation);
            try {
                newProject.create(desc, null);
                if (!newProject.isOpen()) {
                    newProject.open(null);
                }
                
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
 
        return newProject;
    }

}
