package BringItOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BringItOn {
    private WebDriver webDriver = new ChromeDriver();

    @BeforeMethod(alwaysRun = true)
    public void getBrowser(){
        webDriver.get("https://pastebin.com/");
    }
    @Test
    public void bringItOn(){
        webDriver.findElement(By.id("postform-text")).sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
        webDriver.findElement(By.id("select2-postform-expiration-container"));
        WebElement textBash= webDriver.findElement(By.id("select2-postform-format-container"));
        textBash.findElement(By.xpath("/html/body/span[2]/span/span[1]/input")).sendKeys("Bash");
        webDriver.findElement(By.xpath("//*[@id='w0']/div[5]/div[1]/div[8]/button")).sendKeys("how to gain dominance among developers");
        webDriver.findElements(By.xpath("//*[@id='w0']/div[5]/div[1]/div[8]/button")).get(0).click();
    }
    @AfterMethod(enabled = false)
    public void getBrowserDown(){
        webDriver.quit();
    }
}
