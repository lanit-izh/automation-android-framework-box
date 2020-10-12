package pages.android.blocks;

import io.qameta.atlas.webdriver.extension.FindBy;
import pages.android_elements.Button;
import pages.android_elements.Input;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.annotations.WithName;
import ru.lanit.at.pages.block.AbstractMobileBlockElement;


@Title("Контекстный плеер")
public interface ContextVideoPlayerBlock extends AbstractMobileBlockElement {

    @WithName("Закрыть")
    @FindBy(".//*[@resource-id='com.google.android.youtube:id/floaty_close_button']")
    Button MenuButton();

    interface WithContextVideoPlayerBlock extends AbstractMobileBlockElement {
        @FindBy("//*[@resource-id='com.google.android.youtube:id/floaty_bar_controls_view']")
        ContextVideoPlayerBlock contextVideoPlayerBlock();
    }
}
