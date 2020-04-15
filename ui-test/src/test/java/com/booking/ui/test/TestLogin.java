package com.booking.ui.test;

import com.booking.api.payloads.UserPayload;
import com.codeborne.selenide.Condition;
import com.booking.ui.LoggedUserPage;
import com.booking.ui.MainPage;
import org.testng.annotations.Test;

public class TestLogin extends BaseUITest {

    @Test
    public void shouldNewRegisterUserSeeWelcomeMessage() {
        //given
        UserPayload userPayload = new UserPayload()
                .email("ihor.nosovskyi@gmail.com")
                .password("11111111");

        //when
        MainPage.open()
                .loginAs(userPayload.email(), userPayload.password());

        //then
        LoggedUserPage loggedUserPage = at(LoggedUserPage.class);
        loggedUserPage.welcomeMessage().shouldHave(Condition.visible);
    }
}
