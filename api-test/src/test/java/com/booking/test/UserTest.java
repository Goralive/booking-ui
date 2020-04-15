package com.booking.test;

import com.github.javafaker.Faker;
import com.booking.api.ProjectConfig;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Locale;

import static com.booking.api.conditions.Conditions.bodyField;
import static com.booking.api.conditions.Conditions.statusCode;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;

public class UserTest {

    private Faker faker;

    @BeforeClass
    public void setUp() {
        ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
        RestAssured.baseURI = config.baseUrl();
        faker = new Faker(new Locale(config.locale()));
    }
}
