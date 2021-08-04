package IcanWin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ICanWin {
    private WebDriver webDriver = new ChromeDriver();

    @BeforeMethod(alwaysRun = true)
    public void getBrowser(){
        webDriver.get("https://pastebin.com/");
    }
    @Test
    public void iCanWin() throws InterruptedException {
        WebElement searchTextField = webDriver.findElement(By.id("postform-text"));
        searchTextField.sendKeys("Hello from WebDriver");
        webDriver.findElement(By.id("select2-postform-expiration-container")).click();
        WebElement title = webDriver.findElement(By.id("postform-name"));
        title.sendKeys("helloweb");
        List<WebElement> writeText = webDriver.findElements(By.xpath("//*[@id='w0']/div[5]/div[1]/div[8]/button"));
        writeText.get(0).click();
        Assert.assertTrue(writeText.size()>0,"Have result");
        Thread.sleep(4000);
    }
    @AfterMethod(enabled = false)
    public void getBrowserDown(){
        webDriver.quit();
    }
}
