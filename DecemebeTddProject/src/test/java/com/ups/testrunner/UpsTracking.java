package com.ups.testrunner;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsTracking {

	public static void main(String[] args) throws InterruptedException {
		
	
		
	
		WebDriver chromeDriver = new ChromeDriver(); //Upcasting
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		chromeDriver.get("https://www.ups.com/lasso/login");
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement userID  = chromeDriver.findElement(By.name("userID"));
		WebElement password = chromeDriver.findElement(By.xpath("//*[@id='pwd']"));
		WebElement loginButton = chromeDriver.findElement(By.id("submitBtn"));
		
		
	
		
		userID.sendKeys("WER");
		Thread.sleep(2000);
		password.sendKeys("password123456789");
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		chromeDriver.close();
		
		 
				}
				}
			
		
		
		
		
		
		
		
	
