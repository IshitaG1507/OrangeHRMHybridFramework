package com.UtilsLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class FrameMethods extends BaseClass {

	// switch to child frame by using frame nameorid
	public static WebDriver switchToChildFrameUsingName(String nameid) {
		return driver.switchTo().frame(nameid);
	}

	// switch to child frame by using frame index
	public static WebDriver switchToChildFrameUsingIndex(int index) {
		return driver.switchTo().frame(index);
	}

	// switch to child frame by using frame index
	public static WebDriver switchToChildFrameUsingWebElement(WebElement wb) {
		return driver.switchTo().frame(wb);
	}

	// switch to parent frame
	public static WebDriver switchToParentFrame() {
		return driver.switchTo().parentFrame();
	}

	// switch to top frame
	public static WebDriver switchToTopFrame() {
		return driver.switchTo().defaultContent();
	}

}
