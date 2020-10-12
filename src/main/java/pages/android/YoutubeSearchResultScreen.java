package pages.android;

import pages.android.blocks.ContextVideoPlayerBlock;
import pages.android.blocks.SearchParamsBlock;
import pages.android.blocks.VideoListBlock;
import ru.lanit.at.pages.AbstractScreen;
import ru.lanit.at.pages.annotations.Title;

@Title("Результаты поиска видео")
public interface YoutubeSearchResultScreen extends AbstractScreen, SearchParamsBlock.WithSearchParamsBlock, VideoListBlock.WithVideoListBlock, ContextVideoPlayerBlock.WithContextVideoPlayerBlock {
}
