package pages.android.blocks;

import io.qameta.atlas.webdriver.extension.FindBy;
import pages.android_elements.Button;
import pages.android_elements.Input;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.annotations.WithName;
import ru.lanit.at.pages.block.AbstractMobileBlockElement;

@Title("Параметры поиска")
public interface SearchParamsBlock extends AbstractMobileBlockElement {
    @WithName("Параметры поиска")
    @FindBy(".//*[@resource-id='com.google.android.youtube:id/menu_filter_results']")
    Button MenuButton();

    @WithName("Поиск")
    @FindBy(".//*[@resource-id='com.google.android.youtube:id/search_edit_text']")
    Input searchInput();

    interface WithSearchParamsBlock extends AbstractMobileBlockElement {
        @FindBy("//*[@resource-id='com.google.android.youtube:id/toolbar']")
        SearchParamsBlock searchParamsBlock();
    }
}
