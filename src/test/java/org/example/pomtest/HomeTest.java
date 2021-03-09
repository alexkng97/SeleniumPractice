package org.example.pomtest;


import org.example.pom.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
	WebDriver webDriver;
	HomePage homePage;

	@BeforeEach
	void setup(){
		webDriver = new ChromeDriver();
		homePage = new HomePage(webDriver);
		webDriver.get(homePage.getBASE_URL());

	}

	@Test
	@DisplayName("Logo press")
	void logoPress() {
		homePage.clickLogo();
		Assertions.assertEquals("https://demoqa.com/", homePage.getURL());

	}
}
