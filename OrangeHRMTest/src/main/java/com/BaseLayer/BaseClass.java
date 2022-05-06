package com.BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir")+"\\OrangeHRMTest\\src\\main\\java\\com\\Config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {

		}
	}

	public static void inilitization() {

		String browsername = prop.getProperty("browsername");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir")+"\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		
		}

		driver.manage().window().maximize();
		driver.manage().timeouts()
				.pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(prop.getProperty("pageLoadTime"))));

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicitWait"))));

		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}
}
