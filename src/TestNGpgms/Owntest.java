package TestNGpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Owntest {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
	@Test
	public void teest() throws InterruptedException
	{
		
		WebElement el = driver.findElement(By.xpath("//input[@type='text']"));
		boolean b = el.isEnabled();//text field is clickable or not
		if(b)
		{
			System.out.println("Text field is editable");
		}
		else
		{
			System.out.println("Not editable");
		}
		
		Actions actions = new Actions(driver);
		WebElement sp = driver.findElement(By.xpath("//em[@id='eyeiconNew']"));
		actions.moveToElement(sp).perform();//whether tool tip is same as title
		Thread.sleep(4000);
		String s = sp.getAttribute("title");
		if(s.equals("Show password"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");//scroll down a page
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-250)", "");//scroll up a page
		Thread.sleep(4000);
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
