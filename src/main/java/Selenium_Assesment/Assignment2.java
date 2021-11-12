package Selenium_Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	public static void main(String args[]) throws InterruptedException {
		String fbUrl = "https://www.fb.com";
		String facebookUrl = "https://www.facebook.com";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser window.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.navigate().to(fbUrl);
	    
        String urlFromBrowser = driver.getCurrentUrl();
		
		if(urlFromBrowser.equalsIgnoreCase(facebookUrl)) {
			System.out.println("fb has redirected to facebook");
		} else {
			System.out.println("No redirection happened");
		};
	    
		//Verify that there is a “Create an account” section on the page
		String CreateAccount = "Create New Account";
		WebElement CreateAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		String NewAcc = CreateAcc.getText();
		
	    if(NewAcc.equals(CreateAccount)) {
	    	System.out.println("Create an account section is present on the page");
	    }
	    else {
	    	System.out.println("Create an account section is not present");
	    }
	    CreateAcc.click();
	}
		public void facebookSignUp() {
			
			WebDriver driver=new ChromeDriver();
			driver.findElement(By.name("firstname")).sendKeys("Payal");
			driver.findElement(By.name("lastname")).sendKeys("Raut");
			driver.findElement(By.name("reg_email__")).sendKeys("payalraut@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");
			
			Select selDate = new Select(driver.findElement(By.id("day")));
			Select selMonth = new Select(driver.findElement(By.id("month")));
			Select selYear = new Select(driver.findElement(By.id("year")));
			
			selDate.selectByVisibleText("20");
			selMonth.selectByVisibleText("May");
			selYear.selectByVisibleText("1990");
			
			driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
			
			driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		}
		
	
}


