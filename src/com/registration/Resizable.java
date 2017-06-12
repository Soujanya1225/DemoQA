package com.registration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Resizable extends Core{

	@FindBy(linkText = "Resizable")
	private WebElement resizableLink;

	@FindBy(xpath = "//*[@id='resizable']/div[3]")
	private WebElement resizableLoc;

	@Test
	public void resizable() throws InterruptedException {
		PageFactory.initElements(driver, this);
		resizableLink.click();
		Thread.sleep(3000);
		Actions resize = new Actions(driver);
		resize.clickAndHold(resizableLoc).moveByOffset(90, 100).release().build().perform();
	}
}
