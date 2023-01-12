package com.rcg.SerranoTestCase;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class G_PageObject extends UIInteractions{
	
	@FindBy(xpath="//span[contains(text(),'Create your Google Account')]")
	WebElement verifyheading;
	
	@Step("Click Sign In button")
	public void signIn(){
		find("//a[@class='gb_ga gb_ha gb_ce gb_cd']").click();
	}
	
	@Step("Click Create Account button")
	public void createAcc() {
		find("//span[contains(text(),'Create account')]").click();
	}
	
	@Step("Choose Account Type")
	public void chooseType() {
		find("//li[@jsname='RZzeR']").waitUntilEnabled().click();
	}
	
	public String verifyPage() {
		return verifyheading.getText();
	}
}
