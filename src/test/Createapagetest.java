package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Createapagepage;

public class Createapagetest extends Baseclass{
	
	
	@Test
	public void createapagetest()
	{
		Createapagepage ob = new Createapagepage(driver);
		ob.create();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
