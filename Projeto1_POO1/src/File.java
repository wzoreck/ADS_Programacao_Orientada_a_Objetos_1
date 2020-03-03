public class File implements IFile {
	private User user;
	private String fileName;
	private String extension;
	private String creationDate;
	private String accessDate;
	private String changeDate;
	private String content;
	private boolean closed;
	
	Date date = new Date();
	
	public File(int n) {
		this.fileName = "TXT"+n;
	}
	
	@Override
	public void status() {
			
	}

	@Override
	public void create(String fName, String ext, String path) {
		
	}

	@Override
	public void delete() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void write() {
		
	}
	
	
}
