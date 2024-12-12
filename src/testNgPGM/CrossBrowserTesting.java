package testNgPGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
	}
	
	@BeforeMethod
	public void URL() throws InterruptedException
	{
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(15000);
	}
	
	@Test
	public void dragdrp()
	{
		Actions act=new Actions(driver);
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amouhold=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(amount, amouhold).perform();
		
		
		
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement bankhold=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(bank, bankhold).perform();
		
		
		
	}
}
