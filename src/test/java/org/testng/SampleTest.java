package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	WebDriver driver;

	
	

	

	@Test(groups="Smoke")
	private void tc1() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Sarath");

		driver.findElement(By.id("pass")).sendKeys("12345");

	}

	@Test(groups="Sanity")
	private void tc2() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Sathish");

		driver.findElement(By.id("pass")).sendKeys("12345");

	}

	@Test(groups="Smoke")
	private void tc3() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Sababathy");

		driver.findElement(By.id("pass")).sendKeys("12345");

	}

	@Test(groups="regression")
	private void tc4() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("Xavier");

		driver.findElement(By.id("pass")).sendKeys("12345");

	}


}
