package yanotHomeWork06.step;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import yanotHomeWork06.TestBase;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps extends TestBase {

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open(URL);
    }

    @Step("Ищем репозиторий {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();

    }

    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText("DiUS/java-faker")).click();
    }

    @Step("Открываем таб Issues")
    public void openIssueTab() {
        $(partialLinkText("Issues")).click();

    }

    @Step("Проверяем что существует Issues с кол-вом {number}")
    public void shouldNotSeeIssueWithNumber(int number) {
        $(withText("#" + TestBase.ISSUE_NUMBER)).should(Condition.visible);

    }
}
