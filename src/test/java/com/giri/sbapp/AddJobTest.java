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

class AddJobTest {

	@Test
	void test() {
		WebDriver driver  = new ChromeDriver();
		driver.get("http://localhost:3000/View");
	    driver.manage().window().setSize(new Dimension(1536, 824));
	    driver.findElement(By.linkText("Add +")).click();
	    driver.findElement(By.id("field")).click();
	    driver.findElement(By.id("field")).sendKeys("Java");
	    driver.findElement(By.name("applicantName")).click();
	    driver.findElement(By.name("applicantName")).sendKeys("Sachin");
	    driver.findElement(By.name("result")).click();
	    driver.findElement(By.name("result")).sendKeys("Pass");
	    driver.findElement(By.cssSelector(".btn")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Data added Successfully", txt);
	}

}
