package com.rcg.SiytooTestCase;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
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
