package com.selenium.tutorialspoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTables {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();

		// Launch TutorialsPoint Text Box practice page
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Opened Text Box Practice Page");

		// Navigate to Web tables Page
		WebElement webTablePage = driver.findElement(By.linkText("Web Tables"));
		webTablePage.click();
		Thread.sleep(3000);
		System.out.println("Navigated to: Web Tables page");

		// Clicked: Add Button
		WebElement addButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[1]/button"));
		addButton.click();
		Thread.sleep(3000);
		System.out.println("Clicked: Add button");
	
//		// Entered: First Name 
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("Gangaprasad");
		Thread.sleep(2000);
		System.out.println("Entered: First Name");

		// Entered: Last Name
		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys("Panchal");
		Thread.sleep(2000);
		System.out.println("Entered: Last Name");

		// Entered: Email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Gangaprasad@gmail.com");
		Thread.sleep(2000);
		System.out.println("Entered: Email address");

		// Entered: Age
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("0025");
		Thread.sleep(2000);
		System.out.println("Entered: Age");

		// Entered: Salary
		WebElement salary = driver.findElement(By.id("salary"));
		salary.sendKeys("45000.00000000000000");
		Thread.sleep(2000);
		System.out.println("Entered: Salary");

		// Entered: Department
		WebElement department = driver.findElement(By.id("deparment"));
		department.sendKeys("QA");
		Thread.sleep(2000);
		System.out.println("Entered: Department");

		// Submitted: Login Form
		WebElement login = driver.findElement(By.xpath("//*[@id=\"RegisterForm\"]/div[2]/input"));
		login.click();
		Thread.sleep(2000);
		System.out.println("Submitted: Login form");

		// Closed: Pop-up window
		WebElement closeButton = driver.findElement(By.xpath("//*[@id=\"staticBackdropLive\"]/div/div/div/button"));
		closeButton.click();
		Thread.sleep(2000);
		System.out.println("Closed: Login popup");

		driver.quit();
	}

}
