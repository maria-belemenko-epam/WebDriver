package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BringItOnPage;

public class BringItOnTest {
    private WebDriver webDriver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        webDriver = new ChromeDriver();
    }

    @Test
    public void bringItOn() {
        int isSizeNotNull = new BringItOnPage(webDriver).bringItOn();
        Assert.assertTrue(isSizeNotNull > 0, "Size is not Null");
    }

    @AfterMethod
    public void getBrowserDown() {
        webDriver.quit();
    }
}
