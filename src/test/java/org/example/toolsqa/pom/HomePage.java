package org.example.toolsqa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

	public void clickElementsCategory(){
		getElementsCategory().click();
	}

	public WebElement getFormsCategory(){
		return webDriver.findElement(formsCategory);
	}

	public void clickFormsCategory(){
		getFormsCategory().click();
	}

	public WebElement getAlertsCategory(){
		return webDriver.findElement(alertsCategory);
	}

	public void clickAlertsCategory(){
		getAlertsCategory().click();
	}

	public WebElement getWidgetsCategory(){
		return webDriver.findElement(widgetsCategory);
	}

	public void clickWidgetsCategory(){
		getWidgetsCategory().click();
	}

	public WebElement getInteractionsCategory(){
		return webDriver.findElement(interactionsCategory);
	}

	public void clickInteractionsCategory(){
		getInteractionsCategory().click();
	}

}
