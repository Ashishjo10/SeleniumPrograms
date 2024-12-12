package testNgPGM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenemoPgm 
{
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void URL()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Demodatadriven() throws IOException
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\Mi\\OneDrive\\Desktop\\sample.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			String Username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username="+Username);
			String Password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password="+Password);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Password);
			driver.findElement(By.name("login")).click();
		}
		
		
	}
	
	
}
