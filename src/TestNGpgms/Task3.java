package TestNGpgms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task3 {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void urlloading()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void test()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Smartphones and accessories']")));
	ele.click();
		//driver.findElement(By.xpath("//a[text()='Smartphones and accessories']")).click();
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
