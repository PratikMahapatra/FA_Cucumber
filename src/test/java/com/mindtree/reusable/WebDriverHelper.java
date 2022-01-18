package com.mindtree.reusable;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.manager.WebDriverManager;


public class WebDriverHelper extends WebDriverManager {

	public void sendText(By element, String text) throws WebDriverHelperException {
		try {
			driver.findElement(element).sendKeys(text);
		} catch (ElementNotInteractableException exception) {
			throw new WebDriverHelperException(exception);
		}
	}

	public String getText(By element) throws WebDriverHelperException {
		String text = null;
		try {
			text = driver.findElement(element).getText();
		} catch (ElementNotInteractableException exception) {
			throw new WebDriverHelperException(exception);
		}
		return text;
	}



	public void clickButton(By element) throws WebDriverHelperException {
		try {
			driver.findElement(element).click();
		} catch (ElementClickInterceptedException exception) {
			throw new WebDriverHelperException(exception);
		}
	}

	public void switchHandles(int index) {
		ArrayList<String> handles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(index));
	}


	public void hover(By element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(element)).perform();
	}


	public void pageLoad(int time) throws WebDriverHelperException {
		try {
			driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
		} catch (TimeoutException exception) {
			throw new WebDriverHelperException(exception);
		}
	}


	public void clearText(By element) {
		driver.findElement(element).clear();
	}


	public void actionClick(By element) throws WebDriverHelperException {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(element));
		actions.click(driver.findElement(element)).build().perform();
	}

	public boolean elementDisplayed(By element) {
		return driver.findElement(element).isDisplayed();
	}


	public void explicitWaitForVisibility(int time, By element) throws WebDriverHelperException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
		} catch (TimeoutException exception) {
			throw new WebDriverHelperException(exception);
		}
	}


	public void explicitWaitForInvisibility(By element, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	}


	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	

	public void enterKey(By element) {
		WebElement we=driver.findElement(element);
		we.sendKeys(Keys.ENTER);
	}

	public void applicationWait(int time) throws WebDriverHelperException {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			throw new WebDriverHelperException(e);
		}
	}
	public void select(By element,String string)
	{
		Select s = new Select(driver.findElement(element));
		 s.selectByVisibleText(string);
	}
	public void selectByText(By xpath, String string) {
		// TODO Auto-generated method stub
		Select select = new Select(driver.findElement(xpath));
		select.selectByVisibleText(string);
	}

	
	public void selectdate(By calender,By dmonth,By month,By date,String d,String Month) throws InterruptedException {
		
	   driver.findElement(calender).click();
	   Thread.sleep(2000);
	   while(true) {
		String Default_Month = driver.findElement(dmonth).getText();
		if(Month.equals(Default_Month) ) {
			break;
		}
		else {
			driver.findElement(month).click();
		}
	}
        int c = driver.findElements(date).size();
	    for(int i=0;i<c;i++) {
		
		    if(driver.findElements(date).get(i).getText().contains(d)) {
			WebElement ele = driver.findElements(date).get(i);
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click()",ele);

			break;
		}
	}
		
	}

	
	public void radiobutton(By element,int c)
	{
		
		driver.findElements(element).get(c).click();
	}
	
	
	
	public String title() {
		return driver.getTitle();
	}
	public void Datepicker(By xpath, String Month, By xpath2, By xpath3, String Date) {
		while (true) {
			String Default_Month = driver.findElement(xpath).getText();
			if (Month.equals(Month)) {
				break;
			} else {
				driver.findElement(xpath2)
						.click();
			}
		}
		int count = driver.findElements(xpath3).size();
		for (int i = 0; i < count; i++) {

			if (driver.findElements(xpath3).get(i).getText()
					.contains(Date)) {
				driver.findElements(xpath3).get(i).click();
				break;
			}
		}
		
	}

	public void selectByValue(By xpath, String string) {
		Select select = new Select(driver.findElement(xpath));
		select.selectByValue(string);
	}
	public void selectByIndex(By xpath, int i) {
		// TODO Auto-generated method stub
		Select select = new Select(driver.findElement(xpath));
		select.selectByIndex(i);
	}

}

		

