package com.booking.ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static MainPage open() {
        Selenide.open("");
        return new MainPage();
    }

    @Step
    public LoggedUserPage loginAs(String email, String password) {
        SelenideElement signInBtn = $("[type='submit']");

        $("#current_account span").click();
        $("input#username").setValue(email);
        signInBtn.click();
        $("input#password").setValue(password);
        signInBtn.click();
        return new LoggedUserPage();
    }
}
