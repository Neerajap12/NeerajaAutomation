package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IhcTest {
	@Test
	public void iHg()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

}

}
