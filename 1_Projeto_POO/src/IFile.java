import java.io.IOException;

public interface IFile {
	// Assinaturas dos métodos (métodos abstratos)
	// throws - caso haja um erro de I/O essa exessão será tratada em outra camada do software
	public abstract void readDirectory(String path) throws IOException;
	public abstract void createFile(String path, String name, String extension) throws IOException;
	public abstract void readFile(String absolutePath) throws IOException;
}
