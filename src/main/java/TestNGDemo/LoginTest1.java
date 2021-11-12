package TestNGDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import POMdemo.DashboardPage;
import POMdemo.HomePage;
import POMdemo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest1 {

	//Go to home page
	//click login
	//enter username, password
	//click login
	//in the dashboard page check title
	//click logout
	public static void main(String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//Home Page
		//Login Page
		//DashBoard page
		
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		DashboardPage dashboard = new DashboardPage(driver);
		
		driver.get("https://www.demoqa.com/books");
		
		homePage.clickLogin();
		
		//enter username and password
		
		loginPage.enterUsername("viji");
		loginPage.enterPassword("DemoSite@123");
		
		
		
		System.out.println("Heading to dashboard page" + driver.getTitle());
		
		driver.quit();
	}

}
