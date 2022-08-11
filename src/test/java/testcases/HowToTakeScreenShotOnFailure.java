package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Utility;

public class HowToTakeScreenShotOnFailure {

	WebDriver driver;

	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void takeScreenshotOnFailure() {

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(true);

	}

	@Test
	public void takeScreenshotOnFailure2() {

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			Utility.takeScreenshot(driver, result.getName());
		}
	}

}
