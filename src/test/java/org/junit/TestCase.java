package org.junit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	static WebDriver driver;
	@After
	public void tc5() throws IOException {
		System.out.println("After");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\FrameWork\\s.png");
		
		FileUtils.copyFile(screenshotAs, file);
	}
	
	@Before
	public void tc4() {
		System.out.println("Before");
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void tc1() {
		System.out.println("tc1");
		driver.findElement(By.id("email")).sendKeys("1234");
		driver.findElement(By.id("pass")).sendKeys("99999");
	}
//	@Test
//	public void tc7() {
//		System.out.println("tc7");
//	}
	@AfterClass
	public static void tc2() {
		System.out.println("After Class");
		driver.close();
	}
	@BeforeClass 
	public static void tc3() {
		System.out.println("Before Class");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
	}

}
