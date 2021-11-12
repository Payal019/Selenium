package Selenium_Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.TestException;

public class AmazonCart {
	 public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    //TC001 - Verify if user is on home page
		    driver.get("https://www.amazon.in/");
		    driver.findElement(By.xpath("//span[text()=\"Hello, Sign in\"]")).click();
		    driver.findElement(By.id("ap_email")).sendKeys("payalraut364@gmail.com");
		    driver.findElement(By.id("continue")).click();
		    driver.findElement(By.id("ap_password")).sendKeys("Amazon@123");
		    driver.findElement(By.id("signInSubmit")).click();
		    Thread.sleep(2000);
		    String expectedTitle = "Amazon";
		    String actualTitle = driver.getTitle();
		    if(expectedTitle.equals(actualTitle)) {
		    	System.out.println("User is on Home Page of Amazon.in");
		    }
		 
		    
		    //TC002user name should display
		    String ActualUN = "Hello, Payal";
		    WebElement UserName = driver.findElement(By.xpath("//span[text()=\"Hello, Payal\"]"));
		    String UN = UserName.getText();
		    if(ActualUN.equals(UN)) {
		    	System.out.println("TC002 is Passed");
		    }
		    else
		    {
		    	System.out.println("TC002 is failed");
		    }
		    
		    //TC003 Verify that featured products are displayed on home page
		    boolean ProductDisplayed = driver.findElement(By.xpath("(//img[@class='landscape-image'])[16]")).isDisplayed();
            if(ProductDisplayed==true)
            {
            	System.out.println("products displayed on Amazon ");
            }
		    
		    
		    //TC004 Verify that Search Functionality is present on home page.
		    boolean SearchFunctionality = driver.findElement(By.id("nav-search-submit-button")).isDisplayed();
		    boolean SearchEnabled = driver.findElement(By.id("nav-search-submit-button")).isEnabled();
            if(SearchFunctionality==true && SearchEnabled==true) {
            	System.out.println("Search Functionality is present on home page");
            }

            //TC007 Verify that products displayed on home page are clickable.
            boolean ProductEnabled = driver.findElement(By.xpath("(//img[@class='landscape-image'])[16]")).isEnabled();
            if(ProductEnabled==true)
            {
            	System.out.println("products displayed on home page are clickable");
            }
            
            //TC008 Verify that when user clicks on a product, user should be redirected to product specification page.
            String ExpectedURL = "Samsung Galaxy";
            driver.findElement(By.xpath("(//img[@class='product-image _deals-shoveler-v2_style_dealImage__3nlqg'])[1]")).click();
            String ProductPage= driver.getCurrentUrl();
            if(ProductPage.contains(ExpectedURL)) {
            	System.out.println("User is on product specification page");
            }
		    
		    driver.close();
		    
		 }
}