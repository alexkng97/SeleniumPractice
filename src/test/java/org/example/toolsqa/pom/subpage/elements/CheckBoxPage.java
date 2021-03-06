package org.example.toolsqa.pom.subpage.elements;

import org.example.toolsqa.pom.subpage.Subpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends Subpage {
	By expandAll = By.cssSelector(".rct-icon-expand-all");
	By collapseAll = By.cssSelector(".rct-icon-collapse-all");

	public CheckBoxPage(WebDriver webDriver){
		super(webDriver);
	}

	public WebElement getExpandAll(){
		return webDriver.findElement(expandAll);
	}

	public void clickExpandAll(){
		getExpandAll().click();
	}

	public WebElement getCollapseAll(){
		return webDriver.findElement(collapseAll);
	}

	public void clickCollapseAll(){
		getCollapseAll().click();
	}

}
