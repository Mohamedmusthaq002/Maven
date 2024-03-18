package org.helper;

import org.helper.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	public LoginPojo() {
	
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindAll({
		
		@FindBy(id="emailId"),  // f
		@FindBy(xpath="//input[@name='emailId']")//t
	})
	private WebElement txtEmail;
	
	@CacheLookup
	@FindBy(name="pass")
	private WebElement txtPass;
	
	@CacheLookup
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
