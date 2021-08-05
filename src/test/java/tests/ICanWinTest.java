package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ICanWinPage;

public class ICanWinTest {
    private WebDriver webDriver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        webDriver = new ChromeDriver();

    }

    @Test
    public void iCanWinTest() {
        int isSizeNotNull = new ICanWinPage(webDriver).win();
        Assert.assertTrue(isSizeNotNull > 0, "Size is not Null");
    }

    @AfterMethod(enabled = false)
    public void browserClose() {
        webDriver.quit();
    }
}
