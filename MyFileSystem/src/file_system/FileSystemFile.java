package file_system;

public class FileSystemFile extends FileSystemResource {

	public FileSystemFile(String nome) {
		super(nome);	
	}

	@Override
	public void ls(FileSystemPrinter printer, int depth) {
		printer.print("\t".repeat(depth)+"File: "+getNome());
	}

}
