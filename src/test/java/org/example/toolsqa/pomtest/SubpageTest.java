package org.example.toolsqa.pomtest;

import org.example.toolsqa.pom.WebDriverFactory;
import org.example.toolsqa.pom.subpage.ElementsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SubpageTest {

    WebDriver webDriver;
    ElementsPage elementsPage;

    @BeforeEach
    void setup(){
        webDriver = WebDriverFactory.getWebDriver("firefox", false);
        elementsPage = new ElementsPage(webDriver);
        webDriver.get("https://demoqa.com/elements");

    }

    @Test
    @DisplayName("Elements press")
    void elementsPress() {
        elementsPage.clickElements();

    }

}
