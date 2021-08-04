package pages.with_abstract_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ICanWin extends AbstractPage {


    public ICanWin(WebDriver webDriver) {
        super(webDriver);
    }
    public int win() {
        openPage();
        writeText(textField, "Hello from WebDriver");
        Select selectPasteExpiration = new Select(webDriver.findElement(By.id("postform-expiration")));
        pasteExpiration.click();
        webDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        selectPasteExpiration.selectByValue("10M");
        writeText(titleField, "helloweb");
        pasteNote.get(0).click();
        return pasteNote.size();
    }

}
