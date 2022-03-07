// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.batch.inputs.GetSchedulingPolicyArgs;
import io.pulumi.aws.batch.outputs.GetSchedulingPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSchedulingPolicy {
    private GetSchedulingPolicy() {}
    public interface BuilderApplicator {
        public void apply(GetSchedulingPolicyArgs.Builder a);
    }
    private static GetSchedulingPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSchedulingPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The Batch Scheduling Policy data source allows access to details of a specific Scheduling Policy within AWS Batch.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getSchedulingPolicy.
 * 
     *
     * A collection of values returned by getSchedulingPolicy.
 * 
     */
    public static CompletableFuture<GetSchedulingPolicyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The Batch Scheduling Policy data source allows access to details of a specific Scheduling Policy within AWS Batch.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getSchedulingPolicy.
     * 
     *
         * A collection of values returned by getSchedulingPolicy.
     * 
     */
    public static CompletableFuture<GetSchedulingPolicyResult> invokeAsync(GetSchedulingPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:batch/getSchedulingPolicy:getSchedulingPolicy", TypeShape.of(GetSchedulingPolicyResult.class), args == null ? GetSchedulingPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}