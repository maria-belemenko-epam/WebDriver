package pages.with_abstract_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class AbstractPage {
    private static final String HOMEPAGE_URL = "https://pastebin.com/";
    protected WebDriver webDriver;

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public AbstractPage openPage() {
        webDriver.get(HOMEPAGE_URL);
        return this;
    }
    public void writeText(WebElement webElement, String text){
        webElement.sendKeys(text);
    }
    public void selectByText(Select selector, String text){
        selector.selectByVisibleText(text);
    }
}
