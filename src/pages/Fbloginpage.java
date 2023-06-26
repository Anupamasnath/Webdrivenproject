package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	
	WebDriver driver;
	By fbemail = By.id("email");
	By fbpass = By.id("pass");
	By fblogin = By.name("login");
	
	public Fbloginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		
	}
	public void setValues(String email,String pass)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpass).sendKeys(pass);
		
	}
	public void login()
	{
		driver.findElement(fblogin).click();
	}

}
