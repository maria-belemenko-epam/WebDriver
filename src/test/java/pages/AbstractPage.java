package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public abstract class AbstractPage {
    private static final String HOMEPAGE_URL = "https://pastebin.com/";
    protected WebDriver webDriver;
    @FindBy(id = "postform-text")
    protected WebElement textField;
    @FindBy(id = "postform-name")
    protected WebElement titleField;
    @FindBy(id="w0")
    protected List<WebElement> pasteNote;
    @FindBy(id = "select2-postform-expiration-container")
    protected WebElement pasteExpiration;
    @FindBy(id = "select2-postform-format-container")
    protected Select syntaxHighlighting;

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public AbstractPage openPage() {
        webDriver.get(HOMEPAGE_URL);
        return this;
    }

    public void writeText(WebElement webElement, String text) {
        webElement.sendKeys(text);
    }

    public void selectByText(Select selector, String text) {
        selector.selectByVisibleText(text);
    }
}
