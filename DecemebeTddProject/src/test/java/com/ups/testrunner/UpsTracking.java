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
		chromeDriver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement tracking=chromeDriver.findElement(By.xpath("//*[@id=\"stApp_trackingNumber\"]"));
		tracking.sendKeys("1234");
		Thread.sleep(2000);
		WebElement Track=chromeDriver.findElement(By.xpath("//*[@id=\"stApp_btnTrack\"]"));
		Track.click();
		WebElement Error=chromeDriver.findElement(By.xpath("//*[@id=\"stApp_statusErrorText\"]"));
		if(Error.isDisplayed())
				 {
			System.out.println("Pass");}
			else {System.out.println("fail");
		}
		
		
		Thread.sleep(2000);
		chromeDriver.get("https://www.ups.com/ship/guided/origin?tx=6245488780265810&loc=en_US");
		chromeDriver.close();
		String msg="huimb";
		WebElement Errors=chromeDriver.findElement(By.xpath("//*[@id=\"stApp_error_alert_list2\"]"));
		msg=Errors.getText();
		
		
		
		 
				}
				}
			
		

		
		
		
		
		
	
