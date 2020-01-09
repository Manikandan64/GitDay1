package org.hcl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hello {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Ticketech\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.google.com/");
		driver.manage().window().maximize();
	
		WebElement txtentry = driver.findElement(By.name("q"));
		txtentry.sendKeys("amazon prime");
		
		Actions acc = new Actions(driver);
		acc.moveToElement(txtentry).perform();
		
		WebElement btn = driver.findElement(By.name("btnK"));
		btn.click(); 
}
}

