package com.Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","./BrowserUtils/geckodriver.exe"); 
				driver.get("http://localhost:8080/medicare/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				WebElement Signup=driver.findElement(By.xpath("//li/a[contains(text(),'Sign Up')]"));
				Signup.click();
				WebElement Firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
				Firstname.sendKeys("Divya");
				WebElement Lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
				Lastname.sendKeys("KV");
				WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
				Email.sendKeys("divya123@gmail.com");
				WebElement Phonenumber=driver.findElement(By.xpath("//input[@id='contactNumber']"));
				Phonenumber.sendKeys("1234567890");
				WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
				Password.sendKeys("divya@123");
				WebElement ConfirmPassword=driver.findElement(By.xpath("//input[@id='confirmPassword']"));
				ConfirmPassword.sendKeys("divya@123");
				WebElement Supplier=driver.findElement(By.xpath("//input[@id='role1']"));
				Supplier.click();
				WebElement Submit=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
				Submit.click();
				Thread.sleep(2000);
				WebElement Address=driver.findElement(By.xpath("//input[@id='addressLineOne']"));
				Address.sendKeys("deeksha residency");
				WebElement Address2=driver.findElement(By.xpath("//input[@id='addressLineTwo']"));
				Address2.sendKeys("123");
				WebElement City=driver.findElement(By.xpath("//input[@id='city']"));
				City.sendKeys("Bangalore");
				WebElement Postcode=driver.findElement(By.xpath("//input[@id='postalCode']"));
				Postcode.sendKeys("123456");
				WebElement State=driver.findElement(By.xpath("//input[@id='state']"));
				State.sendKeys("divya@123");
				WebElement Country=driver.findElement(By.xpath("//input[@name='country']"));
				Country.sendKeys("india");
//				WebElement Back=driver.findElement(By.xpath("//button[@name='_eventId_personal']"));
//				Back.click();
				
				WebElement Confirm=driver.findElement(By.xpath("//button[@name='_eventId_confirm']"));
				Confirm.click();
				Thread.sleep(2000);
				WebElement FinalSubmit=driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']"));
				FinalSubmit.click();
//				WebElement EditPersonalDetails=driver.findElement(By.xpath("//a[@class='btn btn-primary'][1]"));
//				EditPersonalDetails.click();
//				I am not able to find the locator for the edit the billing details 
//			WebElement EditBillingDetails=driver.findElement(By.xpath("//a[@class='btn btn-primary'][2]"));
//				EditBillingDetails.click();
				
//				driver.close();
	}

}
