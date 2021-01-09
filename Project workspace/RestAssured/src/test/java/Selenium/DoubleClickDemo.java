package Selenium;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions; 
 
public class DoubleClickDemo { 
 
 public static void main(String[] args) throws InterruptedException {
 
 //Note: Following statement is required since Selenium 3.0, 
 //optional till Selenium 2.0 
 //Set system properties for geckodriver 
	 System.setProperty("webdriver.chrome.driver","C:\\OSS\\chromedriver_win32\\chromedriver.exe");
		 
 // Create a new instance of the Firefox driver 
 WebDriver driver = new ChromeDriver(); 
 
 // Launch the URL 
 driver.get("https://demoqa.com/buttons"); 
 System.out.println("Demoqa Web Page Displayed"); 
 
 //Maximise browser window 
 driver.manage().window().maximize();
 
 Thread.sleep(2000);
 	
 //Instantiate Action Class 
 Actions actions = new Actions(driver); 
 
 //Retrieve WebElement to perform double click WebElement
 WebElement btnElement = driver.findElement(By.id("doubleClickBtn")); 
 
 //Double Click the button 
 actions.doubleClick(btnElement).perform(); 
 
 System.out.println("Button is double clicked"); 
 
 //Close the main window 
 driver.close();
 } 
}
