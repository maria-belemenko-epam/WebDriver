package pages.with_abstract_page;

import org.openqa.selenium.WebDriver;

public class ICanWin extends AbstractPage {


    public ICanWin(WebDriver webDriver) {
        super(webDriver);
    }

    public int win() {
        writeText(textField, "Hello from WebDriver");
        selectByText(pasteExpiration, "10 Minutes");
        writeText(titleField, "helloweb");
        pasteNote.get(0).click();
        return pasteNote.size();
    }

}
