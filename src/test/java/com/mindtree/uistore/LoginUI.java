package com.mindtree.uistore;

import org.openqa.selenium.By;

public class LoginUI {


	public static By newemail = (By.xpath(".//*[@formcontrolname='userEmail']"));
	public static By newpass = (By.xpath(".//*[@formcontrolname='userPassword']"));
	public static By newlog = (By.xpath(".//*[@class='hori-vertical-center']"));
	
	public static By sign = By.xpath(".//*[@class='bg-signin m-auto']");
	public static By register =By.xpath(".//*[@class='theme-button-register']");
	public static By name=By.xpath(".//*[@formcontrolname='userName']");
	public static By phone=By.xpath(".//*[@formcontrolname='userPhone']");
 public static By email=By.xpath(".//*[@formcontrolname='userEmail']");
  //public static By password=By.xpath(".//*[@formcontrolname='userPassword']");
  public static By repassword=By.xpath(".//*[@formcontrolname='retypePassword']");
}

