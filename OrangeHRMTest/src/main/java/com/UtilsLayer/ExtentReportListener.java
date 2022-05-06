package com.UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportListener extends ExtentReportSetUp implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("Test Suite is Started");
		ExtentReportSetUp.extentreportsetup();
	}

	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
		extenttest = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, "Test Case is Pune ::::: " + result.getMethod().getMethodName());

		extenttest.addScreenCaptureFromPath(
				UtilsClass.takeScreenShot("\\MaylPassScreenshot\\" + result.getMethod().getMethodName()));

	}

	public void onTestFailure(ITestResult result) {

		extenttest.log(Status.FAIL, "test Cases is Fail :: " + result.getMethod().getMethodName());

		extenttest.addScreenCaptureFromPath(
				UtilsClass.takeScreenShot("\\MayFailScreenshot\\" + result.getMethod().getMethodName()));

	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, "Test Cases is Skip ::: " + result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
