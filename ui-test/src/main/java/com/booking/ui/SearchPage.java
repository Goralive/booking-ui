package com.booking.ui;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    public ElementsCollection listHotelTitle() {
        return $$("h3.sr-hotel__title");
    }
}
