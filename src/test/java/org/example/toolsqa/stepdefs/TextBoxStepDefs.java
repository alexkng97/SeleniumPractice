package org.example.toolsqa.stepdefs;

import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.toolsqa.pom.HomePage;
import org.example.toolsqa.pom.WebDriverFactory;
import org.example.toolsqa.pom.subpage.elements.ElementsPage;
import org.example.toolsqa.pom.subpage.elements.TextBoxPage;
import org.openqa.selenium.WebDriver;

public class TextBoxStepDefs {
    WebDriver webDriver;
    TextBoxPage textBoxPage;

    @Given("I am on the textbox page")
    public void iAmOnTheTextboxPage() {
        webDriver = WebDriverFactory.getWebDriver("firefox", false);
        HomePage homePage = new HomePage(webDriver);
        webDriver.get(homePage.getBASE_URL());
        ElementsPage elementsPage = homePage.clickElementsCategory();
        textBoxPage = elementsPage.clickTextBox();


    }

    @When("I enter details {string}, {string}, {string}, {string} and click submit")
    public void iEnterDetailsAndClickSubmit(String fullName, String email, String currentAddress, String permanentAddress) {
        textBoxPage.enterFullName(fullName);
        textBoxPage.enterEmail(email);
        textBoxPage.enterCurrentAddress(currentAddress);
        textBoxPage.enterPermanentAddress(permanentAddress);
        textBoxPage.clickSubmit();

    }

    @Then("the details should be submitted")
    public void theDetailsShouldBeSubmitted() {
    }
}
