package com.bootgraphql.domain.bank;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Value
@Builder
@Setter
@Getter
public class CreateBankAccount {
    String firstName;

    @Override
    public String toString() {
        return "CreateBankAccountInput{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
