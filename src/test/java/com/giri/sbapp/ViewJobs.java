package com.giri.sbapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ViewJobs {

	@Test
	void test() {
		    WebDriver driver  = new ChromeDriver();
		    driver.get("http://localhost:3000/");
		    driver.manage().window().setSize(new Dimension(1536, 824));
		    driver.findElement(By.linkText("View Jobs")).click();
	}

}
