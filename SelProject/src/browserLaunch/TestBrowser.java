package browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {

	public static void main(String[] args) {
		String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get(URL);
		
		/*driver.findElement(By.id("email")).sendKeys("birajdarram7@gmail.com");*/
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("birajdarram7@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Aaiepapa@1234");
		driver.findElement(By.id("SubmitLogin")).click();
		
		String url = driver.getCurrentUrl();
		
		System.out.println("Url captured.. "+url);
		
		if(url.equals("http://automationpractice.com/index.php?controller=my-account")){
			
			System.out.println("Login Success - Test Passed");
		} else {
			
			System.out.println("Login Unsuccess - Test Failed");
		}
		
		
		//Driver.close();
	}

}
