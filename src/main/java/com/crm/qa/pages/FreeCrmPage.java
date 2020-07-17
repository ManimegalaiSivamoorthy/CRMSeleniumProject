package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class FreeCrmPage extends TestBase {
    public FreeCrmPage() {
        PageFactory.initElements(driver, this);
    }

    //object in the freeCrm Page

    @FindBy(xpath = "//a[contains(text(), \"Log In\")]")
    @CacheLookup
    WebElement logIn;

    @FindBy(xpath = "//img[@class = \"img-responsive\" and @alt = \"Cogmento Free CRM\"]")
    @CacheLookup
    WebElement logo;

    public String validateCRMPageTitle() {
        return driver.getTitle();
    }

    public Boolean validateCRMImage() {
        return logo.isDisplayed();
    }

    public void validateLoginPageTile() {
        Actions actions = new Actions(driver);
        actions.moveToElement(logIn).click().build().perform();
       // return new LoginPage();
    }
}
