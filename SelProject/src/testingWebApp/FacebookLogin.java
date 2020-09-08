package testingWebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		// Initialize browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 
		// Open Google
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		//driver.close();
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
		email.sendKeys("birajdarram7@gmail.com");					
		password.sendKeys("Fuck@123");	
		WebElement login = driver.findElement(By.id("u_0_a"));
		
		login.click();
		
	}

}
