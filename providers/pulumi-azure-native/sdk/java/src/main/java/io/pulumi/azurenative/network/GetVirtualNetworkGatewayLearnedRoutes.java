// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetVirtualNetworkGatewayLearnedRoutesArgs;
import io.pulumi.azurenative.network.outputs.GetVirtualNetworkGatewayLearnedRoutesResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualNetworkGatewayLearnedRoutes {
/**
 * List of virtual network gateway routes.
 * API Version: 2020-11-01.
 * 
 *
 * List of virtual network gateway routes.
 * 
 */
    public static CompletableFuture<GetVirtualNetworkGatewayLearnedRoutesResult> invokeAsync(GetVirtualNetworkGatewayLearnedRoutesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getVirtualNetworkGatewayLearnedRoutes", TypeShape.of(GetVirtualNetworkGatewayLearnedRoutesResult.class), args == null ? GetVirtualNetworkGatewayLearnedRoutesArgs.Empty : args, Utilities.withVersion(options));
    }
}
