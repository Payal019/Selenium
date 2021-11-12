package TestNGDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo 
{

		public static void main(String args[]) throws IOException {
			WebDriverManager.chromedriver().setup();		
			WebDriver driver = new ChromeDriver();
			 //navigate to a url
			driver.get("https://www.demoqa.com");
			
			//find the logo and take screenshot of it
			//take screenshot of entire screen then crop this element(logo)
			
			WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
			
			
//			//take screenshot of the entire screen
//			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			
//			//converted to buffered image
//			BufferedImage image = ImageIO.read(screenshot);
//			
//			//locate the element
//			Point point = logo.getLocation();
//			
//			int x = point.getX();
//			int y = point.getY();
//			
//			int height = logo.getSize().getHeight();
//			int width = logo.getSize().getWidth();
//			
//			//crop the logo
//			BufferedImage logoImage = image.getSubimage(x, y, width, height);
//			ImageIO.write(logoImage, "jpg", screenshot);
			
			//Beyond selenium 4.0
			File logo_new = ((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
			
		
			File outputFile = new File("/Users/vijayave/Desktop/SeleniumDemo1/SeleniumDemo/src/main/java/TestngDemo/logo_new.jpg");
			
			
			FileUtils.copyFile(logo_new,outputFile);
			
			driver.close();
			
			
			
		}
}
