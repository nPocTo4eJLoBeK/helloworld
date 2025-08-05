package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.example.LoginPageMaestro;

public class SeleniumPageObjectTest1 {
    private WebDriver driver;

    @Test
    public void test() {

        ChromeOptions options = new ChromeOptions(); //Драйвер для браузера
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // создать объект класса страницы авторизации
        LoginPageMaestro objLoginPage = new LoginPageMaestro(driver);
        // выполнить авторизацию
        objLoginPage.login("qwesfds123@mail.ru",
                "123");

    }

    @AfterEach
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
