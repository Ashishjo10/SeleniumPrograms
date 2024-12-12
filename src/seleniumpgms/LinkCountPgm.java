package seleniumpgms;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPgm {

ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void linkCount()
	{
		List <WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total links in FB="+linkdetails.size());
		
	 for(WebElement element:linkdetails)
	 {
		 String link=element.getAttribute("href");
		 String linktext=element.getText();
		 System.out.println("Link="+link);
		 System.out.println("Linktext="+linktext);
	 }
	}
}

		
