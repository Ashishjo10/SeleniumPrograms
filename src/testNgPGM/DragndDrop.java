package testNgPGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragndDrop 
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
		driver.get("https://demo.guru99.com/test/drag_drop.html");
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
