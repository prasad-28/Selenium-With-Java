package com.selenium.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathwithButton {

	public static void main(String[] args) {
		WebDriver xPathwithButton = new ChromeDriver();
		xPathwithButton.get("https://javabykiran.com/liveproject/index.html");
		
		xPathwithButton.manage().window().maximize();
		
		WebElement signInbtn = xPathwithButton.findElement(By.xpath("//button[text()='Sign In']"));
		
		signInbtn.click();
	}
}
