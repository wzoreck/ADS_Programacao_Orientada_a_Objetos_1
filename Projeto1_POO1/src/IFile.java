
public interface IFile {
	public abstract void status();
	public abstract void create(String fName, String ext, String path);
	public abstract void delete();
	public abstract void update();
	public abstract void write();
}
