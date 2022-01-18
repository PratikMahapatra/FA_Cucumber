package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.Airportpage;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AirportStepdefinition {
	PageObjectManager pageManager = new PageObjectManager();
	LoginPage loginpage;
	Logs loggerUtil;
	Logger log;
	Airportpage home = new Airportpage();

    
    @Given("User lands on homepage and logs with valid emailid and password")
    public void user_lands_on_homepage_and_logs_with_valid_emailid_and_password()
    	throws WebDriverHelperException {
    		loginpage = pageManager.getLoginPage();
    		loginpage.logs();
    		loggerUtil = new Logs();
    		log = loggerUtil.createLog("Test1");
    		log.info("Savaari website is displayed");
    	}
       
    @And("click on Airport")
    public void click_on_airport()throws WebDriverHelperException {
		home.airport();
		
    }
    @Then("User fills the form by entering Cityname {string}")
    public void User_fills_the_form_by_entering_Cityname(String string) throws WebDriverHelperException, InterruptedException {
		//home.Switchtab(1);
    	home.SelectSrc(string);
		 Thread.sleep(1000);
		 //home.();
    }
    @Then("User selects Trip from dropdown {string}")
    public void user_selects_trip_from_dropdown(String string){
		home.SelectTripType();;
		}
    
    @Then("User enters Drop address or pickup address {string}")
    public void user_enters_drop_address_or_pickup_address(String string) throws WebDriverHelperException, InterruptedException {
	    home.SelectDest(string);
	}
    
    @Then("User selects pickup date {string} {string}")
    public void user_selects_pickup_date(String string, String string2)throws WebDriverHelperException, InterruptedException
	{   
		home.SelectDate(string, string2);
		}
    
    
    @Then("User selects pickup time {string}")
    public void user_selects_pickup_time(String string) throws WebDriverHelperException
	{
		home.SelectPickuptime(string);
	}
    
    @Then("user clicks on Select car button")
    public void user_clicks_on_select_car_button() throws WebDriverHelperException {
    	home.ClickOnSearchCar();
    }
    
    @Then("Select the first car")
    public void select_the_first_car() throws WebDriverHelperException {
    	 home.SelectFirstCar();
    }
    @Then("validate car in car details")
    public void validate_car_in_car_details() throws WebDriverHelperException {
    	home.ValidateCarDetails();
    }
}
