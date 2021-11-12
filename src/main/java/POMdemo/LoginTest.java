package POMdemo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import POMdemo.DashboardPage;
import POMdemo.HomePage;
import POMdemo.LoginPage;

public class LoginTest
{
	    //Go to home page
		//click login
		//enter username, password
		//click login
		//in the dashboard page check title
		//click logout
		public static void main(String args[]) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
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
			
			loginPage.clickLoginBtn();
			
			Thread.sleep(4000);
			
			System.out.println("Heading to dashboard page");
			//Dashboard page
			dashboard.logoutClick();
			
			driver.quit();
		}
		

}
