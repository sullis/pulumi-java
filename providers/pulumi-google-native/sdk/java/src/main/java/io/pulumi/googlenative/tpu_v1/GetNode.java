// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.tpu_v1.inputs.GetNodeArgs;
import io.pulumi.googlenative.tpu_v1.outputs.GetNodeResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNode {
    private GetNode() {}
    public interface BuilderApplicator {
        public void apply(GetNodeArgs.Builder a);
    }
    private static GetNodeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNodeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets the details of a node.
 * 
     */
    public static CompletableFuture<GetNodeResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets the details of a node.
     * 
     */
    public static CompletableFuture<GetNodeResult> invokeAsync(GetNodeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:tpu/v1:getNode", TypeShape.of(GetNodeResult.class), args == null ? GetNodeArgs.Empty : args, Utilities.withVersion(options));
    }
}