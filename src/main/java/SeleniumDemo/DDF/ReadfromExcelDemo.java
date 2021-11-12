package SeleniumDemo.DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadfromExcelDemo
{
	public static void main(String args[]) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	//Instantiating chrome driver
		
			WebDriver driver = new ChromeDriver();
			
			//Opening web application
			driver.get("https://www.demoqa.com/books");
			
			//Locating the Login button and clicking on it
			driver.findElement(By.id("login")).click();
			
			//read value from excel
			File file = new File("\"E:\\Payal\\Payal\\Student_data.xlsx\"");
			FileInputStream fi = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fi);
			
			XSSFSheet sheet = workbook.getSheet("student_data");
			
			for(int i=1;i<3;i++) {
				//iterate over two rows
				String username = sheet.getRow(i).getCell(0).getStringCellValue();
				String password = sheet.getRow(i).getCell(1).getStringCellValue();
				System.out.println("The username and password is:" + username + "," + password);
				
				Thread.sleep(3000);
				
				//Locating the username & password and passing the credentials
				driver.findElement(By.id("userName")).sendKeys(username);
				driver.findElement(By.id("password")).sendKeys(password);
				
				Thread.sleep(3000);
				
				//Click on the login button
				driver.findElement(By.id("login")).click();
				
				Thread.sleep(3000);
				
				//Print the web page heading
				System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());

				//Click on Logout button
				driver.findElement(By.id("submit")).click();
				
				Thread.sleep(3000);
				
				}
			
			//Close driver instance
			driver.quit();
		}
}
