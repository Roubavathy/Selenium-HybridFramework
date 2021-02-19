package com.StepsDefinition;

import com.BaseClass.Library;
import com.Pages.LoginPage;
import com.ReusableFunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends Library {
	SeleniumUtility su;
	LoginPage lpage;
	@Given("To enter url and navigate to application.")
	
	
	public void to_enter_url_and_navigate_to_application() {
		browserSetUp();
		logger.info("Launched browser");
	}

	@When("To enter {string} and {string}.")
	public void to_enter_and(String string, String string2) {
		lpage = new LoginPage(driver);
		String Password = "Aathi@1009";
		String Username = "roopa.narayanan87@gmail.com";
		lpage.login(Username, Password);
	}

	@Then("click the submit button.")
	public void click_the_submit_button() throws InterruptedException {
		lpage.click();
		   Thread.sleep(2000);
	}

	@Then("To test screenshot.")
	public void to_test_screenshot() {
		su = new SeleniumUtility(driver);
		su.to_take_screenshot("src/test/resources/Screenshot/freecrm.png");
	}

	@Then("Close the browser.")
	public void close_the_browser() {
		 driver.close();
	}

}
