package com.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chrome {
	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://javabykiran.com/liveproject/index.html");
		driver.manage().window().maximize();
		
		
	}

}
