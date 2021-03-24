package org.example.toolsqa.pom.subpage;

import org.example.toolsqa.pom.Page;
import org.example.toolsqa.pom.subpage.elements.TextBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Subpage extends Page {
    By elementsHeader = By.cssSelector(".element-group:nth-child(1) .header-wrapper");
    By formsHeader = By.cssSelector(".element-group:nth-child(2) .header-wrapper");
    By alertsHeader = By.cssSelector(".element-group:nth-child(3) .header-wrapper");
    By widgetsHeader = By.cssSelector(".element-group:nth-child(4) .header-wrapper");
    By interactionsHeader = By.cssSelector(".element-group:nth-child(5) .header-wrapper");
    By bookStoreHeader = By.cssSelector(".element-group:nth-child(6) .header-wrapper");

    By textBox = By.id("item-0");

    public Subpage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getElementsHeader(){
        return webDriver.findElement(elementsHeader);
    }

    public void clickElementsHeader(){
        getElementsHeader().click();
    }

    public WebElement getFormsHeader(){
        return webDriver.findElement(formsHeader);
    }

    public void clickFormsHeader(){
        getFormsHeader().click();
    }

    public WebElement getAlertsHeader(){
        return webDriver.findElement(alertsHeader);
    }

    public void clickAlertsHeader(){
        getAlertsHeader().click();
    }

    public WebElement getWidgetsHeader(){
        return webDriver.findElement(widgetsHeader);
    }

    public void clickWidgetsHeader(){
        getWidgetsHeader().click();
    }

    public WebElement getInteractionsHeader(){
        return webDriver.findElement(interactionsHeader);
    }

    public void clickInteractionsHeader(){
        getInteractionsHeader().click();
    }

    public WebElement getBookStoreHeader(){
        return webDriver.findElement(bookStoreHeader);
    }

    public void clickBookStoreHeader(){
        getBookStoreHeader().click();
    }

    public WebElement getTextBox(){
        return webDriver.findElement(textBox);
    }

    public TextBoxPage clickTextBox(){
        getTextBox().click();
        return new TextBoxPage(webDriver);
    }

}
