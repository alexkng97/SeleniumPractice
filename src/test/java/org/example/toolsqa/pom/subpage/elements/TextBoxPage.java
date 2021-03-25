package org.example.toolsqa.pom.subpage.elements;

import org.example.toolsqa.pom.subpage.Subpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends Subpage {
    By fullName = By.id("userName");
    By email = By.id("userEmail");



    public TextBoxPage(WebDriver webDriver){
        super(webDriver);
    }

    public WebElement getFullName() {
        return webDriver.findElement(fullName);
    }

    public void enterFullName(String text){
        getFullName().sendKeys(text);
    }

    public WebElement getEmail() {
        return webDriver.findElement(email);
    }

    public void enterEmail(String text){
        getEmail().sendKeys(text);
    }
}
