package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandleMultipleWindows {

	@Test
	public void handleWindows() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parentWindowHandle = driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("//button[contains(@id,'windowB')]"));
		button.click();
		Set<String> windowHandles = driver.getWindowHandles();

		// WebElement childWindowHeading =
		// driver.findElement(By.xpath("//h1[starts-with(@id,'sampleHeading')]"));
		// System.out.println(childWindowHeading.getAttribute("innerHTML"));
		for (String str : windowHandles) {
			if (!(str.equals(parentWindowHandle))) {
				driver.switchTo().window(str);

				WebElement childWindowHeading = driver.findElement(By.xpath("//h1[starts-with(@id,'sampleHeading')]"));
				System.out.println(childWindowHeading.getAttribute("innerHTML"));
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowHandle);
		button.click();
		driver.quit();
	}

}
