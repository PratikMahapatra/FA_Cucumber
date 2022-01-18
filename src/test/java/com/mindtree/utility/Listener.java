package com.mindtree.utility;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	Logs logUtil;
	Logger log,log1;
    ProgressBar progressbar;
    
	static int i =0;
    public int testCount;
	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(testCount);
		progressbar.iterate(i += Math.ceil(100/2));
		
	}

	public void onTestFailure(ITestResult result) {
		progressbar.iterate(i += Math.ceil(100/2));
		
	}

	public void onTestSkipped(ITestResult result) {
		 progressbar.iterate(i += Math.ceil(100/2));
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		testCount = (int)SuiteListener.testCount;
		progressbar = new ProgressBar();
		progressbar.setVisible(true);
		
	}

	public void onFinish(ITestContext context) {
//		email = new AutoTriggerEmail();
//		try {
//			email.autotrigger();
//		} catch (EmailException e) {
//			e.printStackTrace();
//		}
	}
	

}
