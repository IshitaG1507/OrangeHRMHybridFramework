package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.PIMPage;

public class PIMPageTest extends BaseClass {

	private LoginPageTest loginpageTest;
	private HomePageTest homepagetest;
	private PIMPage pimpage;

	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();
		loginpageTest = new LoginPageTest();
		homepagetest = new HomePageTest();
		pimpage = new PIMPage();
	}

	@Test(priority = 1)
	public void loginFunctionality() {

		loginpageTest.validateLoginFunctionality();
	}

	@Test(priority = 2)
	public void validateHomePageTitle() {
		homepagetest.validateTitle();
	}

	@Test(priority = 3)
	public void validateHomePageUrl() {
		homepagetest.validateUrl();
	}

	@Test(priority = 4)
	public void validateHomePagelogo() {
		homepagetest.validateLogo();
	}

	@Test(priority = 5)
	public void validateHomePagePIMPage() {
		homepagetest.validatePimPage();
	}

	@Test(priority = 6)
	public void validateCreateNewUserFunctionality() {
		pimpage.addNewUser("Ashish", "pqr", "Patil");
	}

	@Test(priority = 7)
	public void validateMorePersonalInformation() {
		pimpage.fillUpMorePersonalInformation("122141444", "Aug", "2024", "10", "1234556789", "12455", "Single",
				"Indian", "Nov", "2000", "10");
	}

	@Test(priority =8)
	public void validateJobDetailFunctionality() {
		pimpage.addMoreJobDetails("Automation Tester", "Full-Time Permanent", "Professionals", "Aug", "2022", "20",
				"Engineering", "New York Sales Office");
	}

	@Test(priority = 9)
	public void validateUserandDelete() {
		pimpage.searchUser();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
