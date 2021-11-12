package POMdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By title = By.xpath("//div[@class=\"main-header\"");
	By logoutBtn = By.id("submit");
	
	public String getTitle() {
		return driver.findElement(title).getText();
	}
	
	public void logoutClick() {
		driver.findElement(logoutBtn).click();
	}
}
