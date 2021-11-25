package yanotHomeWork06;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;

public class TestBase {
    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "1900x1200";
    }

    public static final String URL = "https://github.com";
    public static final String REPOSITORY = "DiUS/java-faker";
    public static final Integer ISSUE_NUMBER = 67;
}
