
public class Folder implements IFolder {
	private String path;
	private String name;
	private String forward;
	
	// Métodos Específicos Getters e Setters
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFolderName() {
		return name;
	}
	public void setFolderName(String folderName) {
		this.name = folderName;
	}
	public String getForward() {
		return forward;
	}
	public void setForward(String forward) {
		this.forward = forward;
	}
	
	
	// Métodos da interface
	@Override
	public void createFolder() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enterTheFolder() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void browseDirectory() {
		// TODO Auto-generated method stub
		
	}
	
	
}
