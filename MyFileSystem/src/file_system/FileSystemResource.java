package file_system;

public abstract class FileSystemResource {

	private String nome;
	
	protected FileSystemResource(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	abstract public void ls(FileSystemPrinter printer, int depth);

	public void ls(FileSystemPrinter printer) {
		ls(printer, 0);
	}	
	
}