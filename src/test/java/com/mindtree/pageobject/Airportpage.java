package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.AirportPageUI;
import com.mindtree.utility.Logs;

public class Airportpage {
	static WebDriverHelper helper;
	static Logs loggerUtil;
	static Logger log;
	static AirportPageUI airpage;

	public Airportpage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	
	  public void airport() throws WebDriverHelperException {
		  log = loggerUtil.createLog("AirportPage.java");
		  helper.clickButton(airpage.airport);
	  
	 } 
	  /*public void from(String s) throws WebDriverHelperException { log =
	 * loggerUtil.createLog("AirportPage.java"); helper.sendText(airpage.from, s); }
	 * public void click() throws WebDriverHelperException
	 * 
	 * { helper.clickButton(airpage.click); } public void trip(String s) {
	 * helper.select(airpage.t,s); } public void dropaddress(String s) throws
	 * WebDriverHelperException, InterruptedException {
	 * helper.clickButton(airpage.drop); helper.sendText(airpage.drop, s);
	 * Thread.sleep(1000); helper.clickButton(airpage.dropselect); }
	 * 
	 * public void pickupdate(String s1,String s2) throws InterruptedException,
	 * WebDriverHelperException { try { helper.applicationWait(2000);
	 * helper.selectdate(airpage.calender,airpage.dMonth,airpage.Month,airpage.date,
	 * s1,s2); helper.applicationWait(3000); log.info("Date  selected");
	 * }catch(Exception e) { log.info("Date not selected"); }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * /*public void pickuptime(String s) throws WebDriverHelperException {
	 * helper.applicationWait(2000); //helper.clickButton(airpage.time);
	 * helper.select(airpage.time, s);
	 * 
	 * }
	 
	public void pickuptime(String time) {
		try {
			// helper.selectByText(AirportPageUI.time,time );
			log.debug("Pickuptime  selected");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot select Pickuptime ");
		}
	}

	public void selectcarbutton() throws WebDriverHelperException {
		helper.clickButton(airpage.select);
	}

	public void firstcar() throws WebDriverHelperException {
		helper.clickButton(airpage.selectfirstcar);
	}

	public void validate() throws WebDriverHelperException {

		String Expectedprice = "931";
		String Actualprice = helper.getText(airpage.booking);
		if (Actualprice.contains(Expectedprice)) {
			log = loggerUtil.createLog("Price Validated : " + Actualprice);
		}

	}
	public void ClickOnAirport() {
		log = loggerUtil.createLog("AirportPage.java");
		try {
			helper.actionClick(AirportPageUI.airport);
			log.debug("Clicked on Airport under service section");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot Click on Airport under service section");
		}
	}*/

	public void Switchtab(int i) {
		try {
			helper.switchHandles(i);
			log.debug("Switched to new Tab");
		} catch (Exception e) {
			log.debug("Cannot Switched to new Tab");
		}
	}

	public void SelectSrc(String source) {
		try {
			helper.sendText(AirportPageUI.src, source);
			helper.applicationWait(5000);
			helper.actionClick(AirportPageUI.srcclick);
			log.debug("Source location filled");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Source location");
		}
	}

	public void SelectDest(String Destination) {
		try {
			helper.sendText(AirportPageUI.dest, Destination);
			helper.applicationWait(5000);
			helper.actionClick(AirportPageUI.destclick);
			log.debug("Destination location filled");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Destination location");
		}
	}

	public void SelectTripType() {
		try {
			helper.selectByIndex(AirportPageUI.trip, 2);
			log.debug("TripType  selected");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot select TripType ");
		}
	}

	public void SelectDate(String Month,String Date) {
		try {
			helper.applicationWait(2000);
			helper.clickButton(
					AirportPageUI.datepicker);
			helper.applicationWait(5000);
			helper.Datepicker(AirportPageUI.mon, Month,
					AirportPageUI.nxt,
					AirportPageUI.date, Date);
			log.debug("Date  selected");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot select Date ");
		}
	}

	public void SelectPickuptime(String time) {
		try {
			helper.selectByText(AirportPageUI.pickup,time );
			log.debug("Pickuptime  selected");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot select Pickuptime ");
		}
	}

	public void ClickOnSearchCar() {
		try {
			helper.actionClick(AirportPageUI.searchcar);
			log.debug("SearchCar Clicked");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Click SearchCar ");
		}
	}

	public void SelectFirstCar() {
		try {
			helper.applicationWait(5000);
			helper.actionClick(AirportPageUI.firstcar);
			log.debug("First Car Selected in the result page");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Select Car ");
		}
	}

	public void ValidateCarDetails() {
		try {
			helper.applicationWait(5000);
			String Expectedprice = "931";
			String Actualprice = helper.getText(AirportPageUI.price);
			if (Actualprice.contains(Expectedprice)) {
				log.info("Price Validated : " + Actualprice);
			} else {
				log.info("Price Validation Failed : " + Actualprice);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Validate Car Details");
		}
	}
}
