package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditBoxOperation {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("birajdarram7@gmail.com");
		
		System.out.println(email.getTagName());
		
		System.out.println(email.getText());
		
		
		
		System.out.println(email.getAttribute("type"));
				
		email.clear();
		
		String logo1 = driver.findElement(By.className("logo img-responsive")).getText(); // excpetion "NoSuchElementException"
		System.out.println(logo1);
		
		
		
			}

}
