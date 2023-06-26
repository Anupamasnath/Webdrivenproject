import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo1 {

	ChromeDriver driver;
	@Before
	
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void locate()throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file1 = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file1,new File("D://Screenshott.png"));
		
	}
	@After
	public void teardown()
	{
		//driver.close();
	}
}
