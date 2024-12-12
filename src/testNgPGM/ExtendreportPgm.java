package testNgPGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendreportPgm 
{
  WebDriver driver;
  ExtentHtmlReporter reporter;
  ExtentTest test;
  ExtentReports extent;
  String baseurl="https://www.facebook.com/";
  
  @BeforeTest
  public void extentReport()
  {
	  reporter=new ExtentHtmlReporter("./reports/myreport1.html");
	  reporter.config().setDocumentTitle("Automation report");
	  reporter.config().setReportName("Functional Test");
	  reporter.config().setTheme(Theme.DARK);
	  extent=new ExtentReports();
	  extent.attachReporter(reporter);
	  extent.setSystemInfo("host name", "local host");
	  extent.setSystemInfo("OS", "Windows10");
	  extent.setSystemInfo("tester name", "abc");
	  extent.setSystemInfo("browser name", "chrome");
	  driver=new ChromeDriver();
  }
  
  @BeforeMethod
  public void befmethd()
  {
	  driver.get(baseurl);
  }
  
  @Test
	public void TilteVerification()
	{
	    test=extent.createTest("FB Title Verification");
		String Title=driver.getTitle();
		String exptitle="Facebook – log in or sign up";
		Assert.assertEquals(exptitle,Title);
	
	}
  
  @Test
  public void logoveri()
  {
	  test=extent.createTest("FB logo Verification");
	  boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img")).isDisplayed();
	  Assert.assertTrue(b);
  }
  
  @AfterTest
  public void teardown()
  {
	  extent.flush();
  }
  
  @AfterMethod
  public void browsercloase(ITestResult result)
  {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  test.log(Status.FAIL, "test case failed is"+result.getName());
		  test.log(Status.FAIL, "test case failed is"+result.getThrowable());
	  }
	  else if(result.getStatus()==ITestResult.SKIP)
	  {
		  test.log(Status.SKIP, "test case skipped is"+result.getName());
	  }
	  else
	  {
		  test.log(Status.PASS, "test case passed is"+result.getName());
	  }
  }

}
