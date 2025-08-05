package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private By activity = By.className("profile__description");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void waitLoading(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(f ->{
            return driver.findElement(activity).isDisplayed();
        });
    }

    public String getActivity(){
        return driver.findElement(activity).getText();
    }



}
