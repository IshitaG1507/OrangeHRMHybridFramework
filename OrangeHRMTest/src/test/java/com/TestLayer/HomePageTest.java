package com.TestLayer;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;

public class HomePageTest extends BaseClass {
	private HomePage homepage;

	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();
	}

	@Test(priority = 1)
	public void validateLogin() {
		LoginPageTest loginPageTest = new LoginPageTest();
		loginPageTest.validateLoginFunctionality();
	}

	@Test(priority = 2)
	public void validateTitle() {
		Assert.assertEquals(driver.getTitle().contains("HRM"), true);
	}

	@Test(priority = 3)
	public void validateUrl() {
		Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), true);
	}

	@Test(priority = 4)
	public void validateLogo() {
		homepage = new HomePage();
		Assert.assertEquals(homepage.checkLogoDisplayedStatus(), true);
	}

	@Test(priority = 5)
	public void validateAdminPage() {
		homepage.adminPageLink();
		Assert.assertEquals(driver.getCurrentUrl().contains("admin"), true);
	}

	@Test(priority = 6)
	public void validatePimPage() {
		homepage.pimPageLink();
		Assert.assertEquals(driver.getCurrentUrl().contains("pim"), true);
	}

	@Test(priority = 7)
	public void validateleavePage() {
		homepage.leavePageLink();
		Assert.assertEquals(driver.getCurrentUrl().contains("leave"), true);
	}

	@Test(priority = 8)
	public void validateMyInfoPage() {
		homepage.myInfoPageLink();
		Assert.assertEquals(driver.getCurrentUrl().contains("viewMyDetails"), true);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
