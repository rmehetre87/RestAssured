package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
 
public class ActionsClass {
	
	@Test(enabled = false)
	public void textInCaps() throws InterruptedException{
                
		//Instantiating the WebDriver interface.
		System.setProperty("webdriver.chrome.driver", "C:\\OSS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
                
		//Open the required URL
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
                
		//To maximise the browser
		driver.manage().window().maximize();
                
		//Create an object 'action' of an Actions class
		Actions action = new Actions(driver);
		By locator = By.cssSelector(".context-menu-one");
                
		//Wait for the element. Used Explicit wait
                WebDriverWait wait = new WebDriverWait(driver, 10);
                
                wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
                
                WebElement rightClickElement=driver.findElement(locator);
                
                //contextClick() method to do right click on the element
                action.contextClick(rightClickElement).build().perform();
                Thread.sleep(1000);
                WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
                Thread.sleep(1000);
                
                //getText() method to get the text value
                String GetText = getCopyText.getText();
                Thread.sleep(1000);
                                            
                //To print the value
                System.out.printf("Get text  = ",GetText);
                Thread.sleep(1000);
                //To close the browser
                driver.close();
	}
	
	
	@Test(enabled = true)
	public void testMultipleWindows() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\OSS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	// To maximize browser
	driver.manage().window().maximize();
	
	// To open Naukri website with multiple windows
	driver.get("http://www.naukri.com/");
	
	// It will return the parent window name as a String
	String mainWindow = driver.getWindowHandle();
	
	// It returns no. of windows opened by WebDriver and will return Set of Strings
	Set<String> set = driver.getWindowHandles();
	
	// Using Iterator to iterate with in windows
	Iterator<String> itr= set.iterator();
	while(itr.hasNext()){
		String childWindow = itr.next();
	   	
		// Compare whether the main windows is not equal to child window. If not equal, we will close.
		if(!mainWindow.equals(childWindow)){
		driver.switchTo().window(childWindow);
		System.out.println(driver.switchTo().window(childWindow).getTitle());
		driver.close();
		}
	}
	
	// This is to switch to the main window
	driver.switchTo().window(mainWindow);
	}

	
	

	
	
}
