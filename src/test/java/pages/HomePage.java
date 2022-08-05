package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	WebElement userNameTextBox1;
	WebElement genderRadioButton;
	WebElement dateOfBirthInputField;
	WebElement hobbiesCheckBox;
	WebElement fileUpload;

	//This is constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox1;
	}

	public void setUserNameTextBox() {
		this.userNameTextBox1 = driver.findElement(By.xpath("//input[@id='firstName']"));
	}

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public void setGenderRadioButton() {
		this.genderRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
	}

	public WebElement getDateOfBirthInputField() {
		return dateOfBirthInputField;
	}

	public void setDateOfBirthInputField() {
		this.dateOfBirthInputField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}

	public WebElement getHobbiesCheckBox() {
		return hobbiesCheckBox;
	}

	public void setHobbiesCheckBox() {
		this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	}

	public WebElement getFileUpload() {
		this.fileUpload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		return fileUpload;
	}

}
