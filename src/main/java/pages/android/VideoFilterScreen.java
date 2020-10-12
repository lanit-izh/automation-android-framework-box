package pages.android;

import io.qameta.atlas.webdriver.extension.FindBy;
import pages.android_elements.Button;
import pages.android_elements.DropDown;
import pages.android_elements.Input;
import ru.lanit.at.pages.AbstractScreen;
import ru.lanit.at.pages.annotations.Title;
import ru.lanit.at.pages.annotations.WithName;


@Title("Параметры фильтрации")
public interface VideoFilterScreen extends AbstractScreen {
    @WithName("Сортировать по")
    @FindBy(".//*[@text='Sort by']/following-sibling::android.widget.Spinner")
    DropDown sortByDropDown();
    @WithName("Тип")
    @FindBy(".//*[@text='Type']/following-sibling::android.widget.Spinner")
    DropDown typeDropDown();
    @WithName("Дата загрузки")
    @FindBy(".//*[@text='Upload date']/following-sibling::android.widget.Spinner")
    DropDown uploadDateDropDown();
    @WithName("Продолжительность")
    @FindBy(".//*[@text='Duration']/following-sibling::android.widget.Spinner")
    DropDown durationDropDown();

    @WithName("Применить")
    @FindBy("//*[@resource-id='com.google.android.youtube:id/apply']")
    Button applyButton();
}
