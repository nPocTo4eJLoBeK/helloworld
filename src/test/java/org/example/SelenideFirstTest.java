package org.example;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class SelenideFirstTest {
    @Test
    public void test(){
        open("https://qa-mesto.praktikum-services.ru/");
        $(byId("email")).setValue("qwesfds123@mail.ru");
        $(byId("password")).setValue("123");
        $(byClassName("auth-form__button")).click();
    }
}
