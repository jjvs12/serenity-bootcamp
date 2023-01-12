package com.rcg.serenity;

import org.openqa.selenium.JavascriptExecutor;

public class SelectLastIndex extends FirstSerenityActivity {
	
		public void selectLast() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			js.executeScript("window.scrollBy(0,1000)");
		}
}
