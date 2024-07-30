package com.giri.sbapp;

import static org.hamcrest.CoreMatchers.is;
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

class DeleteApplicant {

	@Test
	void test() {
		
		WebDriver driver  = new ChromeDriver();
	    driver.get("http://localhost:3000/View1");
	    driver.manage().window().setSize(new Dimension(1536, 824));
	    driver.findElement(By.cssSelector("tr:nth-child(1).ms-1").id("delete")).click();
//	    driver.switchTo().alert().accept();
	    //assertThat(driver.switchTo().alert().getText(), is("record has deleted"));
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Do you want to delete", txt);
	}

}
