package tstpakg;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndianRailwayLogin{
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\eclipse-workspace\\SelProject\\Driver\\Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		/*Alert alertobj = driver.switchTo().alert();
		
		alertobj.accept();*/
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button")).click();
	
		driver.findElement(By.xpath("//*[@id=\"loginText\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"userId\"]")).sendKeys("ram_b_bi");
		
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("rqb620");
		
		Scanner captchaInput = new Scanner(System.in);
		 
		System.out.println("Enter Captcha");
		
		String Captcha = captchaInput.nextLine();
		
		driver.findElement(By.xpath("//*[@id=\"nlpAnswer\"]")).sendKeys(Captcha);
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[2]/app-login/p-dialog[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		
		
		
	    boolean welcomePG  = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]/span")).isDisplayed();
		
		//System.out.println(welcomePG);
		
		if(welcomePG = true) {
			System.out.println("Login Success - Test case passed");			
		}else {
			System.out.println("Login Unsuccess - Test case failed");
		}
	}
}