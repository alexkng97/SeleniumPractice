package org.example.toolsqa.pomtest;
import org.example.toolsqa.pom.HomePage;
import org.example.toolsqa.pom.WebDriverFactory;
import org.example.toolsqa.pom.subpage.elements.ElementsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class HomeTest {
	WebDriver webDriver;
	HomePage homePage;

	@BeforeEach
	void setup(){
		webDriver = WebDriverFactory.getWebDriver("firefox", true);
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
		ElementsPage elementsPage = homePage.clickElementsCategory();
		Assertions.assertEquals("https://demoqa.com/elements", homePage.getURL());
	}

}
