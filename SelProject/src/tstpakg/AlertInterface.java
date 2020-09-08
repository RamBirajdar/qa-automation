package tstpakg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertInterface {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.name("proceed")).click();
		
		Alert alertobj = driver.switchTo().alert();
		
		String errmsg = alertobj.getText();
		
		System.out.println(errmsg);
		
		//alertobj.dismiss(); it will click on cancel button
		
		alertobj.accept(); // it will click on ok button
		
		driver.findElement(By.id("login1")).sendKeys("birajdarram7@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aaiepapa@123");
		
	}

}
