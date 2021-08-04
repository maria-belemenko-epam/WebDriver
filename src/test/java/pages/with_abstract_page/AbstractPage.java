package pages.with_abstract_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
}
