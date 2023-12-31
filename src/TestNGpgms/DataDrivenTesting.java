package TestNGpgms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DataDrivenTesting {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void test()throws IOException
	{
		FileInputStream f = new FileInputStream("D:\\Book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowCount = sh.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			String uname = sh.getRow(i).getCell(0).getStringCellValue();
			String pass = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username : "+uname);
			System.out.println("Password : "+pass);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys(uname);
			driver.findElement(By.name("pass")).sendKeys(pass);
			driver.findElement(By.name("login")).click();
			
		}
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
