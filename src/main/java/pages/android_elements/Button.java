package pages.android_elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.element.MobileUIElement;



@Title("Кнопка")
public interface Button extends MobileUIElement, Text.WithText {


    interface WithButton extends MobileUIElement {
        @FindBy(".//android.widget.Button")
        Button button();

    }
}
