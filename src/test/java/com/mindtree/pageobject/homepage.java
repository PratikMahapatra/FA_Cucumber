package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.homepageui;
import com.mindtree.utility.Logs;

public class homepage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log ;
	homepageui home;
	String ActualTitle;
	String ExpectedCeoName;
	String number;
	
	
	public homepage() {
		
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	
	public void title() {
		log = loggerUtil.createLog("Homepage.java");
		 ActualTitle= helper.title();
	}
	public void validate(String s) {
		 if(ActualTitle.contains(s)) {
         log= loggerUtil.createLog("title validated");
		 }
		
	}
	
	public void aboutus() throws WebDriverHelperException {
		helper.clickButton(home.about);
		helper.applicationWait(1000);
		helper.switchHandles(1);
	}
	public void ceoname(String s) throws WebDriverHelperException {
		ExpectedCeoName = helper.getText(home.ceo);
		if(ExpectedCeoName.equals(s)) {
			log= loggerUtil.createLog("ceoname validated");
		}
	}
	
	public void contactus() throws WebDriverHelperException {
		helper.actionClick(home.contactus);
		helper.applicationWait(1000);
		helper.switchHandles(1);
	}
	public void validatephone(String string) throws WebDriverHelperException {
		number=helper.getText(home.phoneno);
		if(number.equals(string)) {
			log= loggerUtil.createLog("phonenumber validated");
		}
	}
		
	}
	


