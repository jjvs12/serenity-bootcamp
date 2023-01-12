package com.rcg.SerranoTestCase.Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		plugin = {""},
		features = "src/test/java/com.rcg.SerranoTestCase/com.rcg.SerranoTestCase.Cucumber"
		
)
public class G_CucumberRunner {

}
