package application.utils;


import org.hamcrest.Factory;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.matchers.webdriver.ExistsMatcher;

public class ExistsAppiumMatcher extends ExistsMatcher {
    @Override
    protected boolean matchesSafely(WebElement element) {
        try {
            element.getLocation();
        } catch (WebDriverException e) {
            return false;
        }
        return true;
    }


    @Factory
    public static ExistsAppiumMatcher exists() {
        return new ExistsAppiumMatcher();
    }
}
