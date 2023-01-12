package com.rcg.test; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public void openBrowser(String sBrowser) {
	switch (sBrowser.toUpperCase()) {
	case "CHROME" : case "GOOGLE CHROME" :
		WebDriverManager.chromedriver().setup(); // pang open ng browser
		driver = new ChromeDriver(); // pang open ng browser
		driver.manage().window().maximize();
		break;
	case "FIREFOX" : 
		WebDriverManager.firefoxdriver().setup(); // pang open ng browser
		driver = new FirefoxDriver(); // pang open ng browser
		driver.manage().window().maximize();
		break;
	default : 
		WebDriverManager.chromedriver().setup(); // pang open ng browser
		driver = new ChromeDriver(); // pang open ng browser
		driver.manage().window().maximize();
		break;
	}
	
	
	
}
public void openURL(String sURL) {
		driver.get(sURL);
	}
	
public void endTest() {
		driver.close();
		driver.quit();
	}

}
