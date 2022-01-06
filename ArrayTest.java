package arraytesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void Actualtest() 
	{
		
		int a[]= {12,36,22,19,63};
		ArrayMain ob=new ArrayMain();
		assertEquals(1,ob.SumCalculate(a, 31, 5));
		
	}
	@Test
	public void LengthZero()
	{
		int[] a= {};
		ArrayMain ob=new ArrayMain();
		assertEquals(1,ob.SumCalculate(a,0,0));
	}
	
	@Test
	public void LengthLessThanZero()
	{
		int[] arr= {1,2,3};
		ArrayMain ob=new ArrayMain();
		ArrayIndexOutOfBoundsException ex=assertThrows(ArrayIndexOutOfBoundsException.class,()->ob.SumCalculate(arr,4,-1));
		assertEquals("Array should be within the Limits", ex.getMessage());
		
	}
	@Test
	public void LengthMoreThanSize()
	{
		int[] arr= {1,2,3};
		ArrayMain ob=new ArrayMain();
		ArrayIndexOutOfBoundsException ex=assertThrows(ArrayIndexOutOfBoundsException.class,()->ob.SumCalculate(arr,4,5));
		assertEquals("Array should be within the Limits", ex.getMessage());
		
	}
	
	@Test
	public void SumNotFoundTest()
	{
		int a[]= {12,36,22,21,63};
		ArrayMain ob=new ArrayMain();
		assertEquals(-1,ob.SumCalculate(a, 31, 5));
		
	}
}