import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void locate() throws IOException,NullPointerException
	{
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(WebElement li:linklist)
		{
			String url = li.getAttribute("href");
			verify(url);
		}
	}
	private void verify(String url)  {
		// TODO Auto-generated method stub
		try
		{
		URL u = new URL(url);//get the url
		HttpURLConnection con = (HttpURLConnection)u.openConnection();//open connection
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Success " +url);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Broken link " +url);
		}
		else if(con.getResponseCode()==301)
		{
			System.out.println("Moved Permanently " +url);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	@After
	public void teardown()
	{
		//driver.close();
	}
	

}
