package com.rcg.serenity;

import org.openqa.selenium.By;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class SearchActions extends UIInteractions {
	
	private static final By NAME = By.name("q");
	private static final By SportsUpdate = By.name("btnK");

	
	@Step("Search for NewsToday")
    public void byKeyword(String keyword) {
      $(NAME).sendKeys(keyword);
      $(SportsUpdate).click();
    }
}