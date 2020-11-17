package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramePractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		
		// below commented code is to find the frame by index and click on expected link
		/*driver.switchTo().frame(2);
		
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a\r\n" + 
				"")).click();*/
		
		// below code is to find the frame using frame name and click on expected link
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a\r\n" + 
				"")).click();
	}
}
