package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.corporatepage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class corporatestepdefinition {

	PageObjectManager pageManager = new PageObjectManager();
	LoginPage loginpage;
	Logs loggerUtil;
	Logger log;
	corporatepage corporate = new corporatepage();
	
	@Given("User logs in to homepage and clicks on corporate car rental in services")
	public void user_logs_in_to_homepage_and_clicks_on_corporate_car_rental_in_services() throws WebDriverHelperException, InterruptedException {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test4");
		log.info("Savaari website is displayed");
		corporate.clickoncorporate();
	}
	 @Then("User enters Name {string}")
	 public void user_enters_name(String string)throws WebDriverHelperException {
		   corporate.cname(string);
		} 

	@Then("User enters Company {string}")
	public void user_enters_company(String string) throws WebDriverHelperException {
	   corporate.companyname(string);
	}

	@Then("User enters  EmailId {string}")
	public void user_enters_email_id(String string) throws WebDriverHelperException {
		corporate.cemail(string);
	  
	}

	@Then("User enters  Contact number {string}")
	public void user_enters_contact_number(String string) throws WebDriverHelperException, InterruptedException {
		corporate.cphone(string);
	   
	}

	@Then("User selects Business volume {string}")
	public void user_selects_business_volume(String string) throws WebDriverHelperException {
	    corporate.sele(string);
	}

	@Then("user clicks on Submit button")
	public void user_clicks_on_submit_button() throws WebDriverHelperException, InterruptedException {
	  corporate.submit();
	}

	@And("Verify if the text is displayed {string}")
	public void verify_if_the_text_is_displayed(String string) throws WebDriverHelperException, InterruptedException {
		corporate.validate(string);
	  
	}
}
