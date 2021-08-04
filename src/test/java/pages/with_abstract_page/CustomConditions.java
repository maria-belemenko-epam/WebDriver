package pages.with_abstract_page;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CustomConditions {
    public static ExpectedCondition<Boolean> jQueryAJAXsCompleted() {
        return new ExpectedCondition<Boolean>() {
            @NullableDecl
            @Override
            public Boolean apply(WebDriver webDriver) {
                return (Boolean) ((JavascriptExecutor) webDriver)
                        .executeScript("return(window.jQuery != null) && (jQuery.active == = 0); ");
            }
        };
    }
}
