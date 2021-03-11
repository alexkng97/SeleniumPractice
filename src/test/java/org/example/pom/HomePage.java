package org.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Page{

	List<WebElement> cards = new ArrayList<>();

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

		WebElement selected = allCategories.findElement(By.cssSelector("div:nth-child(" + index + ")" ));
		System.out.println(selected.getText());
		return selected;

	}



}
