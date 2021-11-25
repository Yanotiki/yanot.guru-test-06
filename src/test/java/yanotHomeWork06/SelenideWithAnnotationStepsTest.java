package yanotHomeWork06;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import yanotHomeWork06.TestBase;
import yanotHomeWork06.step.WebSteps;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;


public class SelenideWithAnnotationStepsTest extends TestBase {

    private WebSteps webSteps = new WebSteps();

    @Test
    public void testGitHu() {
        webSteps.openMainPage();
        webSteps.searchForRepository(REPOSITORY);
        webSteps.goToRepository(REPOSITORY);
        webSteps.openIssueTab();
        webSteps.shouldNotSeeIssueWithNumber(ISSUE_NUMBER);
    }
}
