package com.rcg.SerranoTestCase.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		plugin = {"pretty"},
		features = "src/test/java"
		
)
public class G_CucumberRunner {

}
