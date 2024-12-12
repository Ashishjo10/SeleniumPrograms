import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayPgm 
{
	
     ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.ebay.com/");
		
	}
	
	@Test
	public void titlesearch()
	{
		driver.manage().window().maximize();
		String org=driver.getTitle();
		String check="ebay";
		if(check.equalsIgnoreCase(org))
		{
			System.out.println("Same Title");
		}
		else
		{
			System.out.println("Not a same title");
		}
	}
	
	@Test
	public void gothrough()
	{
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
		driver.findElement(By.xpath("(//a[@class='scnd'])[4]")).click();
		String ran=driver.getPageSource();
		if(ran.contains("Shop by category"))
		{
			System.out.println("Yes contains");
		}
		else
		{
			System.out.println("No text");
		}
		
		driver.findElement(By.xpath("(//a[contains(.,'Art NFTs')])[1]")).click();
		driver.findElement(By.className("gh-cart-icon")).click();
		driver.findElement(By.name("_nkw")).sendKeys("Books",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]")).click();
		
	}
	
	@After
    public void tearDown() 
	{
        if (driver != null) 
        {
            driver.quit();
        }
    }
	

}
