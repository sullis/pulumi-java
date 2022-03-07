// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetHubVirtualNetworkConnectionArgs;
import io.pulumi.azurenative.network.outputs.GetHubVirtualNetworkConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHubVirtualNetworkConnection {
    private GetHubVirtualNetworkConnection() {}
    public interface BuilderApplicator {
        public void apply(GetHubVirtualNetworkConnectionArgs.Builder a);
    }
    private static GetHubVirtualNetworkConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetHubVirtualNetworkConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * HubVirtualNetworkConnection Resource.
 * API Version: 2020-11-01.
 * 
     *
     * HubVirtualNetworkConnection Resource.
 * 
     */
    public static CompletableFuture<GetHubVirtualNetworkConnectionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * HubVirtualNetworkConnection Resource.
     * API Version: 2020-11-01.
     * 
     *
         * HubVirtualNetworkConnection Resource.
     * 
     */
    public static CompletableFuture<GetHubVirtualNetworkConnectionResult> invokeAsync(GetHubVirtualNetworkConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getHubVirtualNetworkConnection", TypeShape.of(GetHubVirtualNetworkConnectionResult.class), args == null ? GetHubVirtualNetworkConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}