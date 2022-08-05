package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		return driver;
	}

	public static void selectValueFromDropdown(WebElement element, String option) {
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}

	public static void selectDateFromDatePicker(WebDriver driver, String date) {
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public static void clickUsingJavaScript(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public static void takeScreenshot(WebDriver driver, String name) {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./src/test/resources/screenshot/" + name + ".png"));
		} catch (Exception e) {

		}
	}

}
