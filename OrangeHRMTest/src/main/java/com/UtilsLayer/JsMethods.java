package com.UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class JsMethods extends BaseClass {

	// open a browser,click, sendKeys,title, url , scroll down up to element,
	// alert , border , change bg color

	// DIT, SIT, UAT,Pre Production, post Production

	public static void openBrowser(String url) {
		((JavascriptExecutor) driver).executeScript("window.location='" + url + "';");
	}

	public static void clickOnElementById(WebElement wb, String id) {
		((JavascriptExecutor) driver).executeScript("document.getElementById('" + id + "').click();", wb);
	}

	public static void clickOnElement(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", wb);
	}

	public static void sendDataToTextBox(WebElement wb, String value) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + value + "';", wb);
	}

	public static String getTitle() {
		return ((JavascriptExecutor) driver).executeScript("return document.title").toString();
	}

	public static String getUrl() {
		return ((JavascriptExecutor) driver).executeScript("return document.URL").toString();
	}

	public static void scrollUptoElement(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wb);
	}

	public static void borderOnElement(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red';", wb);
	}

	public static void flashElement(WebElement wb, String color) {
		((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor='" + color + "'", wb);
	}

	public static void generatePopUp(String value) {

		((JavascriptExecutor) driver).executeScript("alert('" + value + "')");
	}

	public static void refreshBrowser() {
		((JavascriptExecutor) driver).executeScript("history.go(0)");
	}

	public static void forwardBrowser() {
		((JavascriptExecutor) driver).executeScript("history.go(1)");
	}

	public static void backBrowser() {
		((JavascriptExecutor) driver).executeScript("history.go(-1)");
	}

	
	
	
	
	
}
