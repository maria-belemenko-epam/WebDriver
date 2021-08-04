package pages.with_abstract_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BringItOn extends AbstractPage {

    @FindBy(id = "postform-text")
    protected WebElement textField;
    @FindBy(id = "postform-name")
    protected WebElement titleField;
    @FindBy(xpath = "//*[@id='w0']/div[5]/div[1]/div[8]/button")
    protected List<WebElement> pasteNote;
    @FindBy(id = "select2-postform-expiration-container")
    protected Select pasteExpiration;
    @FindBy(id = "select2-postform-format-container")
    protected Select syntaxHighlighting;

    public BringItOn(WebDriver webDriver) {
        super(webDriver);
    }


    public void bringItOn() {
        textField.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
        pasteExpiration.selectByVisibleText("10 Minutes");
        syntaxHighlighting.selectByVisibleText("Bash");
        titleField.sendKeys("how to gain dominance among developers");
        pasteNote.get(0).click();
    }


}
