package pages.android.blocks;

import io.qameta.atlas.webdriver.extension.FindBy;
import pages.android_elements.ViewGroup;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.block.AbstractMobileBlockElement;


@Title("Лист с видео")
public interface VideoListBlock extends AbstractMobileBlockElement,ViewGroup.WithViewGroup {

    interface WithVideoListBlock extends AbstractMobileBlockElement {
        @FindBy("//*[@resource-id='com.google.android.youtube:id/results']")
        VideoListBlock videoListBlock();
    }

}
