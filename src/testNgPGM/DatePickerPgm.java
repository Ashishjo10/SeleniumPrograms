package testNgPGM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerPgm 
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
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	
	@Test
	public void datepicktest()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		Datepicker("December 2024","23");
	}

	
	public void Datepicker(String expmonth,String expdate)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		while(true)
		{

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img"))).click();
		String month=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div"))).getText();
		//String month="December";
		System.out.println("Month="+month);
		if(month.equalsIgnoreCase(expmonth))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		}
		}
		
		List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement d:date)
		{
			String datetext=d.getText();
			System.out.println("date="+datetext);
			if(datetext.equals(expdate))
			{
				d.click();
				break;
			}
		}
		
		
	}
	
	
}
