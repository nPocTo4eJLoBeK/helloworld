package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class SelenideFindTest {

    @BeforeEach
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void test(){
        open("https://qa-mesto.praktikum-services.ru/");
        $(byClassName("header__auth-link")).click();
        $(byClassName("auth-form__textfield")).val("myuser@example.com");
        $(byId("password")).val("123456");
        $(byClassName("auth-form__button")).click();
    }
}
