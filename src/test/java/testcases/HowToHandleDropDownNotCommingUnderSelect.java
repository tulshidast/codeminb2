package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToHandleDropDownNotCommingUnderSelect {

	@Test
	public void dropDown() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.airvistara.com/in/en/vistara-exclusives/vistara-direct?utm_source=google&utm_medium=search&utm_campaign=brand-exact&utm_content=vd&utm_term=vistara&ef_id=Cj0KCQjw852XBhC6ARIsAJsFPN2W93Y3PKHcOY54bUGp-alVTIfWTTVmwL0V3uz0KDObQPxlFQtp58YaAh-_EALw_wcB:G:s&s_kwcid=AL!596!3!511212724204!e!!g!!vistara&gclid=Cj0KCQjw852XBhC6ARIsAJsFPN2W93Y3PKHcOY54bUGp-alVTIfWTTVmwL0V3uz0KDObQPxlFQtp58YaAh-_EALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow')]")).click();

		driver.findElement(By.xpath("//ul[@id='country-scroll']//li/span[text()='Nepal']")).click();
	}

}
