package testNgPGM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo 
{
   @BeforeTest
   public void setUp()
   {
	   System.out.println("Browser loading");
   }
   
   @BeforeMethod
   public void url()
   {
	   System.out.println("URL");
   }
   @Test
   public void test1()
   {
	   System.out.println("test1");
   }
   
   @Test(groups="smoke")
   public void test2()
   {
	   System.out.println("test2");
  }
   
   @Test(groups="smoke")
   public void test3()
   {
	   System.out.println("test3");
   }
   
   @AfterMethod
   public void testa1()
   {
	   System.out.println("after1");
   }
   
   @AfterTest
   public void aftert1()
   {
	   System.out.println("Aftertest");
   }
   
}
