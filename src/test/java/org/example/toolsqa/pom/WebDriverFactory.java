package org.example.toolsqa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getWebDriver(String browser) {
        WebDriver webDriver = null;

        switch (browser) {
            case "chrome":
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                webDriver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser type");
        }
        return webDriver;
    }

}


