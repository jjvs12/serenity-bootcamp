package com.rcg.GarciaTestCase;

import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class GoogleBasePage extends UIInteractions{
	
	@Step("Navigate to Google website")
	public void openURL() {
		openUrl("https://www.google.com");
	}
	

}
