package testNgPGM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoDatapickerPGm 
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
		driver.get("https://www.trivago.in/");
	}
	
	@Test
	public void datepicktest()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@data-testid='search-form-calendar-checkin-value']")).click();
		datepicker("December 2024","25");
	}

	private void datepicker(String expmonth, String expdate) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		while(true) 
		{
			String month=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(.,'December 2024')]"))).getText();
			System.out.println("month="+month);
			if(expmonth.equalsIgnoreCase(month))
			{	
				  break;
			}
			else
			{
				 driver.findElement(By.xpath("(//span[contains(@class,'Ji89fk')])[11]")).click();
			}
			
		}
		driver.findElement(By.xpath("//time[contains(@datetime,'2024-12-25')]")).click();
	}
	
}
