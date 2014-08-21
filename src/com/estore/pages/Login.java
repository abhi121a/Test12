//trying to use page object model as explained in Guru99.com

package com.estore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login{
// initialization
	WebDriver driver;
	/*Simple Page object model */
/*	
// constructor
	public Login(WebDriver driver){
		this.driver=driver;
	}
	
	
//identifiying web element element on a page its like creating Object repository for web elements
//developing page object model for landing page
	//element repository is independent of test
	
	// signin button id identification
	By signinid = By.id("sign-in-button-accessible");
	// username identification
	By usernameid = By.id("username");
	// password identification
	By passwordid = By.id("password");
	// sign in button identification
	By signinbuttonid = By.id("btn-signIn-accessible");
	
	

// Actions on a page related to that page	
	
	
	
	//clicking on Signin button on home page
	public void logintoasdagroceries(String username,String password){
		driver.findElement(signinid).click();
		driver.switchTo().frame("login");
		driver.findElement(usernameid).sendKeys(username);
		driver.findElement(passwordid).sendKeys(password);
		driver.findElement(signinbuttonid).click();
driver.switchTo().defaultContent();		
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
	
	*/
	
/* using Page factory concept */
	//Page Factory is an inbuilt page object model concept for Selenium WebDriver but it is very optimized
	//page factory class contains @findby annotation to find webelement.
	//we use intiElements method to initialize web element
	
	@FindBy(id="sign-in-button-accessible") 
	WebElement signinid;
	
	@FindBy(id="username")
	WebElement usernameid;
	
	@FindBy(id="password")
	WebElement passwordid;
	
	@FindBy(id="btn-signIn-accessible")
	WebElement signinbuttonid;
	
	//constructor for page factory 
	
	public Login(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void logintoasdagroceries(String username,String password){
		signinid.click();
		driver.switchTo().frame("login");
		usernameid.sendKeys(username);
	    passwordid.sendKeys(password);
		signinbuttonid.click();
driver.switchTo().defaultContent();		
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
	
	}
}



