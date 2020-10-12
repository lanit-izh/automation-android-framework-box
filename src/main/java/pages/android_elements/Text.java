package pages.android_elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.element.MobileUIElement;
import ru.lanit.at.pages.element.UIElement;

@Title("Элемент с текстом")
public interface Text extends MobileUIElement {


    interface WithText extends MobileUIElement {
        @FindBy(".//android.widget.TextView[contains(@text,'{{ name }}')]")
        Text text(@Param("name") String name);
    }
}
