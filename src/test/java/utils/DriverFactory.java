package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Jorge A. López
 * @project SocialMediaSignUps
 * @created 11-06-2022 - 8:15 PM
 */
public class DriverFactory {
    //TODO: Add more browsers support
    public WebDriver getDriver(String browser){
        switch (browser.toLowerCase()){
            case "chrome",default:
                System.setProperty("webdriver.chrome.driver","src/test/java/utils/drivers/chromedriver.exe");
                return new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver","src/test/java/utils/drivers/geckodriver.exe");
                return  new FirefoxDriver();
            case "edge":
                System.setProperty("webdriver.edge.driver","src/test/java/utils/drivers/msedgedriver.exe");
                return new EdgeDriver();
        }
    }
}
