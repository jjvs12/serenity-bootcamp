package com.rcg.SiytooTestCase;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class GoogleDemoPage extends UIInteractions {
	private static final By googleImages = By.xpath("//a[text()='Images']");
	private static final By verification = By.xpath("//span[text()='Images']");

	@Step("Click Images")
	public void webRedirect() {
		$(googleImages).click();
	}

	@Step("Verify if the page was redirected")
	public String confirmTrue() {
		return $(verification).getText();
	}

}
