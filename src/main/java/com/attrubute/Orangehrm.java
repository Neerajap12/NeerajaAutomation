package com.attrubute;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Orangehrm {

	public class DataOrangeHRM {

		@Test(dataProvider="good")
		public void hrm(String user, String pwd) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		
		@DataProvider(name="good")
		public Object[][] hyderbad()
		{
			return new Object[][] {{"Admin","admin123"},{"rama","krishna"}};
		}
	}
}
