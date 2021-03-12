package com.bootgraphql.resolver;

import com.bootgraphql.domain.bank.BankAccount;
import com.bootgraphql.domain.bank.Client;
import com.bootgraphql.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
        //log.info("Retrieving bank account details for :{}", id);

        return BankAccount.of(id,
                Client.of(id, "ravi", "Reddy", "P"),
                Currency.INR);
    }
}
