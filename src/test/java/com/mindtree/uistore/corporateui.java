package com.mindtree.uistore;

import org.openqa.selenium.By;

public class corporateui {

	public static By service = By.xpath(".//*[@href='/corporate-car-rental']");
	public static By name =By.xpath(".//*[@formcontrolname='corpRegNameControl']");
	public static By company =By.xpath(".//*[@formcontrolname='corpRegCompanyControl']");
	public static By email =By.xpath(".//*[@formcontrolname='corpRegEmailControl']");
	public static By phone =By.xpath(".//*[@formcontrolname='corpRegPhoneControl']");
	public static By vol =By.xpath("//*[@formcontrolname='corpRegmonthlyRentalRequirementControl']");
	public static By account =By.xpath(".//*[@class='createAccountBtn']");
	public static By text =By.xpath(".//*[@class='col apiResponseHandlingDiv ng-star-inserted']");
	//public static By text =By.xpath(".//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-corporate-car-rental-agency-india/div[1]/div[2]/form/div[7]");
	//public static By account =By.xpath(".//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-corporate-car-rental-agency-india/div[1]/div[2]/form/div[6]/div[1]/div/button");
}
