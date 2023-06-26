package TestNGpgms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerpgm {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver = new ChromeDriver();	
	}
	@BeforeMethod
	public void btest()
	{
		driver.get("https://www.expedia.com/?pwaLob=wizard-flight-pwa");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		while(true)
		{
			
			WebElement month = driver.findElement(By.xpath("//div[@class='uitk-date-picker-month'][1]/h2"));
			String month1 = month.getText();
			
			if(month1.equals("August 2023"))
			{
				System.out.println(month1);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			}
		}
				
		List<WebElement> alldates= driver.findElements(By.xpath("//div[@class='Dates']/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td/button"));
				for(WebElement dateelement:alldates)
				{
					String date = dateelement.getAttribute("data-day");
					//System.out.println(date);
					if(date.equals("6"))
					{
						dateelement.click();
						Thread.sleep(2000);
						System.out.println("date selected" +date);
					}
					
				}
			
		
	}

}
