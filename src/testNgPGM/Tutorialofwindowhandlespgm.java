package testNgPGM;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Tutorialofwindowhandlespgm 
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
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void windowHandling()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		String parentwindow=driver.getWindowHandle();
		System.out.println("Title="+driver.getTitle());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).sendKeys("mobiles",Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"))).click();
		Set<String> allwindows=driver.getWindowHandles();
		for(String handle:allwindows)
		{
			if(!handle.equalsIgnoreCase(parentwindow)) 
			{
		         driver.switchTo().window(handle);
		         wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("")));
		         System.out.println("Title="+driver.getTitle());
		         
		         js.executeScript("window.scrollTo(0, 500);");
		         //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add-to-cart-button\"]"))).click();
		         //driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add-to-cart-button\"]"))).click();
		         //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]"))).click();
		         driver.close();
			}
		  driver.switchTo().window(parentwindow);

		}
		
	}
}
