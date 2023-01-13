package com.rcg.GarciaTestCase;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class GooglePageObject extends UIInteractions{
	
	WebElement validatePage;
	
	
	@Step("Enter Serenity BDD onto search bar")
	public void searchData() {
		find("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input").typeAndEnter("Serenity BDD");
	}
	
	@Step("Validate Redirected Page")
	public String validatePage(){
		return validatePage.getText();
	}

}
