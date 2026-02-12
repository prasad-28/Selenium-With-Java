package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {

		WebDriver FacebookLogin = new ChromeDriver();

		FacebookLogin.get("https://www.facebook.com/login/");

		FacebookLogin.manage().window().maximize();
	    System.out.println("Landed into login page");
		
		WebElement userName = FacebookLogin.findElement(By.id("email"));
		
		userName.sendKeys("9096929959");
		
		WebElement password = FacebookLogin.findElement(By.id("pass"));
		
		password.sendKeys("Prasad@9");
		
		WebElement login = FacebookLogin.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		
		login.click();
		
//		WebElement logout = FacebookLogin.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a"));
//		
//		logout.click();
	}

}
