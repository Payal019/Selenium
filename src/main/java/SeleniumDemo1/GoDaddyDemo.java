package SeleniumDemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoDaddyDemo 
{
 public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver;
	driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //Test Case 1 - Open Godaddy.com and maximize browser window.
    driver.get("https://www.godaddy.com/");
    driver.manage().window().maximize();
    driver.close();
 }
}
