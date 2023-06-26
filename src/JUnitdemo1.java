import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitdemo1 {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	@Test
	public void test()
	{
		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}
	@After
	public void teardown()
	{
		driver.close();
	}

	
	
}
