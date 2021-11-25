package yanotHomeWork06;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;


public class SelenideTestLambda extends TestBase {

    @Test
    public void testGitHu() {
        step("Открываем главную страницу", () -> {
            open(URL);
        });
        step("Ищем репозиторий" + TestBase.REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий" + TestBase.REPOSITORY, () -> {
            $(linkText("DiUS/java-faker")).click();
        });
        step("Открываем таб Issues", () -> {
            $(partialLinkText("Issues")).click();
        });
        step("Проверяем что существует Issues с кол-вом " + TestBase.ISSUE_NUMBER, () -> {
            $(withText("#" + TestBase.ISSUE_NUMBER)).should(Condition.visible);
        });
    }
}
