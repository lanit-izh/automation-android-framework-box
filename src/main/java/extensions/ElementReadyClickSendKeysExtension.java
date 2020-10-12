package extensions;

import io.qameta.atlas.appium.AtlasMobileElement;
import io.qameta.atlas.core.api.MethodExtension;
import io.qameta.atlas.core.internal.Configuration;
import io.qameta.atlas.core.internal.TargetMethodInvoker;
import io.qameta.atlas.core.util.MethodInfo;
import io.qameta.atlas.webdriver.AtlasWebElement;
import org.openqa.selenium.NoSuchElementException;
import ru.lanit.at.pages.element.UIElement;
import ru.lanit.at.steps.AbstractFrameworkAndroidSteps;
import utils.StyleResourceHelper;

import java.lang.reflect.Method;
import java.util.Arrays;

import static ru.yandex.qatools.matchers.webdriver.EnabledMatcher.enabled;

public class ElementReadyClickSendKeysExtension extends AbstractFrameworkAndroidSteps implements MethodExtension {
    private final String[] METHOD_NAMES = {
            "click",
            "sendKeys",
    };

    @Override
    public Object invoke(Object proxy, MethodInfo methodInfo, Configuration configuration) throws Throwable {
        UIElement atlasWebElement = (UIElement) proxy;
        int numberOfTimes = getNumberOfScrolls()-1;
        try {
            atlasWebElement.getLocation();
            return new TargetMethodInvoker().invoke(atlasWebElement, methodInfo, configuration);
        } catch (NoSuchElementException ex) {
            System.out.println(String.format("Element not available. Scrolling (%s) times...", 1));
        }

        for (int i = 0; i < numberOfTimes; i++) {
            try {
                scroll(true);
                atlasWebElement.getLocation();
                break;
            } catch (NoSuchElementException ex) {
                System.out.println(String.format("Element not available. Scrolling (%s) times...", i + 2));
            }
        }
        atlasWebElement.getLocation();
        return new TargetMethodInvoker().invoke(atlasWebElement, methodInfo, configuration);
    }

    @Override
    public boolean test(Method method) {
        return (Arrays.stream(METHOD_NAMES).
                anyMatch(s -> s.equalsIgnoreCase(method.getName()))
                && AtlasWebElement.class == method.getDeclaringClass());
    }
}
