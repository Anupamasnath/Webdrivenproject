package TestNGpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUP()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.rediff.com");
	}
	@Test
	public void createacc() 
	{
		driver.findElement(By.xpath("//div[3]/p[1]/a[2]")).click();
		WebElement radiobtn = driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[24]/td[3]/input[1]"));
		boolean state = radiobtn.isSelected();
		if(state==true)
		{
			System.out.println("Radiobutton selected");
		}
		else
		{
			System.out.println("Radiobutton not selected");
		}
		WebElement logo =driver.findElement(By.xpath("//img[@title='Rediff.com']"));
			boolean display = logo.isDisplayed();
			if(display==true)
			{
				System.out.println("Diaplayed");
			}
			else
			{
				System.out.println("Not displayed");
			}
		WebElement en = driver.findElement(By.xpath("//input[@id='Register']"));
			boolean b = en.isEnabled();
			if(b==true)
			{
				System.out.println("Enabled");
			}
			else
			{
				System.out.println("Not enabled");
				
			}
	//	Thread.sleep(4000);
	}
//	@Test
//	
//		Thread.sleep(4000);
	//}
//	@Test
//	public void createaccount() throws InterruptedException
//	{
		
	//}
	@AfterMethod
	public void urlclose()
	{

	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
