package pom.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Jorge A. López
 * @project SocialMediaSignUps
 * @created 11-06-2022 - 10:10 PM
 */
public class FBSignUp {
    WebDriver driver;
    By btnCreateAccount = By.xpath("//a[@data-testid='open-registration-form-button']");


    public FBSignUp(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Clicks on "Create new account" button, in order to sign up a new account.
     */
    public void clickCreateAccount(){
        driver.findElement(btnCreateAccount).click();
    }

}
