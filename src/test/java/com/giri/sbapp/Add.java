package com.giri.sbapp;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Add {

	@Test
	void test() {
		WebDriver driver  = new ChromeDriver();
		 driver.get("http://localhost:3000/View");

		    driver.findElement(By.linkText("Add +")).click();
		    driver.findElement(By.id("field")).click();
		    driver.findElement(By.id("field")).sendKeys("fds");
		    driver.findElement(By.name("applicantName")).click();
		    driver.findElement(By.name("applicantName")).sendKeys("rdsa");
		    driver.findElement(By.name("result")).click();
		    driver.findElement(By.name("result")).sendKeys("dsa");
		    driver.findElement(By.cssSelector(".btn")).click();
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String txt = alert.getText();
			alert.accept();
			assertEquals("Data added Successfully", txt);
	}

}
