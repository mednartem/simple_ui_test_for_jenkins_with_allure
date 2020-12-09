package tests;

import helpers.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GoogleSearchTest extends BaseTest {

    @Test
    void googleSearch() {
        String dataForSearch = "Selenide";
        step("Открыть страницу google", () -> open("https://www.google.com/"));
        step("Ввести в поиск " + dataForSearch, (step) -> {
            step.parameter("dataForSearch", dataForSearch);
            $("[name='q']").setValue("Selenide").pressEnter();
        });
        step("Проверяем, что на странице есть " + dataForSearch, (step) -> {
            step.parameter("dataForSearch", dataForSearch);
            $$("cite").findBy(text("selenide.org")).shouldBe(visible);
        });

    }

}