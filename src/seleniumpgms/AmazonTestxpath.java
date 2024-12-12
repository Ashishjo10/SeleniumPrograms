package seleniumpgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestxpath {

ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setUp()
	{
		 driver.get("https://www.amazon.in");
		
	}
	
	@Test
	public void xpathlocation()
	{
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
	}
	
	@After
	public void aftertest()
	{
		driver.quit();
	}
}
