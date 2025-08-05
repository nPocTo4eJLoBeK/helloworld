package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumPageObjectExTest {
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
        HomePage homePage = new HomePage(driver);
        homePage.waitLoading();
        String activity = homePage.getActivity();
        System.out.println(activity);
    }

    @AfterEach
    public void teardown() {
        // Закрыть браузер
        driver.quit();
    }
}
