package com.selenium.alltopics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ColourDetection  extends BaseClass
{

	@Test
	public void colourDET() 
	{
		d.get("https://www.onlinesbi.com/");
		System.out.println("title is:"+d.getTitle());
		System.out.println("Page source is::"+d.getPageSource());
		System.out.println("Current url is:"+d.getCurrentUrl());
		System.out.println("Attribute of logo is::"+d.findElement(By.id("logo")).getAttribute("href"));;
	}
}
