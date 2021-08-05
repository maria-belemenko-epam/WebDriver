package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ICanWinPage extends AbstractPage {


    public ICanWinPage(WebDriver webDriver) {
        super(webDriver);
    }

    public int win() {
        openPage();
        webDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        writeText(textField, "Hello from WebDriver");
        pasteExpiration.click();
        WebElement nameInputField = webDriver.findElement(By.xpath("//*[@id='postform-expiration']//*[@value='10M']"));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", nameInputField);
//        Select selectPasteExpiration = new Select(webDriver.findElement(By.xpath("//*[@id='postform-expiration']")));
//        selectPasteExpiration.selectByIndex(2);
        writeText(titleField, "helloweb");
        pasteNote.get(0).click();
        return pasteNote.size();
    }

}
