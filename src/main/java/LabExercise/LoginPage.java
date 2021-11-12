package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	 
	 public LoginPage(WebDriver driver) {
		 this.driver= driver;
	 }
			
	        //Find the elements: Fullname, password, login
	        //Enter a Full Name
			public void setFullName(String fullname) {
				By FName = By.id("name");
				driver.findElement(FName).sendKeys(fullname);
			}
			
            //Enter a password
	        public void setPassword(String pass) {
				By pwd = By.id("password");
				driver.findElement(pwd).sendKeys(pass);
			}
			
	        //Click on login button
	        public void clickLoginButton() {
				By loginBtn = By.id("login");
				driver.findElement(loginBtn).click();
			}			
}
