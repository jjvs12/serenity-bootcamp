package com.rcg.LeguisTestCase;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

	@RunWith(SerenityRunner.class)
	@ExtendWith(SerenityJUnit5Extension.class)
	public class test {
		
		@Managed(driver = "chrome")
		WebDriver driver;
		
		google navigate;
		page locate;
	
		
		@BeforeEach
		public void openGoogle() {
			navigate.toTheGoogleHomePage();
		}
		
		@Test
		void changeTheme() {
			locate.toSetting();
			locate.darkThemeEnable();

		}
		
		@Test
		void changeLanguage() {
			locate.changeLanguageToFilipino();
			assertThat(locate.verification()).isEqualTo("English");
		}
		
}
