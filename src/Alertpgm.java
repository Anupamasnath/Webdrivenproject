import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/AVITA/Desktop/alert.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		if(s.equals("Hello! I am alert box!! "))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		a.accept();
		System.out.println("Alert accepted");
		driver.findElement(By.name("firstname")).sendKeys("Anupama");
		driver.findElement(By.name("lastname")).sendKeys("S Nath");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@After
	public void teardown()
	{
		//driver.close();
	}
	

}
