package org.example.pomtest;


import org.example.pom.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HomeTest {
	WebDriver webDriver;
	HomePage homePage;

	@BeforeEach
	void setup(){
		boolean headless = true;
		if(headless) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("headless");
			webDriver = new ChromeDriver(chromeOptions);
		}else {
			webDriver = new ChromeDriver();
		}
		homePage = new HomePage(webDriver);
		webDriver.get(homePage.getBASE_URL());

	}

	@Test
	@DisplayName("Logo press")
	void logoPress() {
		homePage.clickLogo();
		Assertions.assertEquals("https://demoqa.com/", homePage.getURL());

	}

	@Test
	@DisplayName("Initial cards getter")
	void initialCardsGetter() {
		homePage.getCategory("Elements");

	}
}
