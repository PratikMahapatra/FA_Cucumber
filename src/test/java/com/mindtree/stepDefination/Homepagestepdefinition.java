package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.homepage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Homepagestepdefinition {
	PageObjectManager pageManager = new PageObjectManager();
	LoginPage loginpage;
	Logs loggerUtil;
	Logger log;
	homepage home = pageManager.gethomePage();
	
	
	@Given("load the website and get the title")
	public void load_the_website_and_get_the_title() {
	    home.title();
	}

   @Then("validate title {string}")
	public void validate_title(String string) {
	    
	  home.validate(string);
	}
   
   @Given("load the website and click on about us")
   public void load_the_website_and_click_on_about_us() throws WebDriverHelperException {
       home.aboutus();
   }

   @Then("validate CEO {string}")
   public void validate_ceo(String string) throws WebDriverHelperException {
	   home.ceoname(string);
      
   }

   @Given("load the website and click on Contact us")
   public void load_the_website_and_click_on_contact_us() throws WebDriverHelperException {
	   home.contactus();
       
   }

   @Then("validate phonenumber {string}")
   public void validate_phonenumber(String string) throws WebDriverHelperException {
	   home.validatephone(string);
     
   }

}
