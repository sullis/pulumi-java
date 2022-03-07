// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetAutoscalerArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetAutoscalerResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAutoscaler {
    private GetAutoscaler() {}
    public interface BuilderApplicator {
        public void apply(GetAutoscalerArgs.Builder a);
    }
    private static GetAutoscalerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAutoscalerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified autoscaler resource. Gets a list of available autoscalers by making a list() request.
 * 
     */
    public static CompletableFuture<GetAutoscalerResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified autoscaler resource. Gets a list of available autoscalers by making a list() request.
     * 
     */
    public static CompletableFuture<GetAutoscalerResult> invokeAsync(GetAutoscalerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getAutoscaler", TypeShape.of(GetAutoscalerResult.class), args == null ? GetAutoscalerArgs.Empty : args, Utilities.withVersion(options));
    }
}