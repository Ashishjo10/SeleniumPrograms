package testNgPGM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tutorial
{
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void URL()
	{
		driver.get("https://www.google.com/");
	}
	
	@Parameters("e")
   @Test
	   public void search(String e)
	   {
		    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(e,Keys.ENTER);
		
	   }
   
}
