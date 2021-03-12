package com.bootgraphql.domain.bank;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CreateBankAccount {
    String firstName;

    @Override
    public String toString() {
        return "CreateBankAccountInput{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
