package com.extent;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentTest {
	public static ChromeDriver driver;
	public static ExtentReports report;
	public static com.relevantcodes.extentreports.ExtentTest test;
	public static int i=0;

	@BeforeSuite
	public void begin()
	{
		report=new ExtentReports(".//reports//HRMAppReport.html");
		test = report.startTest("Verify user is able to login hrm with valid credentials");
		report.addSystemInfo("Author", "Padma");
		report.addSystemInfo("userstory", "US10204");
		report.addSystemInfo("Environment", "QA");
	}
	
	
	@Test
	public void hrm() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		test.log(LogStatus.PASS,"Entered username"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		test.log(LogStatus.PASS,"Entered password"+test.addScreenCapture(snap()));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		test.log(LogStatus.PASS,"User Loged Into HRM"+test.addScreenCapture(snap()));
		
	}
	
	public String snap() throws IOException
	{
		Random r=new Random();
		String dummy="";
		if(r.nextInt()!=0)
		{
			i=i+1;
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest=new File(".//images//pic"+i+".png");
			FileUtils.copyFile(src, dest);
			dummy=dest.getAbsolutePath();
		}
		return dummy;
	}
	
	@AfterSuite
	public void finish()
	{
		report.endTest(test);
		report.flush();
	}
}


