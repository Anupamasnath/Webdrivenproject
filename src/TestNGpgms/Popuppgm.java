package TestNGpgms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popuppgm {

	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
	}
	
	@Test
	public void popup()
	{
		driver.manage().window().maximize();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent title = "+driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		// To handle all new opened window.
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String handle :allWindowHandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.name("emailid")).sendKeys("abcd@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				
			}
		}
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
}
