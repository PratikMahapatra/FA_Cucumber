package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class signupstepdefinition {
	PageObjectManager pageManager = new PageObjectManager();
	LoginPage loginpage = pageManager.getLoginPage();
	Logs loggerUtil;
	Logger log;
	

	@Given("load the website and click signin")
	public void load_the_website_and_click_signin() {
		loginpage.signin();
	    
	}


	@Then("User enters valid name {string}")
	public void user_enters_valid_name(String string) {
	   loginpage.vname(string);
	}

	@Then("User enters valid phonenumber {string}")
	public void user_enters_valid_phonenumber(String string) {
		loginpage.vnumber(string);
	    
	}

	@Then("enter valid email-id {string}")
	public void enter_valid_email_id(String string) {
		loginpage.emailid(string);
	  
	}

	@Then("enter valid password {string}")
	public void enter_valid_password(String string) {
	   loginpage.password(string);
	}
	@Then("Reenter password {string}")
	public void Reenter_password(String string) {
		loginpage.repassword(string);
	}

	@And("user Click on login button")
	public void user_click_on_login_button() {
	   loginpage.login();
	}
}
