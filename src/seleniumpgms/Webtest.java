package seleniumpgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtest {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void SetUp()
	{
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String exp="Facebook";
		if(exp.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Same Title");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
