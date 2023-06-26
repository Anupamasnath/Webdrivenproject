import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorid {
	
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
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd123");
		driver.findElement(By.name("login")).click();
	}
	
	
	@After
	public void teardown()
	{
		//driver.close();
	}

}
