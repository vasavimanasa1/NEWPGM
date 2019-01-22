package com.selenium.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpatths 
{
	public static WebDriver d;
	@BeforeMethod
	public static void Start()
	{
		
		System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
		d= new FirefoxDriver();
		//d=new HtmlUnitDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
				
	}

	@AfterMethod
	public static void teardown() throws Exception
	{
		d.quit();
		Thread.sleep(2000);
	}
	
	@Test
	public static void xpath() throws Exception
	{
		/*d.get("file:///C:/Users/Gowthami/Downloads/XPath.html");
		d.findElement(By.xpath("//input[@id='b'][last()-1]")).sendKeys("manasa");
		
		d.findElement(By.xpath("//input[@name='a'][position()=2]")).sendKeys("krishna");
		
		
		
		d.get("https://jqueryui.com/support/");
		
		d.findElement(By.xpath("//*[@id=\"menu-top\"]/li[5]/a")).click();
		
		d.findElement(By.xpath("//*[@id=\"menu-top\"]/li[6]/a")).click();
		*/
		
		
		
		d.get("https://en-gb.facebook.com/");
		Select s=new Select(d.findElement(By.id("month")));
		s.selectByIndex(3);
		System.out.println("the selected option is"+s.getFirstSelectedOption().getText());
		List<WebElement> l=d.findElements(By.id("month"));
		//System.out.println(l.size());
		for(WebElement e:l)
		{
			System.out.println("The months are"+e.getText());
		
		}
		
		
		
		Select day=new Select(d.findElement(By.id("day")));
		List<WebElement> de=day.getOptions();
		for(int i=0;i<de.size();i++)
		{
			System.out.println("The days are"+de.get(i).getText());
		}
		
		
		
		Thread.sleep(5000);
	}
	
	

}
