package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowLaun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.i2soft.com");
		
	}

}
