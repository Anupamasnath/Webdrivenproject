import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffmaillogin {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://rediff.com");
	}
	@Test
	public void locate()
	{
		driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).click();
		WebElement day = driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[22]/td[3]/select[1]"));
		Select s = new Select(day);
		s.selectByValue("03");
		
		Select se = new Select(driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[22]/td[3]/select[1]")));
		List<WebElement> l = se.getOptions();
		System.out.println(l.size());
		
		WebElement month = driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[22]/td[3]/select[2]"));
		Select s1 = new Select(month);
		s1.selectByIndex(3);
		
		WebElement year = driver.findElement(By.xpath("//table[@class='f14']/tbody/tr[22]/td[3]/select[3]"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2023");
		
	
	}
	@After
	public void teardown()
	{
		//driver.close();
	}
}
