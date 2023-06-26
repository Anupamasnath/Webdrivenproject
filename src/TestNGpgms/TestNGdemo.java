package TestNGpgms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	ChromeDriver driver;
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	
	public void setUP()
	{
		driver = new ChromeDriver();
		System.out.println("Browser opens");
		
	}
	@BeforeClass
	public void bclass() 
	{
		System.out.println("Before class");
		
	}
	@BeforeMethod
	public void urlloading() throws InterruptedException
	
	{
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		System.out.println("URL opens");
		
	}
	@Test(enabled=false)
	public void a()
	{
		System.out.println("Test 1");
	}
	@Test(priority=1,invocationCount=3)
	public void c()
	{
		System.out.println("Test 3");
	}
	@Test(priority=2,dependsOnMethods="a")
	public void b()
	{
		System.out.println("Test 2");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Application closes");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("Browser closes");
		driver.quit();
	}
	@AfterSuite
	public void asuite()
	{
		System.out.println("After Suite");
	}
	

}
