package testNgPGM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activityalert 
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
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void handling()
	{
		Actions act=new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	    act.contextClick(rightclick).perform();
	    WebElement editoption=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
	    editoption.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		
		
		
		WebElement doublec=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doublec).perform();
		a=driver.switchTo().alert();
		a.accept();
		
	}
}
