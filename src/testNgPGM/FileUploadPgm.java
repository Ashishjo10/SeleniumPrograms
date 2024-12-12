package testNgPGM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadPgm 
{
    
	ChromeDriver driver;
	String path="C:\\Users\\Mi\\OneDrive\\Documents\\INTern brief.docx";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void URL() throws AWTException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		//fileuploadtest("C:\\Users\\Mi\\OneDrive\\Documents\\INTern brief.docx");
	}
	
	@Test
	public void fileuploadtest() throws AWTException
	{
		StringSelection strSelection=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		Robot robot=new Robot();
		robot.delay(5000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);;
	}
}
