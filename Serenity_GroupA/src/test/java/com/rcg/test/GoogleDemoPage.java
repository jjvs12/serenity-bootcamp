package com.rcg.test;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;

public class GoogleDemoPage extends UIInteractions {
	private static final By googleImages = By.xpath("//a[text()='Images']");
	private static final By verification = By.xpath("//span[text()='Images']");

	public void webRedirect() {
		$(googleImages).click();
	}

	public String confirmTrue() {
		return $(verification).getText();

	}
}
