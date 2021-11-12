package SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAccountDemo 
{
	 public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    //Test Case 1 - Create New Account of user and verify if it is created successfully or not
		    driver.get("https://demo.guru99.com/v4/");
		    driver.findElement(By.xpath("//button[@id='details-button']")).click();
		    driver.findElement(By.id("proceed-link")).click();
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr360724");
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gerytyg");
		    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		    
		    //Click on New Account and enter valid data
		    driver.findElement(By.xpath("//a[text()='New Account']")).click();
		    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("22675");
		    WebElement AccType = driver.findElement(By.xpath("//select[@name='selaccount']"));
		    
		    //create an object of action class
		    Actions act=new Actions(driver);
		    //Click on element
		    act.click(AccType).perform();
		    
		    //select option
		    act.sendKeys(Keys.ENTER).perform();
		    driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys("500");
		    driver.findElement(By.xpath("//input[@name='button2']")).click();
		    
		    //Verify the account created successfully or not
		    String ActualMsg = driver.findElement(By.xpath("//p[@class='heading3']")).getText();
		    String ExpectedMsg = "Account Generated Successfully!!!";
		    if(ActualMsg.equals(ExpectedMsg))
		    {
		    	System.out.println("Test case passed");
		    	
		    }
		    else
		    {
		    	System.out.println("Test case failed");
		    }
		    driver.close();
		    
		 }
}
