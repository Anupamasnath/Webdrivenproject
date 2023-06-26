package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createapagepage {
	
	WebDriver driver;
	
	By fbcreateapage = By.xpath("//a[@class='_8esh']");
	By fbgetstarted = By.xpath("//div[contains(text(),'Get Started')][1]");
	
	public Createapagepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public void create()
	{
		driver.findElement(fbcreateapage).click();
		driver.findElement(fbgetstarted).click();
	}
	

}
