package com.rcg.LeguisTestCase;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class PageNavigationDemo extends UIInteractions{
	@Step("Navigate to the home page")
	public void toTheGoogleHomePage() {
		openUrl("https://www.google.com/");
	}
}
