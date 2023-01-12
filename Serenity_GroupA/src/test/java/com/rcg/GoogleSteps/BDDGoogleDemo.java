package com.rcg.GoogleSteps;

import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.WebDriver;
import com.rcg.SiytooTestCase.GoogleDemoPage;
import com.rcg.SiytooTestCase.NavigationDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class BDDGoogleDemo extends NavigationDemo{
	@Managed(driver = "chrome")
	WebDriver driver;
	NavigationDemo navigate;
	GoogleDemoPage locate;
	
	@Given("^Browser and website \"(.*)\" is open$")
	public void Browser_and_website_is_open(String sURL) {
		driver.manage().window().maximize();
		navigate.SearchPage();
		openUrl(sURL);

	}
	@When("^User clicked Images$")
	public void User_clicked_Images() {
		locate.webRedirect();
		
	}
	@Then("^Redirection Successful$")
	public void VerifySuccess() {
		assertThat(locate.confirmTrue()).isEqualTo("Images");
	}
	
	}
