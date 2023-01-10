package com.rcg.SerranoTestCase;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class G_BasePage extends UIInteractions{
	
	@Step("Navigate to Google website")
	public void openURL(){
		openUrl("https://www.google.com/?authuser=1");
	}
}
