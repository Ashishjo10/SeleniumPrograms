package seleniumpgms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firtspgmselenium {

	public static void main(String[] args) {
	
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		driver.quit();
		
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

}
