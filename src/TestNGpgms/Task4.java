package TestNGpgms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task4 {
ChromeDriver driver;
	
	@BeforeMethod
	public void urlloading()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(link).perform();
		// Click on Edit link on the displayed menu options
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-edit"));
		element.click();
		// Accept the alert displayed
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
	
		Actions actions = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.doubleClick(ele1).perform();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
