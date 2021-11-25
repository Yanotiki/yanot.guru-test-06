package yanotHomeWork06;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTestListener extends TestBase {

    @Test
    @Owner("Yanotiki")
    @Feature("Проверка репозитория")
    @Story("Проверка репозитория DiUS/java-faker")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверяем вкладку ISSUE в репозитории DiUS/java-faker")

    public void testListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open(URL);
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(REPOSITORY);
        $(".header-search-input").submit();
        $(linkText(REPOSITORY)).click();
        $(partialLinkText("Issues")).click();
        $(withText("#" + TestBase.ISSUE_NUMBER)).should(Condition.visible);
    }
}

