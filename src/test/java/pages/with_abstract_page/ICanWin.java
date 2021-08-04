package pages.with_abstract_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ICanWin extends AbstractPage {

    @FindBy(id = "postform-text")
    protected WebElement textField;
    @FindBy(id = "postform-name")
    protected WebElement titleField;
    @FindBy(xpath = "//*[@id='w0']/div[5]/div[1]/div[8]/button")
    protected List<WebElement> pasteNote;
    @FindBy(id = "select2-postform-expiration-container")
    protected Select pasteExpiration;

    public ICanWin(WebDriver webDriver) {
        super(webDriver);
    }

    public int win() {
        writeText(textField,"Hello from WebDriver");
        selectByText(pasteExpiration,"10 Minutes");
        writeText(titleField,"helloweb");
        pasteNote.get(0).click();
        return pasteNote.size();
    }
    public void writeText(WebElement webElement, String text){
        webElement.sendKeys(text);
    }
    public void selectByText(Select selector,String text){
        selector.selectByVisibleText(text);
    }

}
