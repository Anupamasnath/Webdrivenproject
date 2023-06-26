import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffButton {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		
	}
	
	@Test
	
	public void testing()
	{
		driver.findElement(By.xpath("//div[3]/p[1]/a[2]")).click();
		WebElement btn = driver.findElement(By.xpath("//td[@ valign='bottom']/input[2] "));
		String actual = btn.getAttribute("Value");
		String exp = "Check availability";
		if(actual.equals(exp))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	

}
