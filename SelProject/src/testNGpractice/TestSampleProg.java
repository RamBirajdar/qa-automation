package testNGpractice;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSampleProg {

	@Test
	
	public void testNgpractice() {
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
				
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		String Page_title = driver.getTitle();
		
	    Assert.assertEquals(Page_title, "Login - My Store");

	}

}
