import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Singleelementdemo {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
	@Test
	public void test1()throws IOException
	{
//		WebElement button = driver.findElement(By.name("login"));
//		File file1 = button.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(file1,new File("D://screeen.png"));//screenshot of single element
		WebElement l = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/a[1]"));
		File file1 = l.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(file1,new File("D://s.png"));
		FileHandler.copy(file1,new File("./Screenshot//error.png"));//save in current workspace;
	}
	@After 
	public void teardown()
	{
		//driver.close();
	}

}
