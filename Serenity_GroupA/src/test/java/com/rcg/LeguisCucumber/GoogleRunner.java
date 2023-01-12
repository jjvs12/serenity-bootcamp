package com.rcg.LeguisCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		plugin = "pretty",
		features = "src/test/resources/CucumberSerenity.feature"
		
		)
public class GoogleRunner {

}
