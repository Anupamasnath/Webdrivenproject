package TestNGpgms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Parameters({"a","b","c"})
	@Test
	public void test(String a,int b,int c)
	{
		System.out.println("Value is : "+a);
		int d=b+c;
		System.out.println("Sum is : "+d);
	}

}
