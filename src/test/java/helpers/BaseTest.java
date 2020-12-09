package helpers;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureListener", new AllureSelenide().screenshots(true).savePageSource(true));
    }
}

