package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.constructs.Construct;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class HelloWorldStack extends Stack {
    public HelloWorldStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public HelloWorldStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);
        new HelloWorldLambda(this,"hello-world-fn");
        // The code that defines your stack goes here

        // example resource
        // final Queue queue = Queue.Builder.create(this, "HelloWorldQueue")
        //         .visibilityTimeout(Duration.seconds(300))
        //         .build();
    }
}
