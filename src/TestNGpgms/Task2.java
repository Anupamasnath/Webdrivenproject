package TestNGpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 {

	ChromeDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void test() throws InterruptedException
	{
		//driver.manage().window().maximize();
		WebElement dra = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dro = driver.findElement(By.xpath("//*[@id=\"droppable\"]")); 
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dra, dro).perform();
		//Thread.sleep(4000);
		String totext = dro.getText();
		System.out.println(totext);
		if(totext.equals("Dropped!"))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	@AfterMethod
	public void close()
	{
		//driver.quit();
	}
	
}
