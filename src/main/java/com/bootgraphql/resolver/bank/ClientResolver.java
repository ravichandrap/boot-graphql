package com.bootgraphql.resolver.bank;

import com.bootgraphql.domain.bank.BankAccount;
import com.bootgraphql.domain.bank.Client;
import graphql.GraphQLError;
import graphql.GraphqlErrorException;
import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.Executor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    private static final ExecutorService executorService =
            Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public DataFetcherResult<Client> client(BankAccount bankAccount) {
//        return Client.of(bankAccount.getId(), "ravi", "Reddy", "P");

//        throw new RuntimeException("ClientResolver RuntimeException");
//      return Client.of(UUID.randomUUID(), "Ravi", "Reddy", "P");
        return DataFetcherResult.<Client>newResult()
                .data(Client.of(UUID.randomUUID(), "Ravi", "Reddy", "P"))
                .error( new GenericGraphQLError("newResult"))
                .build();
    }

}
