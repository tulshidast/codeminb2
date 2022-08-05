package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {

	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		this.driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test plan");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		this.driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	}

	@Test
	public void anotations1() {
		System.out.println("This is testng test1");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("fName");
	}

	@Test
	public void anotations2() {
		System.out.println("This is testng test2");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lName");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
		driver.quit();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test plan");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
