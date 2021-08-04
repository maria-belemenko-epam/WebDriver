package pages.with_abstract_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BringItOn extends AbstractPage {


    public BringItOn(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(id = "select2-postform-expiration-container")
    protected Select pasteExpiration;

    public int bringItOn() {
        openPage();
        writeText(textField, "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
        selectByText(syntaxHighlighting, "Bash");
        selectByText(pasteExpiration, "10 Minutes");
        writeText(titleField, "how to gain dominance among developers");
        pasteNote.get(0).click();
        return pasteNote.size();
    }


}
