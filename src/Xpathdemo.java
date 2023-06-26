import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void locate()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd123");
		//driver.findElement(By.xpath("//form[@method='post']/div[2]/button")).click();
		driver.findElement(By.xpath("//button[contains(@name,'log')]")).click();
		
	}
	
	
	@After
	public void teardown()
	{
		//driver.close();
	}

}
