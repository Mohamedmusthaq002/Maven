package org.stepdefinition;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void bef() {
	System.out.println("Before Scenario");
	browserLaunch();
	launchUrl("https://www.facebook.com/");
	
	}

	@After
	public void aft(Scenario s) {
	
		if (s.isFailed()) {
			
			TakesScreenshot tk= (TakesScreenshot)driver;
			byte[] a = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(a,"image/png");
		}
	}

	@Before(order=22)
	public void bef2() {
	System.out.println("Before Scenario 2");
	}
	
	@Before(order=33)
	public void bef3() {
	System.out.println("Before Scenario 3");
	}
	
	@After(order=4)
	public void aft4() {
	System.out.println("After Scenario 4");
	}
	
	@After(order=5)
	public void aft5() {
	System.out.println("After Scenario 5");
	}
	
}
