package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class YandexSearchTest extends BaseTest {

    @Test
    @DisplayName("Successfully search Selenide to yandex")
    void yandexTest() {
        String dataForSearch = "Selenide";
        step("Открыть страницу yandex", () -> open("https://yandex.ru/"));
        step("Ввести в поиск " + dataForSearch, (step) -> {
            step.parameter("dataForSearch", dataForSearch);
            $("#text").val("Selenium").pressEnter();
        });
        step("Проверяем, что на странице есть " + dataForSearch, (step) -> {
            step.parameter("dataForSearch", dataForSearch);
            $("body").shouldHave(text("selenium.dev"));
        });


    }
}
