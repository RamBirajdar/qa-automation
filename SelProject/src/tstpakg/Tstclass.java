package tstpakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.google.com");
		driver.close();

	}

}
