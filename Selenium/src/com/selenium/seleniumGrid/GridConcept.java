package com.selenium.seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.selenium.alltopics.BaseClass;

public class GridConcept 

{
	WebDriver d;
@Test
public void gridconc() throws MalformedURLException
{
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Drivers\\chromedriver.exe");
	/*ChromeOptions options=new ChromeOptions();
	WebDriver d=new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), options);*/
	
	DesiredCapabilities cap= DesiredCapabilities.chrome();
     d=new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), cap);
	
	/*System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Drivers\\geckodriver.exe");
	DesiredCapabilities cap1= DesiredCapabilities.firefox();
	 d=new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), cap1);*/
	d.get("https://www.google.com/");
	System.out.println("Title is"+d.getTitle());
	d.quit();
}

}
