package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.manager.WebDriverManager;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.utility.Logs;
import com.mindtree.utility.SnapShots;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends WebDriverManager {
	WebDriverManager driverManager;
	WebDriverHelper Helper;
	Logs loggerUtil;
	Logger log;
	@Before
	public void startUp() {

		loggerUtil = new Logs();
		log = loggerUtil.createLog("Hooks.class");
		log.debug("Opening driver");
		driverManager = new WebDriverManager();
		driverManager.getDriver();
		log.info("Driver opened");
		driver.get(properties.getProperty("url"));
		log.debug("Opening URL");
	}
	//@AfterStep
	//public void takess(Scenario scenario) {
		//SnapShots ss = new SnapShots();
		//if(scenario.isFailed()) {
			//ss.takeSnapShotFail();
		//}
		//else {
			//ss.takeSnapShotPass();
		//}
	//}
	@After
	public void tearDown() {
		log.info("Driver closed");
		log.info("Scenario completed");
		driver.close();
		driver.quit();
	}

}
