import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcedemo {
	
	ChromeDriver driver;
	
	@Before
	
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	@Test
	public void pagesource()
	{
	String s = driver.getPageSource();
	if(s.contains("Gmail"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}
	
	@After
	public void teardown()
	{
		driver.close();
	}

}
