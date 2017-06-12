package com.registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Core {

	public WebDriver driver;
	
	@BeforeTest
	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\WI{PRO\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}
	
	@AfterTest
	public void endTestCleanUp(){
		driver.close();
		driver.quit();
	}
}
