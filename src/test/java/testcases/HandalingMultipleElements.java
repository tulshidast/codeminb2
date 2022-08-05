package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandalingMultipleElements {

	@Test
	public void handalingMultipleElements() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> linksOnGooglePage = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on google page: " + linksOnGooglePage.size());
		for (WebElement element : linksOnGooglePage) {
			System.out.println(element.getAttribute("href"));
		}

	}
}
