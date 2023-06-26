import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Title {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String expectedtitle = "Google.com";
		String expectedtitle = "Google";
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		String actualtitle = driver.getTitle();
//		if(expectedtitle.equals(actualtitle))
//		{
//			System.out.println("Test passed");
//		}
//		else
//		{
//			System.out.println("Test failed");
//		}
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("hello");
		 driver.quit();//to close all windows
		//driver.close();//to close current tab/window

	}

}
