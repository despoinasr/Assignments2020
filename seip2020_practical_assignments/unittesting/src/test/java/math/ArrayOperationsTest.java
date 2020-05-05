package math;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import io.FileIO;

public class ArrayOperationsTest {
	
	ArrayOperations ao = new ArrayOperations();
	FileIO file = new FileIO();
	String filepath = "src/test/resources/filewithnums.txt";
	
	@Test
	public void test_findPrimesInFile_Mocking() {
		MyMath mm = mock(MyMath.class);
		
		when (mm.isPrime(5)).thenReturn(true);
		when (mm.isPrime(6)).thenReturn(false);
		when (mm.isPrime(7)).thenReturn(true);
		when (mm.isPrime(4)).thenReturn(false);
		
		FileIO file = mock(FileIO.class);
		
		when (file.readFile(filepath)).thenReturn(new int[] {5, 6, 7, 4});
		
		int[] expected = new int[] {5, 7};
		Assert.assertArrayEquals(expected, ao.findPrimesInFile(file,filepath, mm));
		
	}

}
