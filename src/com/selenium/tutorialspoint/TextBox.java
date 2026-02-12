package com.selenium.tutorialspoint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
	public static void main(String[] args) throws Exception {
		WebDriver login = new ChromeDriver();
		login.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		login.manage().window().maximize();
		Thread.sleep(5000);


		WebElement fullName = login.findElement(By.id("fullname"));
		fullName.sendKeys("Gangaprasad Panchal");

		Thread.sleep(3000);
		System.out.println("Entered Full Name" );
		WebElement enterEmail = login.findElement(By.id("email"));
		enterEmail.sendKeys("panchalp72723@gmail.com");
		System.out.println("Entered Email Address");
		Thread.sleep(2000);

		WebElement enterAddress = login.findElement(By.id("address"));
		enterAddress.sendKeys("At Pune Maharashtra 411011");

		System.out.println("Entered Address");
		Thread.sleep(2000);

		WebElement enterPass = login.findElement(By.id("password"));
		enterPass.sendKeys("Prasad@2026");
		System.out.println("Entered Password");
		Thread.sleep(2000);

		WebElement clickSubmit = login.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input"));
		clickSubmit.click();
		Thread.sleep(2000);

		System.out.println("Clicked on Submit");

	}
}
