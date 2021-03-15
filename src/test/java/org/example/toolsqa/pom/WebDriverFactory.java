package org.example.toolsqa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {

    public static WebDriver getWebDriver(String browser, boolean headless) {
        WebDriver webDriver = null;

        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                if(headless){
                    chromeOptions.addArguments("headless");
                }
                webDriver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                FirefoxOptions options = new FirefoxOptions();
                if(headless) {
                    options.addArguments("--headless");
                }
                webDriver = new FirefoxDriver(options);

                break;
            default:
                System.out.println("Invalid browser type");
        }
        return webDriver;
    }

}


