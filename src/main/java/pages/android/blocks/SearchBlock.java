package pages.android.blocks;

import io.qameta.atlas.webdriver.extension.FindBy;
import pages.android_elements.Input;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.annotations.WithName;

import ru.lanit.at.pages.block.AbstractMobileBlockElement;


@Title("Поиск")
public interface SearchBlock extends AbstractMobileBlockElement, Input.WithInput {


    @WithName("Поиск")
    @FindBy(".//*[@resource-id='com.google.android.youtube:id/search_edit_text']")
    Input searchInput();

    interface WithSearchBlock extends AbstractMobileBlockElement {
        @FindBy("//*[@resource-id='com.google.android.youtube:id/toolbar']")
        SearchBlock searchBlock();
    }
}


