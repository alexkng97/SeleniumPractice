package org.example.toolsqa.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.toolsqa.pom.HomePage;
import org.example.toolsqa.pom.WebDriverFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefs {
    WebDriver webDriver;
    HomePage homePage;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        webDriver = WebDriverFactory.getWebDriver("firefox", false);
        homePage = new HomePage(webDriver);
        webDriver.get(homePage.getBASE_URL());

    }

    @When("I click on the category {string}")
    public void iClickOnTheCategory(String category) {
        homePage.clickCategory(category);
    }

    @Then("I should be directed to {string}")
    public void iShouldBeDirectedTo(String url) {
        Assertions.assertEquals(url, homePage.getURL());
    }
}
