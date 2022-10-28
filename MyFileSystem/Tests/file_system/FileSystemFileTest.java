package file_system;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FileSystemFileTest {
	
	private MockFileSystemPrinter printer;
	
	@Before
	public void setUp() {
		printer = new MockFileSystemPrinter();
	}
	
	@Test
	public void testLs() {
		new FileSystemFile("pippo.txt").ls(printer);
		
		assertEquals("File: pippo.txt\n", printer.toString());
	}

}
