package com.selenium.alltopics;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class gettingcolourAttribute extends BaseClass
{
	@Test
	public void colouratrribute() throws Exception
	{
		d.get("http://jqueryui.com/animate/");
		d.switchTo().frame(0);
		d.findElement(By.xpath("//button[contains(text(),'Toggle Effect')]")).click();
		System.out.println("the style attribute is  "+d.findElement(By.id("effect")).getAttribute("style"));
		d.switchTo().defaultContent();
		d.findElement(By.linkText("Show")).click();
		d.switchTo().frame(0);
		Select s=new Select(d.findElement(By.id("effectTypes")));
		s.selectByIndex(2);
		d.findElement(By.xpath("//button[contains(text(),'Run Effect')]")).click();
		d.switchTo().defaultContent();
		d.findElement(By.linkText("Easing")).click();
		d.switchTo().frame(0);
		d.findElement(By.xpath("//div[@class='graph']/div")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id='graphs']/div[2]/div")).click();
		Thread.sleep(2000);
		d.switchTo().defaultContent();
		d.findElement(By.linkText("Switch Class")).click();
		d.switchTo().frame(0);
		String s1=d.findElement(By.xpath("//div[@id='effect']")).getText();
		System.out.println(s1);
		
		
	}
}
