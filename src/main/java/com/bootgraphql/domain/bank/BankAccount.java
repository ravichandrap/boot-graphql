package com.bootgraphql.domain.bank;

import lombok.*;

import java.util.UUID;

@Builder
@Value
public class BankAccount {
    UUID id;
    Client client;
    Currency currency;
    public BankAccount() { }

    BankAccount(UUID id, Client client, Currency currency) {
        this.id = id;
        this.client = client;
        this.currency = currency;
    }
    BankAccount(UUID id, Currency currency) {
        this.id = id;
        this.currency = currency;
    }
    public static BankAccount of(UUID id, Client client, Currency currency) {
        return new BankAccount(id, client, currency);
    }
    public static BankAccount of(UUID id, Currency currency) {
        return new BankAccount(id, currency);
    }
}
