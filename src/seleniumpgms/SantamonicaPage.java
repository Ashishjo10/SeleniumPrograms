package seleniumpgms;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SantamonicaPage {

    ChromeDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testPart() {
        driver.get("https://santamonicaedu.in/");
        driver.manage().window().maximize();
        
        // Title check
        String title = "Santamonica";
        String org = driver.getTitle();
        if (title.equalsIgnoreCase(org)) {
            System.out.println("Same Title");
        } else {
            System.out.println("Not Same");
        }

        // "Choose Your Favourite" string check
        String c1 = driver.getPageSource();
        if (c1.contains("Choose Your Favourite")) {
            System.out.println("String Found");
        }

        // Wait for elements and click them after ensuring they are interactable
        //waitAndClick(By.xpath("//a[@href='https://santamonicaedu.in/our-branches/']"));
        //waitAndClick(By.xpath("//a[@class='flag-icon flag-icon-us menu-item menu-item-type-taxonomy menu-item-object-country menu-item-629']"));
        //waitAndClick(By.xpath("//a[@class='btn btn-secondary mrl-10']"));
       // waitAndClick(By.xpath("//li[@id='menu-item-1797']//a[normalize-space()='Careers']"));
        driver.findElement(By.xpath("//footer/div[3]/div/div/div/div//div/div/ul/li[6]/a[@href='https://santamonicaedu.in/contact-us-santamonica-study-abroad-pvt-ltd/']")).click();
        
        // Fill in form fields
        driver.findElement(By.xpath("//input[@name='cname']")).sendKeys("Thomas");
        driver.findElement(By.xpath("//input[@name='cemail']")).sendKeys("thomas@gmail.com");
        driver.findElement(By.xpath("//input[@name='cphonenumber']")).sendKeys("672562655");
        driver.findElement(By.xpath("//input[@name='csubject']")).sendKeys("Request");
        driver.findElement(By.xpath("//textarea[@name='textarea-96']")).sendKeys("Enquiry for admission");
        
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
    }

    private void waitAndClick(By by) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        scrollToElement(element);
        element.click();
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
