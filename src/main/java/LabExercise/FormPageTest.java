package LabExercise;

import org.openqa.selenium.chrome.ChromeDriver;
import LabExercise.LoginPage;
import LabExercise.FormPage;
import LabExercise.LoginPageTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FormPageTest {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		LoginPage loginPage = new LoginPage(driver);
		FormPage formpage = new FormPage(driver);
		
		driver.get("https://example.testproject.io/web/index.html");
		
		//enter fullname and password
		loginPage.setFullName("Rex Jones II");
		loginPage.setPassword("12345");
		loginPage.clickLoginButton();
		
		Thread.sleep(4000);
		System.out.println("Our Test Script transitions to the FormPage");
		
		formpage.EnterCountryName("United States");
		formpage.EnterAddress("1234 TestProject");
		formpage.EnterEmail("Rex.Jones@Test4Success.org");
		formpage.EnterPhoneNum("214-225-1234");
		formpage.ClickSave();
		
	}		
		
}
