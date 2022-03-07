// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.GetAgentPoolArgs;
import io.pulumi.azurenative.containerregistry.outputs.GetAgentPoolResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
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
     * The agentpool that has the ARM resource and properties.
 * The agentpool will have all information to create an agent pool.
 * API Version: 2019-06-01-preview.
 * 
     *
     * The agentpool that has the ARM resource and properties.
 * The agentpool will have all information to create an agent pool.
 * 
     */
    public static CompletableFuture<GetAgentPoolResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The agentpool that has the ARM resource and properties.
     * The agentpool will have all information to create an agent pool.
     * API Version: 2019-06-01-preview.
     * 
     *
         * The agentpool that has the ARM resource and properties.
     * The agentpool will have all information to create an agent pool.
     * 
     */
    public static CompletableFuture<GetAgentPoolResult> invokeAsync(GetAgentPoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getAgentPool", TypeShape.of(GetAgentPoolResult.class), args == null ? GetAgentPoolArgs.Empty : args, Utilities.withVersion(options));
    }
}