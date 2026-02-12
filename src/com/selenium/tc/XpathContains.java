package com.selenium.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/liveproject/index.html");

		driver.manage().window().maximize();

		// XPath With Contains id
//		WebElement enterEmail = driver.findElement(By.xpath("//input[contains(@id, 'email')]"));

		// XPath With Contains type
//		WebElement enterEmail = driver.findElement(By.xpath("//input[contains(@type, 'text')]"));

		// XPath With Contains class
//		WebElement enterEmail = driver.findElement(By.xpath("//input[contains(@class, 'form-control')]"));

		// XPath With Contains Placeholder
		WebElement enterEmail = driver.findElement(By.xpath("//input[contains(@placeholder, 'Email')]"));

		// XPath With Contains with two contains
//		WebElement enterEmail = driver.findElement(By.xpath("//input[contains(@id, 'email') and contains(@class, 'form-control')]"));
		enterEmail.sendKeys("prasad@gmail.com");

		System.out.println("Entered: Email");
	}
}
