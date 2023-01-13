package com.rcg.GarciaTestCase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@ExtendWith(SerenityJUnit5Extension.class)
public class GoogleTestRun {
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	GoogleBasePage navigate;
	GooglePageObject objects;
	
	@Test
	public void searchSerenity() {
		driver.manage().window().maximize();
		navigate.openURL();
		objects.searchData();
		Serenity.reportThat("All", () -> assertThat(objects.validatePage()).isEqualTo("All"));
	}
	

}
