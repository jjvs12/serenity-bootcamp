package com.rcg.LeguisTestCase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GooglePageCucumber {
	
	@Steps
	google navigate;
	
	@Steps
	page locate;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	    navigate.toTheGoogleHomePage();
	}

	@When("User click filipino hypertext")
	public void user_click_filipino_hypertext() {
	   locate.changeLanguageToFilipino();
	}


}
