package com.mindtree.utility;

import java.util.List;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestNGMethod;

public class SuiteListener implements ISuiteListener{
	public  static long testCount = 0 ; 
	 private List<ITestNGMethod> testMethods = null;

	 public void onStart( ISuite suite){
	       testMethods  = suite.getAllMethods();
	       testCount = testMethods.size();
	 }

	 public void onFinish( ISuite suite){

	 }
}
