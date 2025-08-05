package org.example;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class SelenidePageObjectTest {
    @Test
    public void test () {

        // открывается страница и создаётся экземпляр класса страницы
        LoginPageMaestroSelenide loginPage =
                open("https://qa-mesto.praktikum-services.ru/",
                        LoginPageMaestroSelenide.class);

        // вход в приложение
        loginPage.login("Введи сюда email твоей учётной записи",
                "Введи сюда пароль твоей учётной записи");

    }
}
