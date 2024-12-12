import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch 
{
	

      ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setUp()
	{
		 driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void searchIn()
	{
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		
	}
	
	
}
