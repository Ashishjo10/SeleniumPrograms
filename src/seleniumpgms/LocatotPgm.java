package seleniumpgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatotPgm {
	
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setUp()
	{
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void LocatorsPrg()
	{
		driver.findElement(By.name("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("abcd1234");
		driver.findElement(By.name("login")).click();
	}
	
	

}
