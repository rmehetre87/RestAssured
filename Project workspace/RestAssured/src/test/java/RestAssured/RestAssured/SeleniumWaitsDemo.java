package RestAssured.RestAssured;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWaitsDemo {
	public static void main(String[] args) {
		
		//seleniumwait();
		testTabs();
		
	}
	
	
	/*System.setProperty("webdriver.chrome.driver","C:\\OSS\\chromedriver_win32\\chromedriver.exe");
	
	//WebDriver driver = new WebDriver();
	
	WebDriver driver = new ChromeDriver();*/
	
	
	
	
	
	
	/*public static void seleniumwait() {
	
	System.setProperty("webdriver.chrome.silentOutput", "true");
	System.setProperty("webdriver.chrome.driver","C:\\OSS\\chromedriver_win32\\chromedriver.exe");
	
	//WebDriver driver = new WebDriver();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://google.com");
	
	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	
	//WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd"))); 
	
	
	driver.close();
	driver.quit();
	
	
	
	}*/
	
	@Test
	public static void testTabs() {
		System.setProperty("webdriver.chrome.driver","C:\\OSS\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new WebDriver();
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://business.twitter.com/start-advertising");
	    //assertStartAdvertising();

	    // considering that there is only one tab opened in that point.
	    String oldTab = driver.getWindowHandle();
	    driver.findElement(By.linkText("Twitter Advertising Blog")).click();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
	    //assertAdvertisingBlog();

	    // Do what you want here, you are in the new tab

	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
	   // assertStartAdvertising();

	    // Do what you want here, you are in the old tab
	    
	    
	    
	    
	}

	
	
}
