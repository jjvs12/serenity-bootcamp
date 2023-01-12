package com.rcg.SerranoTestCase.Cucumber;

import static org.assertj.core.api.Assertions.assertThat;


import com.rcg.SerranoTestCase.G_BasePage;
import com.rcg.SerranoTestCase.G_PageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;



public class G_CucumberStepDef {
//	"(.*)" -- 
	
	@Steps
	G_BasePage bp;
	G_PageObject pg;
	
	@Given("^Browser and website is open$")
	public void Browser_and_website_is_open() {
		bp.openURL();
//		 throw new io.cucumber.java.PendingException();
	}
	
	@When("^User clicks signIn$")
	public void User_clicks_signIn() {
		pg.signIn();
//		 throw new io.cucumber.java.PendingException();
	}
	
	@When("^User clicks createAcc$")
	public void User_clicks_createAcc() {
		pg.createAcc();
//		 throw new io.cucumber.java.PendingException();
	}
	
	@When("^User selects googleType$")
	public void User_selects_googleType() {
		pg.chooseType();
//		 throw new io.cucumber.java.PendingException();
	}
	
	@Then("^Create Google Account Page is displayed$")
	public void Create_Google_Account_Page_is_displayed() {
//		pg.verifyPage();
		Serenity.reportThat("Create your Google Account", () -> assertThat(pg.verifyPage()).isEqualTo("Create your Google Account"));
//		 throw new io.cucumber.java.PendingException();
	}
	
}
