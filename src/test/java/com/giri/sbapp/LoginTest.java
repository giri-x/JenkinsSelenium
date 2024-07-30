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

class LoginTest {

	@Test
	void test() {
		WebDriver driver  = new ChromeDriver();
		
	    driver.get("http://localhost:3000/Login");
	    driver.manage().window().setSize(new Dimension(1536, 824));
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("kw@gmail.com");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("1234");
	    driver.findElement(By.cssSelector(".btnlogin")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Login Success!!!", txt);
	}

}
