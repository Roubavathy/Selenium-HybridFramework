package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.Pages.LoginPage;
import com.ReusableFunction.SeleniumUtility;
public class LoginStep extends Library {
	SeleniumUtility su;
	LoginPage lpage;
	@BeforeClass
	public void startUp() {
		browserSetUp();
		logger.info("Launched browser");
	}
	@Test
	public void login() {
		lpage=new LoginPage(driver);
		lpage.login(properties.getProperty("username"), properties.getProperty("password"));
		logger.info("enter username and password");
	}
	@AfterClass
	public void close() throws IOException {
		su = new SeleniumUtility(driver);
		su.to_take_screenshot("src/test/resources/Screenshot/freecrm.png");
		logger.info("screenshot");
		//tearDown();

	}

}


