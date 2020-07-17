package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FreeCrmPage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmPageTest extends TestBase {
    FreeCrmPage freeCrmPage;
    public FreeCrmPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        freeCrmPage = new FreeCrmPage();
    }

    @Test(priority = 1)
    public void freeCrmPageTitleTest() {
        String crmPageTitle = freeCrmPage.validateCRMPageTitle();
        Assert.assertEquals(crmPageTitle, "Free CRM software can boost your sales by 30%");
    }

    @Test(priority = 2)
    public void freeCrmPageLogoTest() {
        Boolean imagePresent = freeCrmPage.validateCRMImage();
        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    public void logInPageTitleTest() {
        freeCrmPage.validateLoginPageTile();
        Assert.assertTrue(driver.getPageSource().contains(driver.getTitle()));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
