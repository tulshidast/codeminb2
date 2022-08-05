package testcases;

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
import org.testng.annotations.Test;

public class NavigationCommands {

	@Test
	public void nav() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(
				"C:\\Users\\Administrator\\classworkspace\\com.codemind.project\\src\\test\\resources\\test.png"));

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		// javascriptExecutor.executeScript("window.scrollTo(0,
		// document.body.scrollHeight)");
		WebElement element = driver
				.findElement(By.xpath("//span[text()='Frequently repurchased in Beauty and Personal Care']"));
		// javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
		javascriptExecutor.executeScript("window.scrollBy(0,500)");
		javascriptExecutor.executeScript("window.scrollBy(0,-500)");
		javascriptExecutor.executeScript("window.scrollBy(500,0)");
		javascriptExecutor.executeScript("window.scrollBy(-500,0)");
	}

}
