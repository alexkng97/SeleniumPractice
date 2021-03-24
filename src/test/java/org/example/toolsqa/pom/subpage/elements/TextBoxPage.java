package org.example.toolsqa.pom.subpage.elements;

import org.example.toolsqa.pom.subpage.Subpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends Subpage {
    By fullNameField = By.id("userName");


    public TextBoxPage(WebDriver webDriver){
        super(webDriver);
    }

    public WebElement getFullNameField() {
        return webDriver.findElement(fullNameField);
    }

    public void enterFullNameField(String text){
        getFullNameField().sendKeys(text);
    }
}
