package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	WebElement homePageLogo;

	@FindBy(xpath = "//b[text()='Admin']")
	WebElement adminPage;

	@FindBy(xpath = "//b[text()='PIM']")
	WebElement PIMPage;

	@FindBy(xpath = "//b[text()='Leave']")
	WebElement leavePage;

	@FindBy(xpath = "//b[text()='My Info']")
	WebElement myInfoPage;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean checkLogoDisplayedStatus() {
		return homePageLogo.isDisplayed();
	}

	public void adminPageLink() {
		adminPage.click();
	}

	public void pimPageLink() {
		PIMPage.click();
	}

	public void leavePageLink() {
		leavePage.click();
	}

	public void myInfoPageLink() {
		myInfoPage.click();
	}

}