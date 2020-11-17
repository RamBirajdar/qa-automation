// this code is written to validate positive and negative scenario.

// Still code need to add for positive test scenario...

package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Errmsg1 {
	
	static String Uname1;
	static String Pwd1;
	static String iteration;
	static int i;
	
	
	public static String Uname() {
		Uname1 = "birajdarram7@gmail.com";
		return Uname1;
	}
	
	public static String pwd() {
		Pwd1 = "tets";
		return Pwd1;
	}
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com");
		
		for(i = 1; i<=5; i++) {
			
			if(i==1) {
				Uname1 = "birajdarram7@gmail.com"; // Provided correct user name
				Pwd1 = "Aaiepapa@123"; // provided incorrect password
				
			}else if(i==2) {
				
				Uname1 = "irajdarram7@gmail.com"; // email id is incorrect
				Pwd1 = "Aaiepapa@123";
			}else if(i==3) {
				
				Uname1 = "birajdarram7@gmail.com";
				Pwd1 = "iepapa@123"; // provided password is incorrect 
			}else if(i==4) {
				
				Uname1 = "";  // User name is empty
				Pwd1 = "Aaiepapa@123";
				
			} else if(i==5) {
				
				Uname1 = "birajdarram7@gmail.com";  
				Pwd1 = ""; // Password is empty
				
			}
			
			System.out.println("Test");
		
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email")).sendKeys(Uname1);
		driver.findElement(By.id("passwd")).sendKeys(Pwd1);
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		
		//System.out.println(driver.getCurrentUrl());
		
		String ErrMsg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li")).getText(); // Capturing the error msg
		
		
		System.out.println("Authentication filure message : "+ErrMsg);
		
		
		if(ErrMsg.contains("An email address required.")) {
			
			System.out.println("Handled Empty userName - Test case passed.");
			
		} else if(ErrMsg.contains("Password is required.")) {
			
			System.out.println("Handled Empty Password - Test case passed.");
			
		} else if(ErrMsg.contains("Authentication failed")) {
			
			System.out.println("Handled incorrect UserName or Password - Test case passed.");
			
		} else if(ErrMsg.contains("Invalid password.")) {
			
			System.out.println("Handled incorrect Password - Test case passed.");
			
		}
		
		}
		
		System.out.println("Closing the browser....!!");
		
		driver.close();
		
		System.out.println("All the validation positive and negative is done and browser is also closed..!!");
	}

}
