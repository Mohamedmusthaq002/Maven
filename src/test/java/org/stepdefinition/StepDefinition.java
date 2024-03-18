package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.helper.BaseClass;
import org.helper.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	LoginPojo l;
	@Given("User have to Launch the FaceBook Application through Chrome Browser")
	public void user_have_to_Launch_the_FaceBook_Application_through_Chrome_Browser() {
		
		
	}

	

	@When("User have to Enter the InValid email and Invalid Password")
	public void user_have_to_Enter_the_InValid_email_and_Invalid_Password() {
		
		
	    l= new LoginPojo();
		WebElement email = l.getTxtEmail();
		email.sendKeys("Greens12345");
		
		WebElement pass = l.getTxtPass();
		pass.sendKeys("9876543");
	}
	
	@When("User have to Enter the Valid Email and Invalid Password")
	public void user_have_to_Enter_the_Valid_Email_and_Invalid_Password() {
	    
		 l= new LoginPojo();
	     WebElement txtEmail = l.getTxtEmail();
	     txtEmail.sendKeys("Greens");
			
		WebElement txtPass = l.getTxtPass();
		txtPass.sendKeys("12345");
	}

	@When("User have to Click the Login button")
	public void user_have_to_Click_the_Login_button() {
	   
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

	@Then("User have to reach Invalid Credential Page")
	public void user_have_to_reach_Invalid_Credential_Page() {
	   
		String url = driver.getCurrentUrl();
		
		if (url.contains("privacy_mutation_token")) {
			
			System.out.println("User Have to reach invalid Credential Page");
		} 
		else {
			System.out.println("User Have to Not reach invalid Credential Page");
		}
	}




@Given("User have click the forgotten password")
public void user_have_click_the_forgotten_password() {
   
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}

@When("User have to enter the email or phno")
public void user_have_to_enter_the_email_or_phno() {
   
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Greens12345");
}

@Then("User have to click search button")
public void user_have_to_click_search_button() {
   
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
@When("User have to Enter the InValid Email and Invalid Password")
public void user_have_to_Enter_the_InValid_Email_and_Invalid_Password() {
   
	 l= new LoginPojo();
     WebElement txtEmail = l.getTxtEmail();
     txtEmail.sendKeys("Greens");
		
	WebElement txtPass = l.getTxtPass();
	txtPass.sendKeys("12345");
}
	
	
	
	
	
	
	
	
	
	
	

}
