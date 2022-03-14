package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Day5 task1\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement newAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		newAcc.click();

		WebElement txtfirstname = driver.findElement(By.name("firstname"));

		txtfirstname.sendKeys("porselvan");
		
		
		
		
	}

}
