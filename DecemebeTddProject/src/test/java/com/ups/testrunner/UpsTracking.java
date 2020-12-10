package com.ups.testrunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsTracking {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS );
	WebElement Track;
	WebElement Cookies;
	WebElement Errormsg;
	
	
	Track=driver.findElement(By.xpath(//*[@id="stApp_btnTrack"]))
	
	

driver.close();


}
}