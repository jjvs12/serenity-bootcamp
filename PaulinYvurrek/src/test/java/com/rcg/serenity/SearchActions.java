package com.rcg.serenity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SearchActions extends UIInteractions {
	
	private static final By NAME = By.name("q");
	private static final By LASTINDEX = By.xpath("//ul[@class='G43f7e']/li[last()]");
	
	@Step("Search for '{0}'")
    public void byKeyword(String keyword) {
      $(NAME).sendKeys(keyword);
      $(LASTINDEX).click();;      
    }
}