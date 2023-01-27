package com.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {

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
		Usernaem.sendKeys("divya345@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("divya@123");
		WebElement Login=driver.findElement(By.xpath("//input[@type='submit']"));
		Login.click();
		
		WebElement Paracetamol=driver.findElement(By.xpath("//div/a[(@class='btn btn-primary pull-right')][1]"));
		Paracetamol.click();
		WebElement Addtocart=driver.findElement(By.xpath("//div/a[(@class='btn btn-success')]"));
		Addtocart.click();
		WebElement ContinueShopping=driver.findElement(By.xpath("//a[(@class='btn btn-warning')]"));
		ContinueShopping.click();
		
		WebElement Next=driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
		Next.click();
		WebElement FirstLastname=driver.findElement(By.xpath("//li/a[(@class='btn btn-default dropdown-toggle')]"));
		FirstLastname.click();
		WebElement Cart=driver.findElement(By.xpath("//li/a/span[@class='glyphicon glyphicon-shopping-cart']"));
		Cart.click();
		WebElement Checkout=driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']"));
		Checkout.click();
		WebElement Select=driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		Select.click();
		WebElement Cardnumber=driver.findElement(By.xpath("//input[(@id='cardNumber')]"));
		Cardnumber.click();
		WebElement Experiymonth=driver.findElement(By.xpath("//input[(@id='expityMonth')]"));
		Experiymonth.click();
		WebElement Experiyyear=driver.findElement(By.xpath("//input[(@id='expityYear')]"));
		Experiyyear.click();
		WebElement CVV=driver.findElement(By.xpath("//input[(@id='cvCode')]"));
        CVV.click();
        WebElement Pay=driver.findElement(By.xpath("//a[(@class='btn btn-success btn-lg btn-block')]"));
        Pay.click();
        
	}

}
