
package com.testng.estore;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.estore.pages.*;
public class Testjunit{
	WebDriver driver;
	Homepage hpg;
	Login log;
	
	@BeforeTest
	public  void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://groceries.asda.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test_login_is_successful()
	{
		log = new Login(driver);
		log.logintoasdagroceries("abhi11@wipro.com", "wipro@123");
			
	}
	
	

}