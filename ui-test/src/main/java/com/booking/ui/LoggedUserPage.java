package com.booking.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoggedUserPage {
    @Step
    public SelenideElement welcomeMessage() {
        return $("[id*='modal-name']").waitUntil(appears,7000);
    }

    @Step
    public LoggedUserPage closeWelcomeForm() {
        $("[title='Close']").waitUntil(Condition.appears,7000).click();
        return this;
    }

    @Step
    public SearchPage clickOnPromoPostCard() {
        $("div.promotion-postcard__large:nth-child(1)").click();
        return new SearchPage();
    }
}
