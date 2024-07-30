package com.giri.sbapp;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class SignUp {

	@Test
	void test() {
		    WebDriver driver  = new ChromeDriver();
		    driver.get("http://localhost:3000/Login");
		    driver.manage().window().setSize(new Dimension(1536, 824));
		    driver.findElement(By.linkText("Sign up")).click();
		    driver.findElement(By.name("uname")).click();
		    driver.findElement(By.name("uname")).sendKeys("Girivasan");
		    driver.findElement(By.name("pass")).click();
		    driver.findElement(By.name("pass")).sendKeys("girivasan007");
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("giri103@gmail.com");
		    driver.findElement(By.cssSelector(".btton-primary")).click();
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String txt = alert.getText();
			alert.accept();
			assertEquals("Data added Successfully", txt);
	}

}
