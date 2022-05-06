package com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class ActionsClassMethods extends BaseClass {
//click, double click, right click, dragAndDrog, moveToElement,clickAndHold,
	// KeyDown, KeyUP,

	public static void clickOnElement(WebElement wb) {
		new Actions(driver).click(wb).build().perform();
	}

	public static void doubleClickOnElement(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}

	public static void rightClickOnElement(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}

	public static void dragAndDrop(WebElement src, WebElement trg) {

		new Actions(driver).dragAndDrop(src, trg).build().perform();
	}

	public static void mouseOver(WebElement wb) {
		new Actions(driver).moveToElement(wb).build().perform();
	}

	public static void clickOnHold(WebElement wb) {
		new Actions(driver).clickAndHold(wb).build().perform();
	}

	public static void releaseElement(WebElement wb) {
		new Actions(driver).release(wb).build().perform();
	}

	public static void enterCapitalData(WebElement wb, String value) {
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(wb, value).build().perform();
	}

	public static void moveEndOfPage() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	}

	public static void moveHomePage() {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	}


	
}
