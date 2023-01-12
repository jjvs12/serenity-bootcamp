package com.rcg.GoogleSteps;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/java/com/rcg/features"}, 
plugin= {"junit"})
public class BDDGoogleRunner {

}
