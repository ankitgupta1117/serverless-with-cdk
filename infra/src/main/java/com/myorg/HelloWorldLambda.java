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
                .code(Code.fromAsset("../lambdas/hello-world/out/hello-world-linux-amd64.zip"))
                .handler("hello-world")
                .runtime(Runtime.GO_1_X)
                .build();
    }
}
