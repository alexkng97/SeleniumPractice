package org.example.toolsqa.pom;

import org.example.toolsqa.pom.subpage.*;
import org.example.toolsqa.pom.subpage.elements.ElementsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {

	By elementsCategory = By.cssSelector(".card:nth-child(1) svg");
	By formsCategory = By.cssSelector(".card:nth-child(2) svg");
	By alertsCategory = By.cssSelector(".card:nth-child(3) svg");
	By widgetsCategory = By.cssSelector(".card:nth-child(4) svg");
	By interactionsCategory = By.cssSelector(".card:nth-child(5) svg");

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}

	public WebElement getElementsCategory(){
		return webDriver.findElement(elementsCategory);
	}

	public ElementsPage clickElementsCategory(){
		getElementsCategory().click();
		return new ElementsPage(webDriver);
	}

	public WebElement getFormsCategory(){
		return webDriver.findElement(formsCategory);
	}

	public FormsPage clickFormsCategory(){
		getFormsCategory().click();
		return new FormsPage(webDriver);
	}

	public WebElement getAlertsCategory(){
		return webDriver.findElement(alertsCategory);
	}

	public AlertsPage clickAlertsCategory(){
		getAlertsCategory().click();
		return new AlertsPage(webDriver);
	}

	public WebElement getWidgetsCategory(){
		return webDriver.findElement(widgetsCategory);
	}

	public WidgetsPage clickWidgetsCategory(){
		getWidgetsCategory().click();
		return new WidgetsPage(webDriver);
	}

	public WebElement getInteractionsCategory(){
		return webDriver.findElement(interactionsCategory);
	}

	public InteractionsPage clickInteractionsCategory(){
		getInteractionsCategory().click();
		return new InteractionsPage(webDriver);
	}

}
