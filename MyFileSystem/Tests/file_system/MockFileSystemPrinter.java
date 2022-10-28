package file_system;

public class MockFileSystemPrinter implements FileSystemPrinter {
	
	private StringBuilder builder = new StringBuilder();

	@Override
	public void print(String message) {
		this.builder.append(message+"\n");
	}
	
	@Override
	public String toString() {
		return builder.toString();
	}
	
}