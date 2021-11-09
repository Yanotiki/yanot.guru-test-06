package io.github.qaguru.allure;

import io.github.qaguru.allure.steps.WebSteps;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersTest {

    @DisplayName("Проверка города")
    @ParameterizedTest(name = "{displayName} {0}")
    @ValueSource(strings = {"Санкт-Петербург", "Москва"})
    public void testLambda(String city) {
        Allure.parameter("Город", city);
    }

}
