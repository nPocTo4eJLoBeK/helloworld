package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumGetTextTest {
    WebDriver driver;

    @BeforeEach
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void test(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--headless", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.get("https://qa-mesto.praktikum-services.ru/");
        driver.findElement(By.xpath(".//input[@id = 'email']")).sendKeys("qwesfds123@mail.ru");
        driver.findElement(By.xpath(".//input[@id = 'password']")).sendKeys("123");
        driver.findElement(By.xpath(".//button[@class = 'auth-form__button']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.className("header__logout")));
        String textButtonExit = driver.findElement(By.className("header__logout")).getText();
        System.out.println(textButtonExit);

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
