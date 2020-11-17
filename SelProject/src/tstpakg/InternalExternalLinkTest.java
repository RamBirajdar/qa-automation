package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InternalExternalLinkTest{
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		
		//driver.findElement(By.xpath("/html/body/div[5]/div[1]/nav/div/ul/li[4]/a")).click();
		
		driver.findElement(By.linkText("Create account")).click();
		
		String CurURL1 = driver.getCurrentUrl();
		
		//System.out.println(CurURL1);
		
		if(CurURL1.contains("wikipedia.org")) {
			
			System.out.println("It is an internal link redirected to another page in the same application- Test case passed");
			
		}else {
			System.out.println("It is not as expected - Test case failed");
		}
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("selenium.dev/")).click();
		
		
		String URL2 = driver.getCurrentUrl();
		
		if(! URL2.contains("wikipedia.org")) {
			
			System.out.println("It is an external Link redirected to another page in the other application - Test case passed");
		}else {
			
			System.out.println("Not redirected - Test case failed...");
		}
		
		driver.close();
	}
	
}