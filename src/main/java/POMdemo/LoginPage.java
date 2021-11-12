package POMdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage 
{
 WebDriver driver;
 
 public LoginPage(WebDriver driver) {
	 this.driver= driver;
	 
	 //Find the elements: user, password, login, newuser
//	    By uName = By.id("userName");
//		By pswd = By.id("password");
//		By loginBtn = By.id("login");
//		By newUserBtn = By.id("newUser");
 }
		//create actions
		public void enterUsername(String username) {
			By uName = By.id("userName");
			driver.findElement(uName).sendKeys(username);
		}
		

        public void enterPassword(String pass) {
			By pswd = By.id("password");
			driver.findElement(pswd).sendKeys(pass);
		}
		
        public void clickLoginBtn() {
			By loginBtn = By.id("login");
			driver.findElement(loginBtn).click();
		}
		
        private void clickNewUserBtn() {
			By newUserBtn= By.id("newUser");
			driver.findElement(newUserBtn).click();
		}
 }

//private void clickNewUserBtn() {
//	// TODO Auto-generated method stub
//	
//}
//
//void clickLoginBtn() {
//	// TODO Auto-generated method stub
//	
//}
//
//public void enterUsername(String string) {
//	// TODO Auto-generated method stub
//	driver.findElement(userName).sendKeys(username);
//	
//}
//
//public void enterPassword(String string) {
//	// TODO Auto-generated method stub
//	
//}

//}
