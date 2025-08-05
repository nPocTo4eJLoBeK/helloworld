package org.example;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideExactThatTest {
    @Test
    public void test(){
        open("https://qa-mesto.praktikum-services.ru/");
        $(byClassName("auth-form__button")).shouldHave(exactText("Войти"));
    }
}
