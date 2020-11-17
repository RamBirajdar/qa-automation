package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.carmax.com/");
		
		// create action builder instance by passing web driver instance
		
		Actions builder = new Actions(driver);
		WebElement menuElement = driver.findElement(By.className("header-helpful-links-title"));
		builder.moveToElement(menuElement).build().perform();
		driver.findElement(By.className("header-link"));
	}

}
