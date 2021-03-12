package com.bootgraphql.exceptions;

import graphql.GraphQLError;
import graphql.kickstart.execution.error.GraphQLErrorHandler;

import java.util.List;

public class ErrorHandler implements GraphQLErrorHandler {
    @Override
    public List<GraphQLError> processErrors(List<GraphQLError> errors) {
        return errors;
    }
}
