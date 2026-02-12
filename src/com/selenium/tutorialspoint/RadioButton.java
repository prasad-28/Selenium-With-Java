package com.selenium.tutorialspoint;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class RadioButton {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();

		// Launch TutorialsPoint Text Box practice page
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Launch TutorialsPoint Text Box Page ");


		// Navigate to Radio Button Page
		WebElement radioBtnPage = driver.findElement(By.linkText("Radio Button"));
		radioBtnPage.click();
		Thread.sleep(3000);
		System.out.println("Clicked Radio Button Link Page");
		
		// Clicked on Radio Button Yes
		WebElement radioButtonYes = driver.findElement(By.className("form-check-input"));
		
		radioButtonYes.click();
		
		Thread.sleep(3000);
		
		System.out.println("Select: Yes");
		
		
		// Clicked on Radio Button Impressive
		WebElement radioButtonImpressive = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));
		
		radioButtonImpressive.click();
		
		Thread.sleep(2000);
		
		System.out.println("Select: Impressive");
		

	}

}
