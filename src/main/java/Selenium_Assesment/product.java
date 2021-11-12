package Selenium_Assesment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class product {
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
	driver.findElement(By.xpath("(//img[@class='product-image _deals-shoveler-v2_style_dealImage__3nlqg'])[1]")).click();
    String url = driver.getCurrentUrl();
    System.out.println(url);
    driver.close();
}
}
