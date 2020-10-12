package pages.android_elements;


import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.element.MobileUIElement;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Title("Поле ввода")
public interface Input extends MobileUIElement {


    default void sendKeys(LocalDate localDate) {
        sendKeys(localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }

    interface WithInput extends MobileUIElement {
        @FindBy(".//android.widget.EditText")
        Input input();

        @FindBy(".//android.widget.EditText[contains(@text,'Maydan18rus@gmail.com')]")
        Input input(@Param("name") String name);
    }
}
