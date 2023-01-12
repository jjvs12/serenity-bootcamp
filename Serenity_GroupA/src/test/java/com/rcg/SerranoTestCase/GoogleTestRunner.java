package com.rcg.SerranoTestCase;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@ExtendWith(SerenityJUnit5Extension.class)
public class GoogleTestRunner{
	@Managed(driver="chrome")
	WebDriver driver;

	G_BasePage navigate;
	G_PageObject objects;
	
	
	@Test
	public void createAcc(){
		driver.manage().window().maximize();
		navigate.openURL();
		objects.signIn();
		objects.createAcc();
		objects.chooseType();
		Serenity.reportThat("Create your Google Account", () -> assertThat(objects.verifyPage()).isEqualTo("Create your Google Account"));
	}
}
