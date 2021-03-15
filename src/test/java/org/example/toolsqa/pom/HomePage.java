package org.example.toolsqa.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Page {

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}

	public WebElement getCategory(String category){
		WebElement allCategories = webDriver.findElement(By.className("category-cards"));

		String[] individualCategory = allCategories.getText().split("\n");
		int index = 0;
		for(int i = 0; i < individualCategory.length; i++){
			if(individualCategory[i].contains(category)){
				index = i + 1;
				break;
			}
		}

		WebElement selected = webDriver.findElement(By.cssSelector(".card:nth-child(" + index + ") svg" ));
		System.out.println(selected.getText());
		return selected;

	}

	public void clickCategory(String category){
		getCategory(category).click();
	}



}
