package com.rcg.test;

import io.cucumber.junit.CucumberOptions;
//import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/google"},
		glue = {"classpath:com.rcg.test"})

public class BDDGoogleRunner {

}
