import org.openqa.selenium.chrome.ChromeDriver;

public class Title2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedtitle = "Kerala Public Service Commission";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://thulasi.psc.kerala.gov.in/thulasi/");
		String actualtitle = driver.getTitle();
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		driver.quit();
	}

}
