package TestNGpgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class Assertpgm {

	WebDriver driver;
	
	@BeforeTest
	
	public void btest()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void test()
	{
	String expected = "Google";
	String actual = driver.getTitle();
	System.out.println("Actual title = "+actual);
	//Assert.assertEquals(actual, expected);//hard assertion
	SoftAssert soft = new SoftAssert();//Soft assertion
	soft.assertEquals(expected,actual);
	System.out.println("Hello");
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
}
