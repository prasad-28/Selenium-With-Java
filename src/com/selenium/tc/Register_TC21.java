package com.selenium.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_TC21 {

	public static void main(String[] args) {
		WebDriver registerMember = new ChromeDriver();
		registerMember.get("https://javabykiran.com/liveproject/index.html");

		registerMember.manage().window().maximize();

		WebElement getRegisterLink = registerMember.findElement(By.xpath("/html/body/div/div[2]/a"));

		getRegisterLink.click();

		// Register new member using selenium

		WebElement name = registerMember.findElement(By.id("name"));

		name.sendKeys("Gangaprasad");

		WebElement mobile = registerMember.findElement(By.id("mobile"));

		mobile.sendKeys("9090909090");

		WebElement email = registerMember.findElement(By.id("email"));

		email.sendKeys("gangaprasad@gmail.com");

		WebElement password = registerMember.findElement(By.id("password"));

		password.sendKeys("987654");

		WebElement registerButton = registerMember.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button"));

		registerButton.click();

	}

}
