package file_system;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class DirectoryTest {

	private MockFileSystemPrinter printer;
	
	@Before
	public void setUp() {
		printer = new MockFileSystemPrinter();
	}

	@Test
	public void testEmpty() {
		FileSystemResource dir = new FileSystemDirectory("MiaDirectory");
		dir.ls(printer);
		
		assertEquals("Directory: MiaDirectory\n", printer.toString());
	}
	
	@Test
	public void testWithOneFile() {
		FileSystemDirectory dir = new FileSystemDirectory("MiaDirectory");
		Collection<FileSystemResource> collection = dir.getContents();
		collection.add(new FileSystemFile("pippo.py"));	
		
		dir.ls(printer);
		
		assertEquals("Directory: MiaDirectory\n"
				+ "	File: pippo.py\n", printer.toString());
	}
	
	@Test
	public void testWitSubDir() {
		FileSystemDirectory subdir = new FileSystemDirectory("SubDir");
		Collection<FileSystemResource> collection_subdir = subdir.getContents();
		collection_subdir.add(new FileSystemFile("pippo.py"));
		
		FileSystemDirectory dir = new FileSystemDirectory("MiaDirectory");
		Collection<FileSystemResource> collection = dir.getContents();
		collection.add(subdir);
		collection.add(new FileSystemFile("pluto.txt"));
		
		
		dir.ls(printer);
		
		assertEquals("Directory: MiaDirectory\n"
				+ "	Directory: SubDir\n"
				+ "		File: pippo.py\n"
				+ "	File: pluto.txt\n", printer.toString());
	}
	
	@Test
	public void testAdd() {
		FileSystemDirectory dir = new FileSystemDirectory("aDir");
		FileSystemFile file = new FileSystemFile("pippo.txt");
		dir.add(file);
		
		assertEquals(1, dir.getContents().size());
		assertTrue(dir.getContents().contains(file));
	}
	
	@Test
	public void testRemove() {
		FileSystemDirectory dir = new FileSystemDirectory("aDir");
		
		FileSystemFile file = new FileSystemFile("pippo.txt");
		dir.getContents().add(file);
		
		dir.remove(file);
		
		assertEquals(0, dir.getContents().size());
		assertFalse(dir.getContents().contains(file));
	}
	
	@Test
	public void testSearch() {
		FileSystemDirectory dir = new FileSystemDirectory("pippo");
		FileSystemFile file = new FileSystemFile("pluto.txt");
		dir.getContents().add(new FileSystemFile("giovanni"));
		dir.getContents().add(file);
		
		assertEquals(file, dir.findByName("pluto.txt").get());
		assertTrue(dir.findByName("paperino").isEmpty());
	}
	
}
