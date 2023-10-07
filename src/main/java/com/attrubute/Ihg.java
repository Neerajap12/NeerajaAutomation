package com.attrubute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ihg {
	@Test
	@Parameters({"first", "last","Email"})
	public void Ihg(String data1, String data2, String data3)
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys(data1);
		WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys(data2);
		WebElement emailID=driver.findElement(By.xpath("//input[@id='email']"));
		emailID.sendKeys(data3);
}
}
