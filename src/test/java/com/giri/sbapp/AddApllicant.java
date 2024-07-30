package com.giri.sbapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AddApllicant {

	@Test
	void test() {
		WebDriver driver  = new ChromeDriver();
		driver.get("http://localhost:3000/View1");
	    driver.manage().window().setSize(new Dimension(1536, 824));
	    driver.findElement(By.linkText("Add +")).click();
	    driver.findElement(By.name("name")).click();
	    driver.findElement(By.name("name")).sendKeys("Girivasan");
	    driver.findElement(By.name("experiance")).click();
	    driver.findElement(By.name("experiance")).sendKeys("3-years");
	    driver.findElement(By.name("expertise")).click();
	    driver.findElement(By.name("expertise")).sendKeys("Java");
	    driver.findElement(By.name("jid")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("jid"));
	      dropdown.findElement(By.xpath("//option[. = '11']")).click();
	    }
	    driver.findElement(By.cssSelector(".btn")).click();
	}

}
