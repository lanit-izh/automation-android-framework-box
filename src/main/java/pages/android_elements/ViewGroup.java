package pages.android_elements;

import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.element.MobileUIElement;

@Title("Панель")
public interface ViewGroup extends  MobileUIElement{
    interface WithViewGroup extends MobileUIElement {
        @FindBy("//android.view.ViewGroup[contains(@content-desc,'{{ value }}')]")
        ViewGroup viewGroup(@Param("value") String value);


    }

}