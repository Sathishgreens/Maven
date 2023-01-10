package org.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	WebDriver driver;
	@Given("Url should be Launched")
	public void url_should_be_launched() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("User Enters UserName and Password")
	public void user_enters_user_name_and_password(DataTable dataTable) {
		
		List<String> asList = dataTable.asList(String.class);
		//Map<String, String> asMap = dataTable.asMap();
		driver.findElement(By.id("email")).sendKeys(asList.get(0));
		//driver.findElement(By.id("email")).sendKeys(asMap.get("1234"));
		driver.findElement(By.id("pass")).sendKeys("123");
	}

	@Then("Take Screenshot")
	public void take_screenshot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\FrameWork\\testing.png");
		
		FileUtils.copyFile(screenshotAs, file);
	}
	@When("User Clicks Login Button")
	public void user_clicks_login_button() {
	    driver.findElement(By.name("login")).click();
	}

}
