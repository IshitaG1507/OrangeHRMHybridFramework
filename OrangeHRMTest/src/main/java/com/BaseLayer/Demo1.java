package com.BaseLayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praf0\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg");

		WebElement wb = driver.findElement(By.id("month"));

		Select sel = new Select(wb);

		List<WebElement> ls = sel.getOptions();

		List<String> xyz = new ArrayList<String>();

		for (WebElement abc : ls) {

			xyz.add(abc.getText());
		}

		Collections.sort(xyz);

		System.out.println(xyz);

	}

}
