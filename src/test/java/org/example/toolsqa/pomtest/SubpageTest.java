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
        elementsPage.clickElementsHeader();

    }

    @Test
    @DisplayName("Forms press")
    void formsPress() {
        //demoqa.com/elements starts off with elements header already selected -> cannot click forms header
        elementsPage.clickElementsHeader();
        elementsPage.clickFormsHeader();

    }

    @Test
    @DisplayName("Alerts press")
    void alertsPress() {
        //demoqa.com/elements starts off with elements header already selected -> cannot click forms header
        elementsPage.clickElementsHeader();
        elementsPage.clickAlertsHeader();

    }

    @Test
    @DisplayName("Widgets press")
    void widgetsPress() {
        //demoqa.com/elements starts off with elements header already selected -> cannot click forms header
        elementsPage.clickElementsHeader();
        elementsPage.clickWidgetsHeader();

    }

    @Test
    @DisplayName("Interactions press")
    void interactionsPress() {
        //demoqa.com/elements starts off with elements header already selected -> cannot click forms header
        elementsPage.clickElementsHeader();
        elementsPage.clickInteractionsHeader();

    }

    @Test
    @DisplayName("Book store press")
    void bookStorePress() {
        //demoqa.com/elements starts off with elements header already selected -> cannot click forms header
        elementsPage.clickElementsHeader();
        elementsPage.clickBookStoreHeader();

    }

    @Test
    @DisplayName("Text box subsection")
    void textBoxSubsection() {
        //demoqa.com/elements starts off with elements header already selected -> cannot click forms header
        elementsPage.clickTextBox();

    }




}
