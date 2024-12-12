package seleniumpgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffselect {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void naviGate()
	{
		//driver.findElement(By.xpath("//a[contains(@href,'details')]")).click();
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select daydetails= new Select(day);
		daydetails.selectByValue("06");
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("AUG");
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2024");
		driver.findElement(By.xpath("//input[contains(@maxlength,'61')]")).sendKeys("Thomas");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("asfiffh1023");
		driver.findElement(By.xpath("//input[contains(@maxlength,'100')]")).sendKeys("vjhvdj2312");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("6473646432");
		
		WebElement country=driver.findElement(By.xpath("//select[contains(@name='country')]"));
		Select countrydet=new Select(country);
		countrydet.selectByVisibleText("Austria");
		
		WebElement city=driver.findElement(By.xpath("//select[contains(@name='city')]"));
		Select citydet=new Select(city);
		citydet.selectByVisibleText("Agra");
		
		
		
	}

}
