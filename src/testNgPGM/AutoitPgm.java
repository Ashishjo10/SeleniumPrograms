package testNgPGM;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoitPgm 
{
	ChromeDriver driver;
	//String path="C:\\Users\\Mi\\OneDrive\\Documents\\INTern brief.docx";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void URL() throws AWTException, InterruptedException, IOException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		//fileuploadtest("C:\\Users\\Mi\\OneDrive\\Documents\\INTern brief.docx");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Mi\\Downloads\\autoit\\t2.exe");
		Thread.sleep(3000);
	}
}
