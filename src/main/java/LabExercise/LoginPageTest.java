package LabExercise;

import org.openqa.selenium.chrome.ChromeDriver;
import LabExercise.HomePage;
import LabExercise.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	//Enter FullName and Password
	//Click Login
	
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		LoginPage loginPage = new LoginPage(driver);
		
		driver.get("https://example.testproject.io/web/index.html");
		
		//enter fullname and password
		loginPage.setFullName("Rex Jones II");
		loginPage.setPassword("12345");
		loginPage.clickLoginButton();
		
		Thread.sleep(4000);
		
		System.out.println("Our Test Script transitions to the FormPage");
		
	}
	

}
