package com.github.selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchTest {

    @BeforeAll
    static void browserSetting() {
        Configuration.startMaximized = true;
    }

    @Test
    void searchSelenide() {

        //Открыть страницу Selenide в Github.com
        open("https://github.com/selenide/selenide");

        //Перейти в раздел Wiki
        $(byText("Wiki")).click();

        //Найти страницу SoftAssertions и перейти на нее
        $(byText("Soft assertions")).click();

        //Убедиться что на  странице SoftAssertions есть пример кода Junit5
        $(".markdown-body > div:nth-child(17)").shouldHave(text("@ExtendWith"));

    }
}
