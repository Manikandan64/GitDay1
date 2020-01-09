package org.hcl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Ticketech\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement con = driver.findElement(By.xpath ("//a[@href='contact.php']"));
		con.click();
		
		//WebElement name = driver.findElement(By.xpath("//input[type='text']"));
		//name.sendKeys("Manikandan");
		
		WebElement name = driver.findElement(By.id("InputName"));
		name.sendKeys("Manikandan");
		
		WebElement email = driver.findElement(By.id("InputEmail1"));
		email.sendKeys("manihcl@gmail.com");
		
		WebElement phno = driver.findElement(By.id("InputSubject"));
		phno.sendKeys("8840144464");

		WebElement crse = driver.findElement(By.xpath("//select[name='courses']"));
		crse.sendKeys("Software Testing");
		
		WebElement brch = driver.findElement(By.xpath("//select[name='branch']"));
		brch.sendKeys("OMR");
		
		WebElement time = driver.findElement(By.xpath("//select[name='time']"));
		time.sendKeys("Immediatly");
		
		WebElement msg = driver.findElement(By.xpath("//textarea[class='form-control input-message']"));
		msg.sendKeys("Kindly contact me for the course details and fees");
		

}}
