package com.bootgraphql.domain.bank;

import lombok.*;

import java.util.UUID;

@Builder
@Value
public class Client {
    UUID id;
    String firstName;
    String middleName;
    String lastName;
    public Client(){}

    public static Client of(UUID id, String firstName, String middleName, String lastName) {
        return new Client(id, firstName, middleName, lastName);
    }
    public Client(UUID id, String firstName, String middleName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
