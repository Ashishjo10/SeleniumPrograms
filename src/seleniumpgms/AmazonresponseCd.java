package seleniumpgms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonresponseCd {
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void linkCount()
	{
		List <WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total links in Amazon="+linkdetails.size());
		
	 for(WebElement element:linkdetails)
	 {
		 String link=element.getAttribute("href");
		 verify(link);
	 }
	}
	
	private void verify(String link)
	{
	   try
	   {
		   URL u=new URL(link); 
		   HttpURLConnection code=(HttpURLConnection)u.openConnection();
		   if(code.getResponseCode()==200)
		   {
			   System.out.println("Response code is 200");
		   }
		   else if(code.getResponseCode()==404)
		   {
			   System.out.println("Response code 404");
		   }
		   else
		   {
			   System.out.println("Other response code");
		   }
	   }
	    catch(Exception e)
	   {
	    	System.out.println(e.getMessage());
	   }
	}

	
}
