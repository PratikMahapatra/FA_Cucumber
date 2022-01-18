package com.mindtree.pageobject;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.localpageUI;
import com.mindtree.utility.Logs;

public class localpage {

	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log ;
	localpageUI localui;
	public localpage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	public void clickonlocal() throws WebDriverHelperException {
		log = loggerUtil.createLog("localpage.java");
		helper.clickButton(localui.local);
		helper.switchHandles(1);	
	}
	public void cityname(String s) throws WebDriverHelperException, InterruptedException {
		helper.sendText(localui.city,s);
		Thread.sleep(5000);
		helper.clickButton(localui.selectedcity);
	}
	public void date(String s1,String s2) throws InterruptedException {
		helper.selectdate(localui.calender,localui.dMonth,localui.Month,localui.date, s1,s2);
			
	}
	
	public void time(String s) {
		helper.select(localui.time,s);
		
	}
	public void selectbutton() throws WebDriverHelperException {
		helper.clickButton(localui.selectbutton);
	}
	public void selectcar() throws WebDriverHelperException, InterruptedException {
		Thread.sleep(5000);
		helper.clickButton(localui.selectcar);
	}
	public void validate() throws WebDriverHelperException
	{
		   String ExpectedCarType ="Toyota Etios or Equivalent";
		   String ActualCarType = helper.getText(localui.car);
		   if(ActualCarType.contains(ExpectedCarType)) {
			   log = loggerUtil.createLog("CarType Validated : "+ActualCarType);
		   
	}
		
	}
}


