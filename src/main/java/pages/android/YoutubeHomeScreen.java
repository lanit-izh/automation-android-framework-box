package pages.android;

import io.qameta.atlas.webdriver.extension.FindBy;
import pages.android.blocks.YoutubeBlock;
import pages.android_elements.ViewGroup;
import ru.lanit.at.pages.AbstractScreen;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.annotations.WithName;


@Title("Home")
public interface YoutubeHomeScreen extends AbstractScreen, YoutubeBlock.WithYoutubeBlock {


}
