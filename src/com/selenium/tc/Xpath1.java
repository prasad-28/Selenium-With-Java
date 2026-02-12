package com.selenium.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) {
		WebDriver registerLinkXpath = new ChromeDriver();
		registerLinkXpath.get("https://javabykiran.com/liveproject/index.html");
		
		registerLinkXpath.manage().window().maximize();
		
		WebElement getRegisterLink = registerLinkXpath.findElement(By.xpath("//a[text()='Register a new membership']"));
		
		getRegisterLink.click();
	}

}
