package com.selenium.tutorialspoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {
	public static void main(String[] args) throws Exception {
		WebDriver checkBox = new EdgeDriver();

		// Launch TutorialsPoint Text Box practice page
		checkBox.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		checkBox.manage().window().maximize();
		Thread.sleep(3000);

		// Navigate to Check Box page
		WebElement CheckBoxPage = checkBox.findElement(By.linkText("Check Box"));
		CheckBoxPage.click();
		System.out.println("successfully clicked on checkbox and landed into Check Box field");
		Thread.sleep(3000);

		// Expand Main Level 1 to access child nodes
		WebElement mainLevel1 = checkBox.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]"));
		mainLevel1.click();
		System.out.println("Expanded: Main Level 1");
		Thread.sleep(3000);

		// Expand Sub Level 1 under Main Level 1
		WebElement subLevel1 = checkBox.findElement(By.xpath("//*[@id=\"bf_1\"]/span[1]"));
		subLevel1.click();
		System.out.println("Expanded: Sub Level 1");
		Thread.sleep(3000);

		// Select Last Level 3 checkbox
		WebElement lastlevel3 = checkBox.findElement(By.id("c_io_3"));
		lastlevel3.click();
		System.out.println("Selected: Last Level 3");
		Thread.sleep(3000);

		// Expand Sub Level 2 to view its child checkboxes
		WebElement subLevel2 = checkBox.findElement(By.xpath("//*[@id=\"bf_2\"]/span[1]"));
		subLevel2.click();
		Thread.sleep(3000);
		System.out.println("Expanded: Sub Level 2");

		// Select Last Level 6 checkbox
		WebElement lastlevel6 = checkBox.findElement(By.id("c_io_6"));
		lastlevel6.click();
		System.out.println("Selected: Last Level 6");
		Thread.sleep(3000);

		// Select Last Level 8 checkbox
		WebElement lastlevel8 = checkBox.findElement(By.id("c_io_8"));
		lastlevel8.click();
		System.out.println("Selected: Last Level 8");
		Thread.sleep(3000);

		// Expand Main Level 2 to access nested levels
		WebElement mainLevel2 = checkBox.findElement(By.xpath("//*[@id=\"bs_2\"]/span[1]"));
		mainLevel2.click();
		System.out.println("Expanded: Main Level 2");
		Thread.sleep(3000);

		// Expand Sub Level 3 under Main Level 2
		WebElement sublevel3 = checkBox.findElement(By.xpath("//*[@id=\"bf_3\"]/span[1]"));
		sublevel3.click();
		System.out.println("Expanded: Sub Level 3 ");
		Thread.sleep(2000);

		// Select Last Level 10 checkbox
		WebElement lastLevel10 = checkBox.findElement(By.id("c_io_10"));
		lastLevel10.click();
		System.out.println("Selected: Last Level 10");
		Thread.sleep(2000);

		// Select Last Level 11 checkbox
		WebElement lastLevel11 = checkBox.findElement(By.id("c_io_11"));
		lastLevel11.click();
		System.out.println("Selected: Last Level 11");
		Thread.sleep(2000);

		// Select all checkboxes under Sub Level 4
		WebElement subLevel4 = checkBox.findElement(By.id("c_bf_4"));
		subLevel4.click();
		System.out.println("Selected: Sub Level 4");

	}
}
