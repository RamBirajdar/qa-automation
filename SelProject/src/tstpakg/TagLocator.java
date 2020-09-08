package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagLocator {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("birajdarram7@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Aaiepapa@1239");
		driver.findElement(By.name("SubmitLogin")).click();
		//driver.findElement(By.className("logout")).click();
		//driver.findElement(By.className("login")).click();
		
		String error1 = driver.findElement(By.tagName("li")).getText();
		
		System.out.println(error1);
		
	}

}
