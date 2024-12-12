package testNgPGM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertionsPgm 
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
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void TilteVerification()
	{
		String Title=driver.getTitle();
		String exptitle="google";
		Assert.assertEquals(exptitle,Title);
		System.out.println("Helloo");
	}
	
	
}
