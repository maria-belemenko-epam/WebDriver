package pages.with_abstract_page;

import org.openqa.selenium.WebDriver;

public class BringItOn extends AbstractPage {


    public BringItOn(WebDriver webDriver) {
        super(webDriver);
    }


    public int bringItOn() {
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
