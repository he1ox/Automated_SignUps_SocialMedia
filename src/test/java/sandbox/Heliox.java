package sandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.facebook.FBSignUp;
import utils.DriverFactory;

import java.time.Duration;

/**
 * @author Jorge A. López
 * @project SocialMediaSignUps
 * @created 11-06-2022 - 9:35 PM
 */
public class Heliox {
    DriverFactory driverFactory;
    WebDriver driver;
    FBSignUp fbSignUpPage;

    @BeforeTest
    public void setup(){
        driverFactory = new DriverFactory();
        driver = driverFactory.getDriver("CHROME");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void FB_SignUp() throws InterruptedException {
        fbSignUpPage = new FBSignUp(driver);
        fbSignUpPage.clickCreateAccount();
        fbSignUpPage.fillSignUpForm();
    }
}
