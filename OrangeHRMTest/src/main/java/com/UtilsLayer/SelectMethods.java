package com.UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class SelectMethods extends BaseClass {

	public static void selectValueByVisibleText(WebElement wb, String value) {
		new Select(wb).selectByVisibleText(value);
	}

	public static void selectValueByIndex(WebElement wb, int index) {
		new Select(wb).selectByIndex(index);
	}

	public static void selectByValueByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
	}

	public static String getSelectedValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static void printAllValue(WebElement wb) {
		List<WebElement> ls = new Select(wb).getOptions();

		for (WebElement abc : ls) {
			System.out.println(abc.getText());
		}
	}

	public static int countTotalDPList(WebElement wb) {
		return new Select(wb).getOptions().size();

	}

	public static void checkSpecificValuePresent(WebElement wb, String value) {
		List<WebElement> ls = new Select(wb).getOptions();

		for (WebElement abc : ls) {
			if (abc.getText().contains(value)) {
				System.out.println("Value is Present " + abc.getText());
			}
		}
	}

}
