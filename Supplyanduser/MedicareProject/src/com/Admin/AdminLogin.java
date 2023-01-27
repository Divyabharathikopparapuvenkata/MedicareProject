package com.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:8080/medicare/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				WebElement Signup=driver.findElement(By.xpath("//li/a[contains(text(),'Login')]"));
				Signup.click();
		WebElement Usernaem=driver.findElement(By.xpath("//input[@name='username']"));
		Usernaem.sendKeys("vk@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin");
		WebElement Login=driver.findElement(By.xpath("//input[@type='submit']"));
		Login.click();
		Thread.sleep(2000);
		WebElement FirstLastname=driver.findElement(By.xpath("//li/a[(@class='btn btn-default dropdown-toggle')]"));
		FirstLastname.click();
		WebElement ManageProduct=driver.findElement(By.xpath("//li/a[contains(text(),'Manage Product')]"));
		ManageProduct.click();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Arcnic");
		WebElement brand=driver.findElement(By.xpath("//input[@name='brand']"));
		brand.sendKeys("reddy");
		Thread.sleep(2000);
		WebElement description=driver.findElement(By.xpath("//textarea[@class='form-control']"));
		description.sendKeys("for infection in stomach");
		WebElement unitPrice=driver.findElement(By.xpath("//input[@name='unitPrice']"));
		unitPrice.sendKeys("60");
		WebElement quantity=driver.findElement(By.xpath("//input[@name='quantity']"));
		quantity.sendKeys("600");
		Thread.sleep(2000);
//		WebElement file=driver.findElement(By.xpath("//input[@name='file']"));
//		file.click();
		WebElement categoryId=driver.findElement(By.xpath("//select[@name='categoryId']"));
		categoryId.click();
		Thread.sleep(2000);
		WebElement Antibiotics=driver.findElement(By.xpath("//select/option[contains(text(),'Antibiotics')]"));
		Antibiotics.click();
		WebElement AddnewCategory=driver.findElement(By.xpath("//button[@class='btn btn-warning btn-xs']"));
		AddnewCategory.click();
			Thread.sleep(2000);
		WebElement CategoryName=driver.findElement(By.xpath("//input[@placeholder='Category Name']"));
		CategoryName.sendKeys("for infection");
		WebElement categorydescription=driver.findElement(By.xpath("//textarea[@placeholder='Enter category description here!']"));
		categorydescription.sendKeys("infection control");
		Thread.sleep(2000);
		WebElement save=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		save.click();
		
		
		
	
	
	
	}



	}


