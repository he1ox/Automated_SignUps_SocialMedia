package sandbox;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.DriverFactory;

/**
 * @author Jorge A. López
 * @project SocialMediaSignUps
 * @created 11-06-2022 - 9:35 PM
 */
public class Heliox {
    @Test
    public void Draft(){
        DriverFactory driverFactory = new DriverFactory();
        WebDriver driver =  driverFactory.getDriver("CHROME");
        driver.get("https://www.facebook.com/");

    }
}
