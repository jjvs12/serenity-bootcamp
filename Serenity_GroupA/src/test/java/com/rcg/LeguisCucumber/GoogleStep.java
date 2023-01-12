package com.rcg.LeguisCucumber;

import com.rcg.LeguisTestCase.google;
import com.rcg.LeguisTestCase.page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleStep {
	
	@Steps
	
	google openPage;
	page action;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	    openPage.toTheGoogleHomePage();
	}

	@When("User click filipino hypertext")
	public void user_click_filipino_hypertext() {
	   action.changeLanguageToFilipino();
	}
	
	@Given("User is on Google home page")
	public void user_is_on_Google_home_page() {
		openPage.toTheGoogleHomePage();
	}
	
	@When("User click settings")
	public void user_click_settings() {
		action.toSetting();
	}

	@And("Turn on dark theme")
	public void turn_on_dark_theme() {
		action.darkThemeEnable();
	}
}
