package SeleniumDemo1;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo
{
 public SeleniumDemo(ChromeDriver chromeDriver) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {

	/**
	 * 
	 * @author vijayave
	 * 1) Selenium web driver library - interact with the web browser
	 * 2) Web driver dependency
	 *
	 */

	//launch a browser
	//search a url in it (https://www.google.com)
	//maximize the browser

	// architecture of selenium web driver
	//Selenium(Java) - <WebDriver> - browser(JS,HTML,CSS)
	//ChromeDriver - python and c++ - google
	//GeckoDriver - JS and python - firefox
	//Selenium(Java/python/c#) -> REST API -> browser


		WebDriver driver;
		public SeleniumDemo(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}
		
		public static void main(String args[]) {
			//Step 0: initialize your driver
			WebDriverManager.chromedriver().setup();
			
			SeleniumDemo demo = new SeleniumDemo(new ChromeDriver());
			//driver.get("");
			
			//Step 2: Launch google.com
			demo.driver.get("https://www.google.co.in");
			
			//Step 3: to get the page url and check if thats the page we want
			if(demo.driver.getCurrentUrl().contains("https://www.google.co.in")) 
			{
				System.out.println("am at google.co.in");
			}
			
//			//Step 4: Close the browser
//			demo.driver.close();
			
			//Step 5: quits the chrome
			demo.driver.quit();
			
		}
}
}
