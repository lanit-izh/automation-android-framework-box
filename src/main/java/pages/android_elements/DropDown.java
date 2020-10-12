package pages.android_elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import org.openqa.selenium.By;
import ru.lanit.at.context.Context;
import ru.lanit.at.driver.DriverManager;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.element.MobileUIElement;
import ru.lanit.at.pages.element.UIElement;

@Title("Выпадающий список")
public interface DropDown extends MobileUIElement {

    default void selectByValue(String value) {
        this.click();
        Context.getInstance().getBean(DriverManager.class).getDriver().findElement(By.xpath("//*[contains(@text,'"+value+"')]")).click();
    }

    default void selectByIndex(int index) {
        this.sendKeys();
    }

    default String getSelectedInDropdownValue() {
        return getText();
    }


    interface WithDropDown extends MobileUIElement {
        @FindBy(".//android.widget.Spinner")
        DropDown dropDown();
    }
}
