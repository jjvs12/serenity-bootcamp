package com.rcg.LeguisTestCase;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class GooglePageBasePage extends UIInteractions{
	private static final By verification1 = By.xpath("//a[contains(text(),'English')]");
	@Step("Choose language")
	public void changeLanguageToFilipino() {
		$(By.linkText("Filipino")).click();
	}
	@Step("Choose language")
	public String verification() {
		return $(verification1).getText();
	}

}
