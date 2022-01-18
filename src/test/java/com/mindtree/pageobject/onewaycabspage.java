package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.onewaycabui;
import com.mindtree.utility.Logs;

public class onewaycabspage {

	static WebDriverHelper helper;
	static Logs loggerUtil;
	static Logger log;
	onewaycabui cab;
	
	public onewaycabspage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	
	public void services() throws WebDriverHelperException, InterruptedException {
		Thread.sleep(1000);
		helper.clickButton(cab.service);
	}
	
	public void enroute() throws InterruptedException, WebDriverHelperException {
		helper.switchHandles(1);
		Thread.sleep(5000);
		helper.clickButton(cab.tabagra);
	}
	public void validate() throws InterruptedException, WebDriverHelperException {
		helper.switchHandles(1);
		Thread.sleep(5000);
		helper.clickButton(cab.route);
		String ExpectedTitle ="Book Agra to Shikohabad Cabs - Affordable Taxi Service with Savaari";
		   String ActualTitle = helper.title();
		   if(ActualTitle.contains(ExpectedTitle)) {
			   log.info("Title Validated : "+ActualTitle);
		   }
	}
	
}
