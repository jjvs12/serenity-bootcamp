package com.rcg.LeguisTestCase;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
@ExtendWith(SerenityJUnit5Extension.class)
public class GooglePageDemoText {
	@Managed(driver = "chrome")
	WebDriver driver;
	
	PageNavigationDemo navigate;
	GooglePageBasePage locate;
	
	@Test
	public void googlePageActions() {
		navigate.toTheGoogleHomePage();
		locate.changeLanguageToFilipino();
		assertThat(locate.verification()).isEqualTo("English");
	}

}
