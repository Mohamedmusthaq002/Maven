package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
    static Robot r;
    static Alert a;
    static Actions ac;
	
	public static void browserLaunch() {
   
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	public static void closeBrowser() {
        
		driver.close();
	}
	
	public static void pageTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void pageUrl() {
        
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
    public static void launchUrl(String url) {
        
		 driver.get(url);
	}
	
    public static void fillTextBox(WebElement webRef,String value) {
         
		webRef.sendKeys(value);
	}
	
    public static void btnClick(WebElement webref) {
		
    	webref.click();

	}
    
    public static void copy() throws AWTException {
		
    	 r= new Robot();

    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_C);
    	
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_C);
	}
	
    public static void paste() {
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}
    
    public static void selectDropDown(WebElement ref,String value) {

      Select s= new Select(ref);
      
      s.selectByValue(value);

	}    
    
    public static void switchIntoAlert() {

    	 a = driver.switchTo().alert();
    	
	}
    
    public static  void acceptAlert() {
		  
    	a.accept();
         
	}
    
    public static  void dismissAlert() {
		
    	a.dismiss();

	}
    
    public static void javaScriptSenkeys(WebElement ref,String value) {
		
    	JavascriptExecutor js= (JavascriptExecutor)driver;
    	
    	js.executeScript("arguments[0].setAttribute('value','"+value+"')",ref );

	}
    
    public static void takeSnap(String name) throws IOException {
		
    	TakesScreenshot tk = (TakesScreenshot)driver;
    	
    	File src = tk.getScreenshotAs(OutputType.FILE);
    	
    	File des= new File("C:\\Users\\Admin\\eclipse-workspace\\MavenSession\\ScreenShot\\"+name+".png");
    	
    	FileUtils.copyFile(src, des);
    	
	}
    
    public static void switchWindow(int window) {

    	Set<String> allWindowId = driver.getWindowHandles();
    	
        List <String>l= new ArrayList();
    	
    	l.addAll(allWindowId);
    	
    	   String id = l.get(window);
    	   
       driver.switchTo().window(id);
       

	}
    
    public static void switchFrame(String nameOrId) {
		
    	driver.switchTo().frame(nameOrId);

	}
    
    public static void doubleClick(WebElement ref) {
		
    	 ac= new Actions(driver);
    	
    	ac.doubleClick(ref).perform();

	}
    
    public static void rigthClick(WebElement ref) {
		
    	ac.contextClick(ref).perform();

	}
    
	
}
