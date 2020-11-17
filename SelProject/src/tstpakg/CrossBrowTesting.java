package tstpakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowTesting {

	public static void main(String args[]) {
		
		// test case for mozilla firefox 
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		String PageTitle = driver.getTitle();

		System.out.println(driver.getTitle());
		
		if(PageTitle.equals("Login - My Store")) {
			
			System.out.println("Google application launched - Test Case passed");
			
		} else {
			System.out.println("Google application not launched - Test failed..!!!");
		}
		
		driver.close();
		
	}
}
