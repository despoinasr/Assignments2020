package io;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import io.FileIO;

public class FileIOTest {
	
	FileIO file = new FileIO();
	
	@Test
	public void test_readFile_normal() {
		int[] num = file.readFile("src/test/resources/filewithnums.txt");
		int[] expected = new int[] {5, 6, 7, 4};
		Assert.assertArrayEquals(expected, num);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_readFile_emptylist() {
		thrown.expect(IllegalArgumentException.class);
		file.readFile("src/test/resources/emptyfile.txt");
		
	}
	
	@Test
	public void test_readFile_nofile() {
		thrown.expect(IllegalArgumentException.class);
		file.readFile("src/test/resources/sth.txt");
	}
	
	@Test
	public void testReadFileContainsInvalidEntries() {
		int [] result = file.readFile("src/test/resources/invalidentries.txt");
		int [] expected = new int[] {2, 3, 5};
		Assert.assertArrayEquals(expected, result);

	}
	
	

}
