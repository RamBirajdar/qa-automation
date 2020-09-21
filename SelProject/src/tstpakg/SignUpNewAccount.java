package tstpakg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpNewAccount {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
		driver.manage().window().maximize();
		driver.findElement(By.name("email_create")).sendKeys("birajd@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		
		Thread.sleep(3000);
		
			
		//driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
			
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		radio.click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Ram");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("birajdar");
		
		driver.findElement(By.id("passwd")).sendKeys("Ram@123");
		
				
		Select drpdwn1 = new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
		
		drpdwn1.selectByIndex(24);
		
		Select drpdwn2 = new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
		
		drpdwn2.selectByIndex(06);
		
		Select drpdwn3 = new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
		
		drpdwn3.selectByIndex(32);
		
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("TestCompany"); // Company 
		
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Khaorsa"); // Address
		
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Latur"); // Address Line2
		
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Latur"); // city
		
		Select state1 = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]"))); //state
		state1.selectByIndex(15);
		
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("41352"); // Zip postal code
		
		Select country1 = new Select(driver.findElement(By.xpath("//*[@id=\"id_country\"]"))); // Country
		country1.selectByIndex(1);
		
		//driver.findElement(By.xpath("//*[@id=\\\"other\\\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\\\"other\\\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("LaturToNilangaRoad"); // Additional Information
		
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("1234567890"); // Home phone
		
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]\r\n" + 
				"")).sendKeys("2545245566"); // Mobile phone
		
		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Kharosa"); 
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[4]/button/span")).click(); // Register button
		
		Thread.sleep(3000);
		
		
		System.out.println(driver.getCurrentUrl());
		
		String SignUp_Url = driver.getCurrentUrl();
		
		if(SignUp_Url.equals("http://automationpractice.com/index.php?controller=my-account")) {
			System.out.println("Successfully regestered and test case is passed.");
		} else{
			System.out.println("User not Successfully regestered and test case is failed.");
		}
		
		System.out.println("Successfully passes test cases..!!!");
		
		}

}
