package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.LoginUI;
import com.mindtree.utility.Logs;

public class LoginPage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	public LoginPage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}
	public void logs() throws WebDriverHelperException {
		helper.clickButton(LoginUI.sign);
		log = loggerUtil.createLog("Sign in icon is clicked");
		helper.clickButton(LoginUI.newemail);
		helper.sendText(LoginUI.newemail, "kiru50173@gmail.com");
		helper.enterKey(LoginUI.newemail);
		log= loggerUtil.createLog("Valid Emailid is entered");
		helper.clickButton(LoginUI.newpass);
		helper.sendText(LoginUI.newpass,"Kiran1245");
		helper.enterKey(LoginUI.newpass);
		log = loggerUtil.createLog("Valid Email id is entered");
		helper.clickButton(LoginUI.newlog);
				

	}
	public void signin() {
		try {
			log = loggerUtil.createLog("LoginPage.java");
			helper.clickButton(LoginUI.sign);
			helper.clickButton(LoginUI.register);
			log.debug("Sign in icon is clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	public void vname(String string) {
		try {
			helper.sendText(LoginUI.name,string);
			log.debug("Valid name id is entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();}
		
		}
		
	public void emailid(String string) {
		try {
			helper.sendText(LoginUI.email, string);
			
			log.debug("Valid Email id is entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	public void vnumber(String string) {
		try {
			helper.sendText(LoginUI.phone,string);
			log.debug("Valid Phone number is entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	
	
	public void password(String string) {
		try {
			helper.sendText(LoginUI.newpass, string);
			log.debug("Valid Email id is entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	
	public void repassword(String string) {
		try {
			helper.sendText(LoginUI.repassword, string);
			log.debug("Valid Email id is entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	public void login() {
		try {
			helper.clickButton(LoginUI.newlog);
			log.debug("Login is clicked and user lands on homepage");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
}
