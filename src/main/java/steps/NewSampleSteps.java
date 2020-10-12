package steps;

import cucumber.api.java.ru.Пусть;
import ru.lanit.at.Config;
import ru.lanit.at.exceptions.FrameworkRuntimeException;


public class NewSampleSteps extends BaseSteps {

    @Пусть("^открываем тестируемое приложение$")
    public void openApp() {
        getDriver();
    }
}
