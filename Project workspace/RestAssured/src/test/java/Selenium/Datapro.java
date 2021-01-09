package Selenium;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;
 
public class Datapro {

	@DataProvider  (name = "data-provider")
 public Object[][] dpMethod(){
 return new Object[][] {{"First-Value"}, {"Second-Value"}};
 }
 
    @Test (dataProvider = "data-provider")
    public void myTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }
    
    @Test (dataProvider = "data-provider", dataProviderClass = Datapro.class)
    public void myTest1 (String val) {
        System.out.println("Current Status : " + val);
    }
    
    
}