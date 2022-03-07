// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sqs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sqs.inputs.GetQueueArgs;
import io.pulumi.awsnative.sqs.outputs.GetQueueResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetQueue {
    private GetQueue() {}
    public interface BuilderApplicator {
        public void apply(GetQueueArgs.Builder a);
    }
    private static GetQueueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetQueueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Resource Type definition for AWS::SQS::Queue
 * 
     */
    public static CompletableFuture<GetQueueResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Resource Type definition for AWS::SQS::Queue
     * 
     */
    public static CompletableFuture<GetQueueResult> invokeAsync(GetQueueArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sqs:getQueue", TypeShape.of(GetQueueResult.class), args == null ? GetQueueArgs.Empty : args, Utilities.withVersion(options));
    }
}