package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.JsMethods;
import com.UtilsLayer.SelectMethods;

public class PIMPage extends BaseClass {

	String employeeid;
	String date = "10";

	@FindBy(id = "btnAdd")
	WebElement addUser;

	@FindBy(id = "firstName")
	WebElement fName;

	@FindBy(id = "middleName")
	WebElement mName;

	@FindBy(id = "lastName")
	WebElement lName;

	@FindBy(id = "employeeId")
	WebElement employeeId;

	@FindBy(id = "btnSave")
	WebElement SaveOrEditButton;

	@FindBy(id = "empsearch_id")
	WebElement searchEmp;

	@FindBy(id = "searchBtn")
	WebElement searchButton;

	@FindBy(xpath = "//table[@id='resultTable']//td[1]")
	WebElement checkBox;

	@FindBy(id = "btnDelete")
	WebElement delete;

	@FindBy(xpath = "//p[text()='Delete records?']")
	WebElement deleteRecords;

	@FindBy(id = "dialogDeleteBtn")
	WebElement confirmDelete;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public void addNewUser(String fname, String mname, String lname) {
		addUser.click();
		fName.sendKeys(fname);
		mName.sendKeys(mname);
		lName.sendKeys(lname);
		employeeid = employeeId.getAttribute("value");
		SaveOrEditButton.click();
	}

	// Add More information of newly created user
	@FindBy(id = "personal_txtLicenNo")
	WebElement DriversLicenseNumber;

	@FindBy(id = "personal_txtLicExpDate")
	WebElement LicenseExpiryDate;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement monthExpORDOBDateDropDown;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement yearExpORDOBDateDropDown;

	By dateExpORDOBDropDown = By.xpath("//a[text()='" + date + "']");

	@FindBy(id = "personal_txtNICNo")
	WebElement SSNNumber;

	@FindBy(id = "personal_txtSINNo")
	WebElement SINNumber;

	@FindBy(id = "personal_optGender_1")
	WebElement maleRadioButton;

	@FindBy(id = "personal_optGender_2")
	WebElement femaleRadioButton;

	@FindBy(id = "personal_cmbNation")
	WebElement Nationality;

	@FindBy(id = "personal_cmbMarital")
	WebElement MaritalStatus;

	@FindBy(id = "personal_DOB")
	WebElement dob;

	@FindBy(id = "personal_chkSmokeFlag")
	WebElement Smoker;

	public void fillUpMorePersonalInformation(String driverLicence, String expMonth, String expYear,
			String date,
			String SSNnumber, String SinNumber, String Maritalstatus, String nationality, String DobMonth,
			String dobYear, String dobdate) {
		SaveOrEditButton.click();
		DriversLicenseNumber.sendKeys(driverLicence);

		JsMethods.clickOnElement(LicenseExpiryDate);

		// LicenseExpiryDate.click();

		SelectMethods.selectValueByVisibleText(monthExpORDOBDateDropDown, expMonth);
		SelectMethods.selectValueByVisibleText(yearExpORDOBDateDropDown, expYear);
		this.date = date;
		
		driver.findElement(dateExpORDOBDropDown).click();
		SSNNumber.sendKeys(SSNnumber);
		SINNumber.sendKeys(SinNumber);
		femaleRadioButton.click();
		SelectMethods.selectValueByVisibleText(MaritalStatus, Maritalstatus);
		SelectMethods.selectValueByVisibleText(Nationality, nationality);
		dob.click();
		SelectMethods.selectValueByVisibleText(monthExpORDOBDateDropDown, DobMonth);
		SelectMethods.selectValueByVisibleText(yearExpORDOBDateDropDown, dobYear);
		this.date = dobdate;
		driver.findElement(dateExpORDOBDropDown).click();
		Smoker.click();
		SaveOrEditButton.click();
	}

	// Job Details

	@FindBy(xpath = "//ul[@id='sidenav']//a[text()='Job']")
	WebElement JobLink;

	@FindBy(id = "job_job_title")
	WebElement JobTitle;

	@FindBy(id = "job_emp_status")
	WebElement EmploymentStatus;

	@FindBy(id = "job_eeo_category")
	WebElement JobCategory;

	@FindBy(id = "job_joined_date")
	WebElement JoinedDate;

	@FindBy(id = "job_sub_unit")
	WebElement SubUnit;

	@FindBy(id = "job_location")
	WebElement locon;

	public void addMoreJobDetails(String jobtitle, String empStatus, String jobcategory, String jobMonth,
			String jobyear, String jobDate, String subunit, String Location) {
		JobLink.click();
		SaveOrEditButton.click();
		SelectMethods.selectValueByVisibleText(JobTitle, jobtitle);
		SelectMethods.selectValueByVisibleText(EmploymentStatus, empStatus);
		SelectMethods.selectValueByVisibleText(JobCategory, jobcategory);
		JoinedDate.click();
		SelectMethods.selectValueByVisibleText(monthExpORDOBDateDropDown, jobMonth);
		SelectMethods.selectValueByVisibleText(yearExpORDOBDateDropDown, jobyear);
		this.date = jobDate;
		driver.findElement(dateExpORDOBDropDown).click();
		SelectMethods.selectValueByVisibleText(SubUnit, subunit);
		SelectMethods.selectValueByVisibleText(locon, Location);
		SaveOrEditButton.click();
	}

	public String searchUser() {
		new HomePage().pimPageLink();
		searchEmp.sendKeys(employeeid);
		searchButton.click();
		checkBox.click();
		delete.click();
		String messsage = deleteRecords.getText();
		confirmDelete.click();
		return messsage;
	}

}
