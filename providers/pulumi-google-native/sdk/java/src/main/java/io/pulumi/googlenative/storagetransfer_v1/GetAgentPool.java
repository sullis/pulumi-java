// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storagetransfer_v1.inputs.GetAgentPoolArgs;
import io.pulumi.googlenative.storagetransfer_v1.outputs.GetAgentPoolResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAgentPool {
    private GetAgentPool() {}
    public interface BuilderApplicator {
        public void apply(GetAgentPoolArgs.Builder a);
    }
    private static GetAgentPoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetAgentPoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets an agent pool.
 * 
     */
    public static CompletableFuture<GetAgentPoolResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets an agent pool.
     * 
     */
    public static CompletableFuture<GetAgentPoolResult> invokeAsync(GetAgentPoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storagetransfer/v1:getAgentPool", TypeShape.of(GetAgentPoolResult.class), args == null ? GetAgentPoolArgs.Empty : args, Utilities.withVersion(options));
    }
}