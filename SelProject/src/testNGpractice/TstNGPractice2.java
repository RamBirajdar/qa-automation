package testNGpractice;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TstNGPractice2 {
	
	public static WebDriver driver;
	
	@Test
	public void launchBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		driver = new FirefoxDriver();
	}

}
