package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.cyient.base.BrowserBase;

public class FindcruiseTest extends BrowserBase  {
	@Test
	public void findCruise() {

		
		driver.findElement(By.xpath("//div[@class='email-capture__body']//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//button[@id='rciHeaderOpenSidenav']")).click();
		driver.findElement(By.xpath("//a[@id='rciHeaderSideNavMenu-1']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'2021-2022 Cruises')]")).click();
		driver.findElement(By.xpath("//input[@id='rciFirstName']")).sendKeys("rutwik");
		driver.findElement(By.xpath("//input[@id='rciLastName']")).sendKeys("Kulkarni");
		Select selectCountry = new Select(driver.findElement(By.xpath("//select[@class='md-input']")));
		selectCountry.selectByVisibleText("India");
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
	}
}
