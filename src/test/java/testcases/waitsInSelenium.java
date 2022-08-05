package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.Utility;

public class waitsInSelenium {
	@Test
	public void waitsInSeleniumWeb() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		WebElement clickButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		Utility.clickUsingJavaScript(clickButton, driver);

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		// wait.until(ExpectedConditions.alertIsPresent());

		// Fluent wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(10));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		// alert.sendKeys("alert accepted");
		alert.accept();
		// alert.dismiss();
	}
}
