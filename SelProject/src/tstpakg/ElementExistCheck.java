package tstpakg;

//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementExistCheck{
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
	/*	boolean elementEx = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
		if(elementEx = true) {*/
		
		try {
		if(driver.findElement(By.linkText("Gmail")).isDisplayed()) {
			
			System.out.println("Gmail Link Exists - Test case passed");
		} 
		
		
		} catch(NoSuchElementException e1) {
			System.out.println("Gmail Link does not exists - Test case failed");
		}
		
		driver.close();
	}
}