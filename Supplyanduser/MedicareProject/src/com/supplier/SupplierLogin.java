package com.supplier;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupplierLogin {

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
				Usernaem.sendKeys("divya6789@gmail.com");
				WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
				password.sendKeys("divya@123");
				WebElement Login=driver.findElement(By.xpath("//input[@type='submit']"));
				Login.click();
			}

		
	}


