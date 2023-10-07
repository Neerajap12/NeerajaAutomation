package com.validation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrmverify {
	 @Test
		public void hRm() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());	
			//String exp="https:/www.orangehrm.com";
			//String actual=driver.getCurrentUrl();
			SoftAssert sa=new SoftAssert();
			sa.assertTrue(driver.getCurrentUrl().equals(sa));
			
			//Assert.assertTrue(driver.getCurrentUrl().equals(exp));
					Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Neeraja");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rishik");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

}
}


