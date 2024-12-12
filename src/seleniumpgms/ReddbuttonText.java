package seleniumpgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddbuttonText {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//driver.manage().window().maximize();
	}
	
	@Test
	public void naviGate()
	{
		String text=driver.findElement(By.xpath("//*contains(@name,'btnchkavail')]")).getAttribute("value");
		System.out.println(text);
		String cc="check availability";
		if(cc.equalsIgnoreCase(text))
		{
			System.out.println("Text matches");
		}
		else
		{
			System.out.println("Different text");
		}
	}
}
