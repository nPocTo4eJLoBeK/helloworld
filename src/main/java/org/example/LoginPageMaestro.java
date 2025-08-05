package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageMaestro {
    private WebDriver driver;
    private By emailField = By.xpath(".//input[@id = 'email']");
    private By passwordField = By.xpath(".//input[@id = 'password']");
    private By buttonAuth = By.xpath(".//button[@class = 'auth-form__button']");

    public LoginPageMaestro(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(emailField).sendKeys(username);
    }
    //метод заполненяет поля ввода пароля
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    //метод кликает по кнопке авторизации
    public void clickSignInButton() {
        driver.findElement(buttonAuth).click();
    }
    //метод авторизации в приложении: объединяет ввод email, пароля и клик по кнопке
    public void login(String username, String password){
        setUsername(username);
        setPassword(password);
        clickSignInButton();
    }
}
