package io.github.qaguru.allure;

import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    @Owner("eroshenkoam")
    @Feature("Авторизация")
    @Story("Авторизация через Email")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Мой самый любимый тест")
    @Link(name = "GitHub", url = "https://github.com")
    public void testAnnotated() {
    }

    @Test
    public void testLambda() {
        Allure.getLifecycle().updateTestCase(testCase -> {
            testCase.setName("Мой любимый тест");
        });
        Allure.label("owner", "eroshenkoam");
        Allure.feature("Авторизация");
        Allure.story("Авторизация через Email");
        Allure.label("severity", "BLOCKER");
        Allure.link("GitHub", "https://github.com");
    }

}
