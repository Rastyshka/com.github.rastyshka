package com.github.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {

    @BeforeAll
    static void browserSetting() {
        Configuration.startMaximized = true;
    }

    @Test
    void dragAndDrop() {

        //Открыть старницу "https://the-internet.herokuapp.com/drag_and_drop"
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // Поменять местами квадрат A и B
        $("#column-a").dragAndDropTo("#column-b");

        //Проверить что квадраты поменялись местами
        $("#columns div:first-child").shouldHave(Condition.text("B"));

    }
}
