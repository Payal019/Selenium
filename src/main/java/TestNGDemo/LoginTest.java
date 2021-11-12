package TestNGDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMdemo.DashboardPage;
import POMdemo.HomePage;
import POMdemo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(CustomReportDemo.class)
public class LoginTest 
{
	ChromeDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboard;
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("hey am the before method getting called");
	}
	
	@BeforeTest
	public void setup() {
		System.out.println("I will be called b4 every test");
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/books");
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		dashboard = new DashboardPage(driver);
		
	}
	
	
	//@Test(description="to check proper login", groups = "login", enabled = false)
	public void loginTest() throws Exception {
		
		homePage.clickLogin();
		
		//enter username and password
		
		loginPage.enterUsername("viji");
		loginPage.enterPassword("DemoSite@123");
		
		loginPage.clickLoginBtn();
		
		Thread.sleep(4000);
		
		System.out.println("Heading to dashboard page");
		
		//to check if the title of the dashboard is "title"
		Assert.assertFalse(driver.getTitle().contains("title"));
		
		//Dashboard page
		dashboard.logoutClick();
		
		
		System.out.println("login test");
		
	}
	
	@Test(groups = "negative")
	public void GuestLoginTest()  {
		System.out.println("negative login");
	}
	
	@Test(groups = "negative")
	public void negativeLoginTest()  {
		System.out.println("negative login");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("hey I closed the browser");
		driver.quit();
		
	}
	
	@AfterMethod
	public void afterTest() {
		System.out.println("I am the after method");
	}
}
