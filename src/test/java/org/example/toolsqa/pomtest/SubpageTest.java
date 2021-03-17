package org.example.toolsqa.pomtest;

import org.example.toolsqa.pom.WebDriverFactory;
import org.example.toolsqa.pom.subpage.ElementsPage;
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

    @Test
    @DisplayName("Forms press")
    void formsPress() {
        //demoqa.com/elements starts off with elements header already selected -> cannot click forms header
        elementsPage.clickElements();
        elementsPage.clickForms();

    }


}
