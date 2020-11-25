package steps.blocks.steps;


import application.utils.ExistsAppiumMatcher;
import cucumber.api.java.ru.И;
import ru.yandex.qatools.matchers.webdriver.DisplayedMatcher;
import ru.yandex.qatools.matchers.webdriver.ExistsMatcher;
import steps.BaseSteps;

import java.util.Arrays;

import static org.hamcrest.Matchers.not;

public final class BlocksCommonStepsLibrary extends BaseSteps {


    @И("на текущей странице перейти к блоку {string}")
    public void focusOnBlock(String blockNameStr) {
        resetCurrentBlock();
        String[] blocks = blockNameStr.split(">");
        setCurrentBlockByName(blocks[0]);
        checkBlockExist();
        if (blocks.length > 1) {
            focusOnBlockInBlock(blockNameStr.substring(blockNameStr.indexOf(">") + 1));
        }
    }

    @И("на текущей странице перейти к блоку {string} - {string}")
    public void focusOnBlockWith(String blockNameStr, String param) {
        resetCurrentBlock();
        String[] blocks = blockNameStr.split(">");
        String[] params = param.split(",");
        setCurrentBlockByName(blocks[0], params);
        checkBlockExist();
        if (blocks.length > 1) {
            focusOnBlockInBlock(blockNameStr.substring(blockNameStr.indexOf(">") + 1));
        }
    }


    @И("на текущей странице перейти к блоку {string} под названием {string}")
    public void focusOnBlockWithName(String blockNameStr, String param) {
        resetCurrentBlock();
        String[] blocks = blockNameStr.split(">");
        String[] params = param.split(",");
        setCurrentBlockByName(blocks[0], params);
        checkBlockExist();
        if (blocks.length > 1) {
            focusOnBlockInBlock(blockNameStr.substring(blockNameStr.indexOf(">") + 1));
        }
    }


    @И("^в текущем блоке перейти к блоку '(.*)'$")
    public void focusOnBlockInBlock(String blockNameStr) {
        Arrays.stream(blockNameStr.split(">"))
                .forEach(blockName -> {
                    setCurrentBlockByName(blockName.trim());
                    checkBlockExist();
                });
    }


    @И("проверить что отображется блок")
    public void checkBlockVisible() {
        getCurrentBlock().should(DisplayedMatcher.displayed(), 10);
    }

    @И("проверить что на странице отображется блок {string} под названием {string}")
    public void checkBlockVisible(String blockNameStr, String param) {
        resetCurrentBlock();
        setCurrentBlockByName(blockNameStr, param);
        checkBlockVisible();
        resetCurrentBlock();
    }

    @И("проверить что блок существует")
    public void checkBlockExist() {

        for (int i = 0; i < getNumberOfScrolls(); i++) {
            try {
                getCurrentBlock().should(ExistsAppiumMatcher.exists(), 1);
                break;
            } catch (AssertionError ignored) {
                scroll(true);
            }
        }
        getCurrentBlock().should(ExistsAppiumMatcher.exists(), 10);
    }

    @И("выровнять текущий блок по центру")
    public void moveBlockToCenter() {
        int curBlockLoc = getCurrentBlock().getLocation().y;
        final int windowCenter = getDriver().manage().window().getSize().height / 2;
        if (curBlockLoc > windowCenter) {
            scroll(true);
            for (int i = 0; curBlockLoc != getCurrentBlock().getLocation().y && i < getNumberOfScrolls() - 1; i++) {
                curBlockLoc = getCurrentBlock().getLocation().y;
                if (curBlockLoc < windowCenter) {
                    return;
                }
                scroll(true);

            }

        }
    }


    @И("проверить что блок отсуствует")
    public void checkBlockNotExist() {
        getCurrentBlock().should(not(ExistsMatcher.exists()), 10);
    }
}