package org.hcl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ticket {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Ticketech\\Driver\\chromedriver.exe");
		WebDriver Tech = new ChromeDriver();
		Tech.get("http://13.90.86.98:8084/Home/HomePage");
		Tech.manage().window().maximize();
		
		WebElement txtuser = Tech.findElement(By.id("txtUserName"));
		txtuser.sendKeys("supersuper@gmail.com");
		
		WebElement txtpass = Tech.findElement(By.id("txtPassword"));
		txtpass.sendKeys("Super");
		
		WebElement btn = Tech.findElement(By.id("btnLogin"));
		btn.click();
			
		WebElement btn1 = Tech.findElement(By.id("txtSearch"));
		btn1.sendKeys("SFC001");
				
		WebElement sle = Tech.findElement(By.name("SFC"));
		sle.click();
		
		WebElement sle1 = Tech.findElement(By.id("liRate"));
		sle1.click();
		
		WebElement sle2 = Tech.findElement(By.name("RegularRates"));
		sle2.click();
		
		WebElement sle3 = Tech.findElement(By.className("panel-title"));
		sle3.click();
	}

}
