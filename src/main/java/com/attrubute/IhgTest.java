package com.attrubute;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IhgTest {
	public class IhgTestDemo {

		@Test(dataProvider="good")
		public void hrm(String first, String last,String email,String cemail) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(first);
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(last);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys(cemail);
		}
		
		@DataProvider(name="good")
		public Object[][] hyderbad()
		{
			return new Object[][] {{"firstname","lastname","emailaddress","Confirmationemail"},{"Neeraja","Pamidi","neerajapamidi81@gmail.com","neerajapamidi81@gmail.com"}};
		}
	}

}
