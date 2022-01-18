package com.mindtree.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.outstationui;
import com.mindtree.utility.Logs;

public class outstationpageobject {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;
	outstationui outui;
	public outstationpageobject() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
		}
	
	
	public void clickonoutstation() throws WebDriverHelperException {
		helper.clickButton(outui.outstation);
		helper.switchHandles(1);
	}
	public void clickoneway()
	{
		helper.radiobutton(outui.oneradio,0);
	}
	public void roundtrip()
	{
		helper.radiobutton(outui.oneradio,1);
	}
	
	public void fromcityname(String s) throws WebDriverHelperException, InterruptedException
	{
		
	helper.sendText(outui.fromcity,s);
	Thread.sleep(5000);
	helper.clickButton(outui.fromcityclick);
	}
	public void tocityname(String s) throws WebDriverHelperException, InterruptedException
	{
		
	helper.sendText(outui.tocity,s);
	Thread.sleep(1000);
	helper.clickButton(outui.tocityclick);
	}
	public void roundtocityname(String s) throws WebDriverHelperException, InterruptedException
	{
		
	helper.sendText(outui.tocity,s);
	Thread.sleep(1000);
	helper.clickButton(outui.roundtocity);
	}
	
	public void date(String s1,String s2) throws InterruptedException
	{
		helper.selectdate(outui.calender,outui.dmonth,outui.Month,outui.date,s1,s2);
		
	}
	public void returndate(String s1,String s2) throws InterruptedException
	{
		helper.selectdate(outui.calender2,outui.dmonth,outui.Month,outui.date,s1,s2);
		
	}
	
	public void time(String s) {
		helper.select(outui.time,s);
		
	}
	public void selectcarbutton() throws WebDriverHelperException {
		helper.clickButton(outui.selectbutton);
	}
	public void firstcarselect() throws InterruptedException, WebDriverHelperException {
		Thread.sleep(5000);
		helper.clickButton(outui.selectcar);
	}
	public void validate() throws WebDriverHelperException {
		   String Expectedprice ="4657";
		   String Actualprice = helper.getText(outui.price);
		   if(Actualprice.contains(Expectedprice)) {
			   log = loggerUtil.createLog("Price Validated : "+Actualprice);
	   }
	}
}
	


