package com.mindtree.stepDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.onewaycabspage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class onewaycabs {
	PageObjectManager pageManager = new PageObjectManager();
	LoginPage loginpage;
	Logs loggerUtil;
	Logger log;
	onewaycabspage oneway = new onewaycabspage();
	
	@Given("User lands on homepage and clicks on one way cabs in services under homepage footer")
	public void user_lands_on_homepage_and_clicks_on_one_way_cabs_in_services_under_homepage_footer() throws WebDriverHelperException, InterruptedException {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test3");
		log.info("Savaari website is displayed");
	    oneway.services();
	}

	@And("clicks on Agra to shikohabad cabs in One way cab drops in North India")
	public void clicks_on_agra_to_shikohabad_cabs_in_one_way_cab_drops_in_north_india() throws InterruptedException, WebDriverHelperException {
	    oneway.enroute();
	}

	@Then("validate the title in new tab")
	public void validate_the_title_in_new_tab() throws InterruptedException, WebDriverHelperException {
	    oneway.validate();
	}

}
