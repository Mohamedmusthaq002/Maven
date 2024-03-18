package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\Admin\\eclipse-workspace\\CucumberClass\\Rerun\\failed.txt",glue="org.stepdefinition"
                ,plugin="rerun:C:\\Users\\Admin\\eclipse-workspace\\CucumberClass\\Rerun\\failed.txt")

public class TestRerunnerClass {

}
