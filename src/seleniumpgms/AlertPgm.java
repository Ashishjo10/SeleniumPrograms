package seleniumpgms;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AlertPgm {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mi/OneDrive/Desktop/alert.html");
	}
	
	@Test
	public void screenShot() throws IOException
	{
		File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(c, new File("./screenshot/imagescreen.png"));
		
		WebElement button=driver.findElement(By.xpath("/html/body/input[4]"));
		File Bimg=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Bimg, new File("./screenshot/buttonimage.png"));
	}
	
	
	//@Test
	//public void testpart()
	//{
		//driver.findElement(By.xpath("/html/body/input[4]")).click();
		//Alert a=driver.switchTo().alert();
		//System.out.println(a.getText());
		//a.accept();
		//driver.findElement(By.name("firstname")).sendKeys("kennady");
		//driver.findElement(By.name("lastname")).sendKeys("John");
		//driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	//}

}
