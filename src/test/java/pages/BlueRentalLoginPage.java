package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalLoginPage {

    public BlueRentalLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "formBasicEmail")
    public static WebElement email;

    @FindBy(id = "formBasicPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "dropdown-basic-button")
    public WebElement profile;
}
