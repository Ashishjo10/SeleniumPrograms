package seleniumpgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourcePgm {
	
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void SetUp()
	{
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void pageSource()
	{
		String drc=driver.getPageSource();
		if(drc.contains("Gmail"))
		{
			System.out.println("Found");
		
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
