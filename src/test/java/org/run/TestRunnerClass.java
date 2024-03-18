package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\CucumberClass\\src\\test\\resources\\Feature"
                 ,glue="org.stepdefinition",monochrome=true,dryRun=false,strict=true ,
                 tags= {"@sanity , @Regression"},
                 plugin= {"json:C:\\Users\\Admin\\eclipse-workspace\\CucumberClass\\Reports\\Json\\facebook.json",
                		 "rerun:C:\\Users\\Admin\\eclipse-workspace\\CucumberClass\\Rerun\\failed.txt"}
                 )
                
              
public class TestRunnerClass {
	  
@AfterClass
public static void report() {
	
	JvmReport.generateJvmReport("C:\\Users\\Admin\\eclipse-workspace\\CucumberClass\\Reports\\Json\\facebook.json");

}
	
	
	
}
