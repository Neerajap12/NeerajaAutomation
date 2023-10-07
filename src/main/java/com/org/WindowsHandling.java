package com.org;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsHandling {
	public static Set<String> all;
	public static Iterator<String> it;
	public static String parent,linkedIn,facebook,twitter,youtube;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		parent = driver.getWindowHandle();
		System.out.println(parent);
		WebElement lIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		lIcon.click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			linkedIn = it.next();
			if(!parent.equals(linkedIn))
			{
				driver.switchTo().window(linkedIn);
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		WebElement fIcon = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		fIcon.click();
		all = driver.getWindowHandles();
		it = all.iterator();
		while(it.hasNext())
		{
			facebook = it.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.switchTo().window(linkedIn);



			}
}

		
