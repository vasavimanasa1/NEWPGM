package com.selenium.Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class RobotClass
 
{
	static WebDriver d;
	public static void main(String args[]) throws AWTException
	{
		
	
	Robot robot=new Robot();
	System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
	d= new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	d.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	
	d.get("https://www.sendspace.com/");
	d.findElement(By.xpath("//button[text()='Browse']")).click();
	
	StringSelection stringselection= new StringSelection("C:\\Users\\Gowthami\\Desktop\\Manasa Selenium Study Plan.xlsx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	robot.setAutoDelay(3000);
	
	
	
	
	
	
	}
}
