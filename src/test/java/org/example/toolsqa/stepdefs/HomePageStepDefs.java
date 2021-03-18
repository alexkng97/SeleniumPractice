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
        switch(category){
            case "Elements":
                homePage.clickElementsCategory();
                break;
            case "Forms":
                homePage.clickFormsCategory();
                break;
            case "Alerts, Frame & Windows":
                homePage.clickAlertsCategory();
                break;
            case "Widgets":
                homePage.clickWidgetsCategory();
                break;
            case "Interactions":
                homePage.clickInteractionsCategory();
                break;
            default:
                System.out.println("Invalid category name");
        }
    }

    @Then("I should be directed to {string}")
    public void iShouldBeDirectedTo(String url) {
        Assertions.assertEquals(url, homePage.getURL());
        webDriver.close();
    }

    @When("I click on the logo")
    public void iClickOnTheLogo() {
        homePage.clickLogo();
    }

    @Then("I should be directed to the homepage")
    public void iShouldBeDirectedToTheHomepage() {
        Assertions.assertEquals(homePage.getBASE_URL(),homePage.getURL());
        webDriver.close();
    }
}
