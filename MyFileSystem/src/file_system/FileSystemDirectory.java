package file_system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class FileSystemDirectory extends FileSystemResource {
	
	private Collection<FileSystemResource> contents = new ArrayList<>();

	public FileSystemDirectory(String nome) {
		super(nome);
	}
	
	// solo ai fini di test
	Collection<FileSystemResource> getContents(){
		return contents;
	}
	
	public void add(FileSystemResource newContent) {
		contents.add(newContent);
	}
	
	public void remove(FileSystemResource newContent) {
		contents.remove(newContent);
	}

	@Override
	public void ls(FileSystemPrinter printer, int depth) {
		printer.print("\t".repeat(depth) + "Directory: " + getNome());
		contents.forEach((element) -> element.ls(printer, depth+1));
	}
	
	public Optional<FileSystemResource> findByName(String nome){
		return contents.stream()
				.filter(resource -> resource.getNome().equals(nome))
				.findFirst();
	}

}
