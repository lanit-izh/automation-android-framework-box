package pages.android.blocks;

import io.qameta.atlas.webdriver.extension.FindBy;
import pages.android_elements.Button;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.annotations.WithName;

import ru.lanit.at.pages.block.AbstractMobileBlockElement;


@Title("Youtube")
public interface YoutubeBlock extends AbstractMobileBlockElement, Button.WithButton {

    @WithName("Найти")
    @FindBy("//*[@resource-id='com.google.android.youtube:id/menu_item_1']")
    Button findButton();

    interface WithYoutubeBlock extends AbstractMobileBlockElement {
        @FindBy("//*[@resource-id='com.google.android.youtube:id/toolbar']")
        YoutubeBlock youtubeBlock();
    }
}
