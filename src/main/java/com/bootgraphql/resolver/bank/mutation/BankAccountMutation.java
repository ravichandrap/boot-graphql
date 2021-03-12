package com.bootgraphql.resolver.bank.mutation;

import com.bootgraphql.domain.bank.BankAccount;
import com.bootgraphql.domain.bank.CreateBankAccount;
import com.bootgraphql.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BankAccountMutation implements GraphQLMutationResolver {

    public BankAccount createBankAccount(CreateBankAccount input) {
        System.out.println(input.toString());
        return BankAccount.of(UUID.randomUUID(), Currency.INR);
    }
}
