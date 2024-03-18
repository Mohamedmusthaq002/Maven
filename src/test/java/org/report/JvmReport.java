package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

@Test
public static void generateJvmReport(String jsonPath) {
	
	//1.To Fetch the Location Path
	File f= new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberClass\\Reports\\JvmReport");

	//2.To add the Some Details
	Configuration c= new Configuration(f,"FACEBOOK APPLICATION");
	c.addClassifications("Windows", "7/8");
	c.addClassifications("Sprint", "1234");
	c.addClassifications("Jdk Version", "1.8");
	
	//3.To add the Json path
	List <String> l= new ArrayList<String>();
	l.add(jsonPath);
	
	//4.To generate a Report
	ReportBuilder r= new ReportBuilder(l,c);
	r.generateReports();
	
}
	
	
	
	
	
	
	
	
	
	
}
