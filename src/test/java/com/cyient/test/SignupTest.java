package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.BrowserBase;


public class SignupTest extends BrowserBase{
	
	@Test(priority = 1)
	public void test() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Create an account']")).click();
	
	driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Rutwik");
	driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Kulkarni");

	driver.findElement(By.xpath("//span[text()='Month']")).click();
	driver.findElement(By.xpath("//span[text()=' December ']")).click();
	driver.findElement(By.xpath("//span[text()='Day']")).click();
	driver.findElement(By.xpath("//span[text()=' 5 ']")).click();
	driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("1997");

	driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
	driver.findElement(By.xpath("//span[text()=' India ']")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("rutuk72@gmail.com");
	driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("Feb27@rak");

	driver.findElement(By.xpath("(//span[text()='Select one security question'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='What elementary school did you go to?']")).click();
	driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("smlohiya");

	Actions mouse = new Actions(driver);
	mouse.clickAndHold();

	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='checkbox'] /..")).click();

	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()=' Done ']")).click();

	
	}
	
	
	@Test(priority = 2)
	public void Test() throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//img[@class='highlight__content']/..")).click();
		driver.findElement(By.xpath("//div[@class='brand__logo-redirection']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='headerMainToolbar__menu__icon']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Find a Cruise']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2021-2022 Cruises']")).click();
		
		driver.findElement(By.id("rciFirstName")).sendKeys("Dennis");
		driver.findElement(By.id("rciLastName")).sendKeys("Rich");
		driver.findElement(By.xpath("//select[@class='md-input']")).click();
		driver.findElement(By.xpath("//option[@value='IND']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();

		String actalValue= driver.findElement(By.id("rciEmailAddressMissing")).getText();
		Assert.assertEquals( actalValue,"Missing Email Address");
		
	}
	

}
