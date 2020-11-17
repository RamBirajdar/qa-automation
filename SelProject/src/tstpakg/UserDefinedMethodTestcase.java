package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserDefinedMethodTestcase{
	
	
	public static WebDriver driver;
	
	// Below method is to launch browser
	
	public void launchBrowser() {
		
		driver = new FirefoxDriver();
	}
	
	// Method without parameter
	
	public void loginusr() {
		
				
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("birajdarram7@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("Aaiepapa@123");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
	}
	
	// Method with parameter
	
	public void loginusr(String userName, String Password) {
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys(userName);
		
		driver.findElement(By.id("passwd")).sendKeys(Password);
		
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		UserDefinedMethodTestcase obj_loginusr = new UserDefinedMethodTestcase();
		
		obj_loginusr.launchBrowser();
		
		obj_loginusr.loginusr();
		
		driver.close();
		
		Thread.sleep(5000);
		
		obj_loginusr.launchBrowser();
		
		obj_loginusr.loginusr("birajdarram7@gmail.com", "Aaiepapa@123");
		
		
	}
}