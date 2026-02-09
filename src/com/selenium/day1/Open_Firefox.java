package com.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Firefox {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://javabykiran.com/liveproject/index.html");
		driver.manage().window().maximize();
	}

}
