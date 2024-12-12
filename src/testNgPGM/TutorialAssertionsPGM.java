package testNgPGM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialAssertionsPGM 
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
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@Test
	public void AssertionTest()
	{
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		String url=driver.getCurrentUrl();
		String expUrl="https://practicetestautomation.com/logged-in-successfully/";
		Assert.assertEquals(expUrl, url);
		
		
	}
}
