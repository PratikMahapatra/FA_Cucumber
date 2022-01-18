package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.corporateui;
import com.mindtree.utility.Logs;

public class corporatepage {
	
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log ;
	corporateui corporate;
	
	public corporatepage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	
	public void clickoncorporate() throws WebDriverHelperException {
		log = loggerUtil.createLog("CorporateCarRental.java");
		helper.clickButton(corporate.service);
		
		helper.switchHandles(1);
		helper.applicationWait(1000);
	}

	public void cname(String string) throws WebDriverHelperException{
		helper.sendText(corporate.name, string);
		helper.applicationWait(1000);
	}
	public void companyname(String string) throws WebDriverHelperException {
	helper.sendText(corporate.company, string);
	helper.applicationWait(1000);
	}
	public void cemail(String string) throws WebDriverHelperException {
		
	helper.sendText(corporate.email, string);
	helper.applicationWait(1000);
	}
	
	public void cphone(String string) throws WebDriverHelperException{
	helper.sendText(corporate.phone, string);
	helper.applicationWait(1000);
	log.info("Phone no");
	}
	
	public void sele(String string) throws  WebDriverHelperException {
		helper.select(corporate.vol, string);
		helper.applicationWait(1000);
		log.info("Volumn selected");
	}
	public void submit() throws WebDriverHelperException {
		helper.actionClick(corporate.account);
		log.info("Submit button clicked");
	}
	public void validate(String string) throws WebDriverHelperException {
		helper.applicationWait(5000);
		String s = helper.getText(corporate.text);
		if(s.contains(s)) {
			log.info("text validates");
		}
	}
	
}


