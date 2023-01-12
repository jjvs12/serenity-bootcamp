package com.rcg.test;

import org.junit.After;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDGoogle extends BaseTest{

	@After
	public void tearDown() {
		endTest();
	}
	
	@Given("^Browser \"(.*)\" and website \"(.*)\" is open$")
	public void Browser_and_website_is_open(String sBrowser, String sURL) {
		openBrowser(sBrowser);
		openURL(sURL);
	}
	
	@When("signInButton is visible")
	public void signInButton_is_visible() {
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).isEnabled();

	}
	@And("signInButton is clicked")
	public void signInButton_is_clicked() {
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
	}
	
	@Then("signIn is displayed")
	public void signIn_is_displayed() {
		driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).isDisplayed();
	}
}