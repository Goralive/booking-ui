package com.booking.ui.test;

import com.booking.api.payloads.UserPayload;
import com.booking.ui.MainPage;
import com.booking.ui.SearchPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.sizeNotEqual;

public class SearchTest extends BaseUITest {

    @Test
    public void shouldHotelTitlesPresentInSearchResults(){
        //given
        UserPayload userPayload = new UserPayload()
                .email("ihor.nosovskyi@gmail.com")
                .password("11111111");

        //when
        MainPage.open()
                .loginAs(userPayload.email(), userPayload.password())
                .closeWelcomeForm()
                .clickOnPromoPostCard();

        //then
        SearchPage searchPage = at(SearchPage.class);
        searchPage.listHotelTitle().shouldBe(sizeNotEqual(0));
    }
}
