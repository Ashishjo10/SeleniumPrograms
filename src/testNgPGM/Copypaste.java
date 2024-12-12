package testNgPGM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste 
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
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void keyHandling()
	{
		Actions act=new Actions(driver);
		WebElement Fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		Fullname.sendKeys("Ashish Joseph");
		WebElement ID=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		
		
		act.keyDown(Fullname, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(Fullname, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(ID, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}

}
