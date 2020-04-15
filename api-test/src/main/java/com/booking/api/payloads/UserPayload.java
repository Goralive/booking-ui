package com.booking.api.payloads;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class UserPayload {

    private String password;

    private String email;

    @Override
    public String toString() {
        return
                "UserPayload{" +
                        "password = '" + password + '\'' +
                        ",email = '" + email + '\'' +
                        "}";
    }
}

