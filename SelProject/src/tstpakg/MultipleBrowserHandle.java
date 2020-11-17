package tstpakg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserHandle {

	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://epfindia.gov.in/site_en/index.php");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/span")).click();
		
		driver.findElement(By.xpath("/html/body/nav/div/div/div/ul/li[9]/a")).click();
		//driver.close();
		
		String winhandle = driver.getWindowHandle();
		
		System.out.println("WIndow handle String "+ winhandle);
		
		Set<String> browsercount = driver.getWindowHandles(); // browsers unique number
		
		System.out.println("No of window opened : "+ browsercount); // Will print browsers unique number
		
		System.out.println("Total browsers opened - "+browsercount.size()); // It will print no of browsers opened. ex - 1,2,3,4..N
		
		for(String mbrowsers:browsercount) {
			if(! mbrowsers.equals(winhandle)) {
				System.out.println(driver.getCurrentUrl());
			}
			driver.switchTo().window(winhandle);
			System.out.println(driver.getCurrentUrl());
		}
		
		//driver.close();
		
		//driver.quit();
	}
}
