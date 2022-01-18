package com.mindtree.manager;

import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mindtree.utility.ConfigReader;
import com.mindtree.utility.ExcelReadWrite;
import com.mindtree.utility.Logs;

public class WebDriverManager {

	public static WebDriver driver;
	public Properties properties;
	ConfigReader configReader;
	ExcelReadWrite excelUtil;
	Logs logUtil;
	Logger log;

	public WebDriverManager() {
		configReader = new ConfigReader();
		properties = configReader.getProperties();
		logUtil = new Logs();
	}

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", properties.getProperty("driverpath"));
		driver = new ChromeDriver();
		log = logUtil.createLog("BaseClass.class");
		driver.manage().window().maximize();
		if (driver == null) {
			log.fatal("Driver not found");
		}
	}

}
