package org.example.toolsqa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

	public WebDriver webDriver;
	private String BASE_URL = "https://demoqa.com/";
	private By logo = By.cssSelector("#app > header > a > img");

	public Page(WebDriver webDriver){
		this.webDriver = webDriver;
	}

	public String getBASE_URL() {
		return BASE_URL;
	}

	public By getLogo() {
		return logo;
	}

	public void clickLogo(){
		webDriver.findElement(logo).click();
	}

	public String getURL(){
		return webDriver.getCurrentUrl();
	}
}
