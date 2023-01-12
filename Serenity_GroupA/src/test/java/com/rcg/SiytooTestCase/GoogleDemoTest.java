package com.rcg.SiytooTestCase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;


@ExtendWith(SerenityJUnit5Extension.class)
public class GoogleDemoTest {

	@Managed(driver = "chrome")
	WebDriver driver;
	NavigationDemo navigate;
	GoogleDemoPage locate;

	@Test
	public void googleActions() {

		driver.manage().window().maximize();
		navigate.SearchPage();
		locate.webRedirect();
		assertThat(locate.confirmTrue()).isEqualTo("Images");
	}
}
