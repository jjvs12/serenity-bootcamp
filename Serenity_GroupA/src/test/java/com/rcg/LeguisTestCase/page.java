package com.rcg.LeguisTestCase;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class page extends UIInteractions {
	private static final By verification1 = By.xpath("//a[contains(text(),'English')]");
	@Step("Change Google Theme")
	public void toSetting() {
		$(By.xpath("//div[contains(text(),'Settings')]")).click();
	}
	@Step("Change Google Theme")
	public void darkThemeEnable() {
		$(By.xpath("//div[contains(text(),'Dark theme: Off')]")).click();
	}
	@Step("Choose language")
	public void changeLanguageToFilipino() {
		$(By.linkText("Filipino")).click();
	}
	@Step("Choose language")
	public String verification() {
		return $(verification1).getText();
	}
	
}
