package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.localpage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Localstepdefinition {
	PageObjectManager pageManager = new PageObjectManager();
	LoginPage loginpage;
	Logs loggerUtil;
	Logger log;
	localpage local = pageManager.getLocalPage();
	
	@Given("User lands on homepage log in and click on Local path")
	public void user_lands_on_homepage_log_in_and_click_on_local_path()throws WebDriverHelperException {
		local.clickonlocal();
		loginpage = pageManager.getLoginPage();
		loginpage.logs();
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test2");
		log.info("Savaari website is displayed");
	}


@When("select city {string}")
public void select_city(String string) throws WebDriverHelperException, InterruptedException {
	local.cityname(string);
    // Write code here that turns the phrase above into concrete actions

}
@And("select pickup date {string} {string}")
public void select_pickup_date(String string, String string2)throws InterruptedException {
		  local.date(string,string2);
    
}



@And("select pickup time {string}")
public void select_pickup_time(String string) {
	local.time(string);
    // Write code here that turns the phrase above into concrete actions
   
}

@And("clicks on Select car button")
public void clicks_on_select_car_button() throws WebDriverHelperException {
	local.selectbutton();
    // Write code here that turns the phrase above into concrete actions
   
}

@And("first car select")
public void first_car_select() throws WebDriverHelperException, InterruptedException {
	local.selectcar();
    // Write code here that turns the phrase above into concrete actions
  
}

@Then("validate car type in booking details")
public void validate_car_type_in_booking_details() throws WebDriverHelperException {
	local.validate();
    
}
	
	
	
}
