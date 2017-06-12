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

public class Droppable extends Core {

	@FindBy(linkText = "Droppable")
	WebElement droplink;

	@FindBy(id = "draggableview")
	WebElement dragfrom;

	@FindBy(id = "droppableview")
	WebElement dropto;

	@Test
	public void dropAction() {
		PageFactory.initElements(driver, this);
		droplink.click();
		Actions dragdropaction = new Actions(driver);
		dragdropaction.dragAndDrop(dragfrom, dropto).build().perform();

	}

}
