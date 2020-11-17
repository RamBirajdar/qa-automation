package tstpakg;

import org.openqa.selenium.By;

public class NegativeUserDefinedClsExtends extends UserDefinedMethodTestcase{
	
	
	public static void main(String args[]) {
		// Test cases : verify negative login functionality(Invalid credential)
		
		// Below fist line of code is to create object and access user defined methods from "UserDefinedMethodTestcase" method
		
		NegativeUserDefinedClsExtends obj1 = new NegativeUserDefinedClsExtends();
		
				
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		// Accessing launchbrowser user defined method 
		obj1.launchBrowser();
		
		// Accessing launchbrowser user defined method 
		
		// Valid user name is "birajdarram7@gmail.com" and password is "Aaiepapa@123"
		
		// Below passed usernamd and password is incorrect
		
		obj1.loginusr("birajdarram000@gmail.com", "hello@123457");
		
		String ErrorMsg = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
		
		System.out.println("Error Message - "+ ErrorMsg);
		
		if(ErrorMsg.contains("Authentication failed.")) {
			System.out.println("Negative scenario with invalid password is handeled : test passed");
			
		} else {
			
			System.out.println("Negative scenario with invalid password is not handeled : test failed");
		}
	}

}
