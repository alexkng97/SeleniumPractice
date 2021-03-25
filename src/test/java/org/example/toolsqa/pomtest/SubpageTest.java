package org.example.toolsqa.pomtest;

import org.example.toolsqa.pom.WebDriverFactory;
import org.example.toolsqa.pom.subpage.elements.ElementsPage;
import org.example.toolsqa.pom.subpage.elements.TextBoxPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Text;

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
        elementsPage.clickElementsHeader();
        elementsPage.clickBookStoreHeader();

    }

    @Test
    @DisplayName("Text box subsection")
    void textBoxSubsection() {
        TextBoxPage textBoxPage = elementsPage.clickTextBox();
        textBoxPage.enterFullName("Ed Sheeran");
        textBoxPage.enterEmail("test@test.org");
        textBoxPage.enterCurrentAddress("21 current address\nLondon");
        textBoxPage.enterPermanentAddress("89 permanent address\nParis");

        textBoxPage.clickSubmit();
    }




}
