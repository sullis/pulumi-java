// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.connect.inputs.GetContactFlowArgs;
import io.pulumi.aws.connect.outputs.GetContactFlowResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContactFlow {
    private GetContactFlow() {}
    public interface BuilderApplicator {
        public void apply(GetContactFlowArgs.Builder a);
    }
    private static GetContactFlowArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetContactFlowArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Provides details about a specific Amazon Connect Contact Flow.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getContactFlow.
 * 
     *
     * A collection of values returned by getContactFlow.
 * 
     */
    public static CompletableFuture<GetContactFlowResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Provides details about a specific Amazon Connect Contact Flow.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getContactFlow.
     * 
     *
         * A collection of values returned by getContactFlow.
     * 
     */
    public static CompletableFuture<GetContactFlowResult> invokeAsync(GetContactFlowArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getContactFlow:getContactFlow", TypeShape.of(GetContactFlowResult.class), args == null ? GetContactFlowArgs.Empty : args, Utilities.withVersion(options));
    }
}