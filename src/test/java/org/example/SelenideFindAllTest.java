package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideFindAllTest {

    @BeforeEach
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void test(){
        open("https://qa-mesto.praktikum-services.ru/");
        $(byId("email")).setValue("qwesfds123@mail.ru");
        $(byId("password")).setValue("123");
        $(byClassName("auth-form__button")).click();
        int sumBaikalCard = $$(byText("Москва")).size();
        System.out.println(sumBaikalCard);
    }
}
