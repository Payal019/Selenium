package LabExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage {
	WebDriver driver;
	 
	 public FormPage(WebDriver driver) {
		 this.driver= driver;
	 }
			
	    //Find the elements: 
//	    1. Country dropdown
//	    2. Address field
//	    3. Email field
//	    4. Phone field
//	    5. Save button
//	    6. Confirmation message
	        //Enter a Country
			public void EnterCountryName(String Countryname) {
				By CName = By.id("country");
				Select CountryName = new Select(driver.findElement(CName));
			    CountryName.selectByValue(Countryname);
			}
			
           //Enter address
	        public void EnterAddress(String adrs) {
				By ad = By.id("address");
				driver.findElement(ad).sendKeys(adrs);
			}
			
	        //Enter email
	        public void EnterEmail(String mail) {
				By Email = By.id("email");
				driver.findElement(Email).sendKeys(mail);
			}	
	        
	        //Enter Phone Number
	        public void EnterPhoneNum(String PN) {
	        	By Phone = By.id("phone");
	        	driver.findElement(Phone).sendKeys(PN);
	        }
	        
	        //Click on Save button
	        public void ClickSave() {
	        	By savebtn = By.id("save");
	        	boolean SaveButton = driver.findElement(savebtn).isEnabled();
	        }
}
