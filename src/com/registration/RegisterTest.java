package com.registration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends Core{
	
	@Test
	public void registerform(){
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.id("name_3_firstname")).sendKeys("Soujanya1");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Talla");
		
		List<WebElement> maritalStatus = driver.findElements(By.name("radio_4[]"));
		maritalStatus.get(1).click();
		
		List<WebElement> hobbylist = driver.findElements(By.name("checkbox_5[]"));
		hobbylist.get(1).click();
		
		Select countryName = new Select(driver.findElement(By.id("dropdown_7")));
		countryName.selectByIndex(2);
		
		Select dateMonth = new Select(driver.findElement(By.id("mm_date_8")));
		dateMonth.selectByValue("4");
		
		Select dateDay = new Select(driver.findElement(By.id("dd_date_8")));
		dateDay.selectByValue("2");
		
		Select dateYear = new Select(driver.findElement(By.id("yy_date_8")));
		dateYear.selectByVisibleText("1988");
		
		driver.findElement(By.xpath("//input[@id='phone_9']")).sendKeys("2703970325");;
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Souj1");
		driver.findElement(By.xpath("//input[@id='email_1']")).sendKeys("talla1souj@gmail.com");
		
		driver.findElement(By.id("description")).sendKeys("Good at work");
		driver.findElement(By.xpath("//input[@id='password_2']")).sendKeys("swastik@1225");
		driver.findElement(By.xpath("//input[@id='confirm_password_password_2']")).sendKeys("swastik@1225");
		driver.findElement(By.name("pie_submit")).click();
	}

}
