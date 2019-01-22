package com.selenium.alltopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterAnnotation  
{
	static WebDriver d;
	@Test
	@Parameters({"browser","url","email","pass"})
	public static void parameterAnnotation(String browser,String url,String email,String pass) throws Exception
	{
		if(browser.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
			d=new FirefoxDriver();
			
		}
		else
		{
			System.out.println("okkkkkkk");
		}
		d.get(url);
		WebElement username=d.findElement(By.id("email"));
		username.clear();
		username.sendKeys(email);
		Thread.sleep(3000);
		WebElement password=d.findElement(By.id("pass"));
		password.sendKeys("pass");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@value='Log In']")).click();
		d.quit();
		
	}

}
