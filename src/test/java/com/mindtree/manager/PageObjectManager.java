package com.mindtree.manager;


import com.mindtree.pageobject.Airportpage;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.corporatepage;
import com.mindtree.pageobject.homepage;
import com.mindtree.pageobject.localpage;
import com.mindtree.pageobject.onewaycabspage;
import com.mindtree.pageobject.outstationpageobject;


/** This class is to manage the objects of different pages
 
 *
 */
public class PageObjectManager extends WebDriverManager{
	private Airportpage AirPage;
	private LoginPage loginPage;
	private localpage localpage;
	private outstationpageobject outstationpage;
	private onewaycabspage onewaycabs;
	 private corporatepage corporate;
	 private homepage home;

	 public homepage  gethomePage() {
			return(home==null) ? home = new homepage():home;
		}
	
	 
	 public corporatepage  getCorporatePage() {
			return(corporate==null) ? corporate = new corporatepage():corporate;
		}
	
	public Airportpage getHomePage() {
		return(AirPage==null) ? AirPage = new Airportpage():AirPage;
	}
	public outstationpageobject getoutstationPage() {
		return(outstationpage==null) ? outstationpage = new outstationpageobject():outstationpage;
	}
	public localpage getLocalPage() {
		return(localpage==null) ? localpage = new localpage():localpage;
	}
	public onewaycabspage getonewaycabPage() {
		return(onewaycabs==null) ? onewaycabs = new onewaycabspage():onewaycabs;
	}
	

	public LoginPage getLoginPage() {
		return(loginPage==null) ? loginPage = new LoginPage():loginPage;
	}	
}
