package com.selenium.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TC05 {
	
	public static void main(String[] args) {
		WebDriver registerLink = new ChromeDriver();
		registerLink.get("https://javabykiran.com/liveproject/index.html");
		
		registerLink.manage().window().maximize();
		
		WebElement getRegisterLink = registerLink.findElement(By.xpath("/html/body/div/div[2]/a"));
		
		getRegisterLink.click();
	}

}
