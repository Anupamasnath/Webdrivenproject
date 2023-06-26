import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}

	@Test
	public void locate()
	{
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles\']")).click();
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
	}
	@After
	public void teardown()
	{
		//driver.quit();
	}
}
