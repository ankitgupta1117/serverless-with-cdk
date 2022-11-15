package com.myorg;

import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.constructs.Construct;

public class HelloWorldLambda {

    public HelloWorldLambda(final Construct scope, final String id) {
        Function helloWorldFunction = Function.Builder.create(scope, id)
                .functionName("hello-world")
                .description("Hello World Test function")
                .code(Code.fromInline("console.log('hello')"))
                .handler("sefsfs")
                .runtime(Runtime.NODEJS_14_X)
                .build();
    }
}
