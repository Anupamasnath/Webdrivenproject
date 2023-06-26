package TestNGpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyboardpgms {
	
	ChromeDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		WebElement name = driver.findElement(By.xpath("//table[@class='f14']/tbody[1]/tr[3]/td[3]/input"));
		WebElement redid = driver.findElement(By.xpath("//table[@class='f14']/tbody[1]/tr[7]/td[3]/input[1]"));
		Actions act = new Actions(driver);
		name.sendKeys("abc");
		act.keyDown(name,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);//ctrl+a;
		act.keyDown(name,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);//ctrl+c;
		act.keyDown(redid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);//ctrl+v;
		act.perform();
	}
	@AfterMethod
	public void unloading()
	{
	driver.close();
		
	}
	
}
