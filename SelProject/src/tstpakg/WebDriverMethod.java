package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethod {

	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//String URL;
		//URL = "https://www.facebook.com";
		//driver.get(URL);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("birajdarram7@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Aaiepapa@123");
		driver.findElement(By.name("SubmitLogin")).click();
		driver.findElement(By.className("logout")).click();
		driver.findElement(By.className("login")).click();
		
		/* Below code is practiced for below method
		String Gtitle = driver.getTitle();
		System.out.println(Gtitle);
		
		String getpgsource = driver.getPageSource();
		System.out.println(getpgsource);
		
		String GtCurntUrl = driver.getCurrentUrl();
		System.out.println(GtCurntUrl);
		
		driver.navigate().to("http://automationpractice.com/index.php?controller=password");
		
		String GtCurntUrl2 = driver.getCurrentUrl();
		System.out.println(GtCurntUrl2);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//Thread.sleep(10000); // mili seconds
		//driver.close();
		
		//driver.quit();*/
		
		boolean loginStatus = driver.findElement(By.className("login")).isEnabled();
		System.out.println("Status of Sign in button is : " + loginStatus);
		
		boolean loginDisplayed = driver.findElement(By.className("login")).isDisplayed();
		System.out.println("Element is displayed or not in the current web page : " + loginDisplayed);
		
		driver.manage().window().maximize();
	}
}
