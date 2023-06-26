package TestNGpgms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task5 {

	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void test()
	
	
	{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement el1=driver.findElement(By.xpath("//input[@class='field_check']"));
		if(el1.isSelected())
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
		
	  driver.findElement(By.xpath("//input[@class='upload_txt']")).sendKeys("C:\\\\Users\\\\AVITA\\\\Pictures\\\\Merged_document.png");
		driver.findElement(By.xpath("//input[@class='field_check']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
}
