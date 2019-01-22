package com.selenium.alltopics;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;




public class AutoIt  extends BaseClass
{
	
	
	@Test
	public void testFileupload() throws Exception 
	{
		d.get("https://www.sendspace.com/");
		d.findElement(By.id("upload_file")).click();
		Thread.sleep(4000);
		new ProcessBuilder("C:\\Users\\Gowthami\\Desktop\\Multiplewindows.exe").start(); 
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Upload file']")).click();*/
		Thread.sleep(5000);
	}

	
	}



