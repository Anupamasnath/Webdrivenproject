package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;

public class Fblogintest extends Baseclass {
	
	@Test
	public void test()
	{
		Fbloginpage ob = new Fbloginpage(driver);
		ob.setValues("abcd@gmail.com", "abcd");
		ob.login();
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
