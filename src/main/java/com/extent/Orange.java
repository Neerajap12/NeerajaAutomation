package com.extent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange {
	  @Test
		public void hRm()
		{
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());

	}

}
