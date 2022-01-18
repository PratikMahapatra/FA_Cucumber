  package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.LoginPage;

import com.mindtree.pageobject.outstationpageobject;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class outstationstepdefinition {
	PageObjectManager pageManager = new PageObjectManager();
	LoginPage loginpage;
	Logs loggerUtil;
	Logger log;
	outstationpageobject out = new outstationpageobject();

	//oneway
	@Given("land on homepage and log in with valid email id and click on outstaion")
	public void land_on_homepage_and_log_in_with_valid_email_id() throws WebDriverHelperException {
	    // Write code here that turns the phrase above into concrete actions
		out.clickonoutstation();
		loginpage = pageManager.getLoginPage();
		loginpage.logs();
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test3");
		log.info("Savaari website is displayed");
	}


	@And("select One way")
	public void select_one_way() {
		 out.clickoneway();
	}

	@Then("enter From Cityname {string}")
	public void enter_from_cityname(String string) throws WebDriverHelperException, InterruptedException {
		out.fromcityname(string);
	    
	}

	@Then("enter to Cityname {string}")
	public void enter_to_cityname(String string) throws WebDriverHelperException, InterruptedException {
	    out.tocityname(string);
	}

	@Then("enter pickup date {string} {string}")
	public void enter_pickup_date(String string, String string2) throws InterruptedException {
	    out.date(string,string2);
	}

	@Then("pickup time {string}")
	public void pickup_time(String string) {
	   out.time(string);
	}

	@Then("click on Selectcar button")
	public void click_on_selectcar_button() throws WebDriverHelperException {
	    out.selectcarbutton();
	}

	@Then("Select the firstcar")
	public void select_the_firstcar() throws InterruptedException, WebDriverHelperException {
	    out.firstcarselect();
	}

	@And("validate car booking details")
	public void validate_car_booking_details() throws WebDriverHelperException {
	    out.validate();
	}

	//roundtrip
			
			   

			@And("selects Round Trip")
			public void selects_round_trip() {
			    // Write code here that turns the phrase above into concrete actions
			   out.roundtrip();
			}

			@Then("fill the form by entering From Cityname {string}")
			public void fill_the_form_by_entering_from_cityname(String string)  throws WebDriverHelperException, InterruptedException {
				    out.fromcityname(string);
			    
			}

			@Then("fill the form by entering To Cityname {string}")
			public void fill_the_form_by_entering_to_cityname(String string) throws WebDriverHelperException, InterruptedException {
				    out.roundtocityname(string);
			   
			}

			@Then("selects pickup date and monthyear {string} {string}")
			public void selects_pickup_date_and_monthyear(String string, String string2)throws InterruptedException {
			    out.date(string,string2); 
			    // Write code here that turns the phrase above into concrete actions
			   
			}

			@Then("selects return date {string} {string}")
			public void selects_return_date(String string, String string2) throws InterruptedException {
			    // Write code here that turns the phrase above into concrete actions
				out.returndate(string,string2);
			}

			@Then("selects pickup time {string}")
			public void selects_pickup_time(String string) {
				out.time(string);
			}

			@Then("user click Select car button")
			public void user_click_select_car_button() throws WebDriverHelperException {
			    out.selectcarbutton();
			   
			}

			@Then("Selects the first car")
			public void selects_the_first_car() throws InterruptedException, WebDriverHelperException {
			    out.firstcarselect();
			}

			@Then("validate car type under booking details")
			public void validate_car_type_under_booking_details() throws WebDriverHelperException {
			    out.validate();
			  
			}
	
}
