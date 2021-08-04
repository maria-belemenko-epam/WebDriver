package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.with_abstract_page.ICanWin;

public class ICanWinTest {
    private WebDriver webDriver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() throws InterruptedException {
        webDriver = new ChromeDriver();
    }

    @Test
    public void iCanWinTest() {
        int isSizeNotNull = new ICanWin(webDriver).win();
        Assert.assertTrue(isSizeNotNull > 0, "Size is not Null");
    }

    @AfterMethod
    public void browserClose() {
        webDriver.quit();
    }
}
