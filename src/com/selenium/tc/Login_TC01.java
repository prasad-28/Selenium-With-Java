package com.selenium.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TC01 {
	public static void main(String[] args) {
		WebDriver logindriver = new ChromeDriver();
		logindriver.get("https://javabykiran.com/liveproject/index.html");
		
		logindriver.manage().window().maximize();
		
		System.out.println("Landed into login page");
		
		WebElement userName = logindriver.findElement(By.className("form-control"));
		
		userName.sendKeys("kiran@gmail.com");
		
		System.out.println("Email Entered");
		
		WebElement password = logindriver.findElement(By.id("password"));
		
		password.sendKeys("123456");
		
		System.out.println("Password Entered");
		
		WebElement submit = logindriver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		
		submit.click();
		
		WebElement logout = logindriver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a"));
		
		logout.click();
		
		System.out.println("Logged Out Successfully");
	}

}
