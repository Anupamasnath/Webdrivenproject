package TestNGpgms;

import org.testng.annotations.Test;

public class Groupingpgms {
	
	@Test(groups= {"smoke","sanity"})
	public void test11()
	{
		System.out.println("test 1");
	}
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(groups= {"regression","sanity"})
	public void test3()
	{
		System.out.println("test 3");
	}
	@Test(groups= {"regression"})
	public void test4()
	{
		System.out.println("test 4");
	}

	

}
