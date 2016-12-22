package damapp.design;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import damapp.acceleo.ui.common.GenerateAll;

import org.eclipse.jface.dialogs.MessageDialog;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ExecuteAcceleo extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public ExecuteAcceleo() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
        IFile file = (IFile) activeEditor.getEditorInput().getAdapter(IFile.class);
        if (file != null) {
            IProject project = file.getProject();
            IFolder srcGenFolder = project.getFolder("output-texts");
            IFile damappFile = null;
    		try {
				for(IResource ir : project.members()){
					if(ir instanceof IFile && ir.getName().endsWith(".damapp")){
						damappFile = (IFile)ir;
					}
				}
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
            
            URI uri = URI.createURI(damappFile.getFullPath().toString());
    		
            if (!srcGenFolder.exists()) {
            	try{
            		srcGenFolder.create(true, true, new NullProgressMonitor());
            	}catch (CoreException e) {
                      e.printStackTrace();
                  }
            }
            
            try{
                GenerateAll generator = new GenerateAll(uri, srcGenFolder, Collections.emptyList());
    			generator.doGenerate(new NullProgressMonitor());
            }catch (IOException e) {
				e.printStackTrace();
			}
         }
            
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Generate", "Acceleo generated your texts to the folder 'output-texts'");
		return null;
	}
}