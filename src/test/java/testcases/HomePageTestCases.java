package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.Utility;

public class HomePageTestCases {

	HomePage homePage;
	WebDriver driver;

	@BeforeClass
	public void launchUrl() {
		driver = Utility.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
	}

	@Test
	public void verifyFormFiledSelection() throws InterruptedException {
		homePage.setUserNameTextBox();
		homePage.getUserNameTextBox().sendKeys("UserName");
		System.out.println(homePage.getUserNameTextBox().getAttribute("placeholder"));
		System.out.println(homePage.getUserNameTextBox().getCssValue("background-color"));
		System.out.println(homePage.getUserNameTextBox().getSize().getHeight());
		System.out.println(homePage.getUserNameTextBox().getSize().getWidth());
		Thread.sleep(1000);
		homePage.getUserNameTextBox().clear();
		Thread.sleep(1000);
		homePage.getUserNameTextBox().sendKeys("USerName2");
		homePage.setGenderRadioButton();
		System.out.println("Is selected " + homePage.getGenderRadioButton().isSelected());

		Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);
		System.out.println("WebELement is displayed " + homePage.getUserNameTextBox().isDisplayed());
		System.out.println("Is selected " + homePage.getGenderRadioButton().isSelected());

		Utility.clickUsingJavaScript(homePage.getGenderRadioButton(), driver);
		homePage.setDateOfBirthInputField();
		Utility.scrollIntoView(homePage.getDateOfBirthInputField(), driver);
		homePage.getDateOfBirthInputField().click();

		WebElement select = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));

		Utility.selectValueFromDropdown(select, "2009");
		Utility.selectDateFromDatePicker(driver, "10");

		// select hobbies checkbox
		homePage.setHobbiesCheckBox();
		Utility.clickUsingJavaScript(homePage.getHobbiesCheckBox(), driver);
		homePage.getFileUpload().sendKeys("C:\\Users\\Administrator\\Desktop\\Jars\\chromedriver.exe");

	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
	}

}
