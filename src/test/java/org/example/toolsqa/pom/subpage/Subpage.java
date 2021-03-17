package org.example.toolsqa.pom.subpage;

import org.example.toolsqa.pom.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Subpage extends Page {
    By elements = By.cssSelector(".element-group:nth-child(1) .header-wrapper");
    By forms = By.cssSelector(".element-group:nth-child(2) .header-wrapper");

    public Subpage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getElements(){
        return webDriver.findElement(elements);
    }

    public void clickElements(){
        getElements().click();
    }

    public WebElement getForms(){
        return webDriver.findElement(forms);
    }

    public void clickForms(){
        getForms().click();
    }


}
