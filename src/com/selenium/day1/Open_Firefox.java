package com.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Open_Firefox {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();

		driver.get("https://javabykiran.com/liveproject/index.html");
		driver.manage().window().maximize();

		System.out.println("url opened on browser.");

		WebElement userElement = driver.findElement(By.id("email"));

		Thread.sleep(1000);
		userElement.sendKeys("kiran@gmail.com");
		System.out.println("Email entered in input field");

		WebElement passElement = driver.findElement(By.id("password"));

		Thread.sleep(1000);
		passElement.sendKeys("123456");
		System.out.println("Password entered in password field");

		WebElement submitElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));

		submitElement.click();
		System.out.println("Sumbit button clicked");
		Thread.sleep(6000);

		WebElement logoutElement = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a"));

		logoutElement.click();

		System.out.println("Logged out successfully");

	}

}
