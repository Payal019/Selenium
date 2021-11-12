package Selenium_Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QATechDemo 
{
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser window.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Navigate to “http://qatechhub.com”
		driver.get("http://qatechhub.com");
		
		String TitleOfPage = driver.getTitle();
		if (TitleOfPage.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {
			System.out.println("Test case PASS");
		}
		else
		{
			System.out.println("Test case FAIL");
		}
		
        //Navigate to Facebook Page
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		
		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL: " + currentUrl);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
		
}
}