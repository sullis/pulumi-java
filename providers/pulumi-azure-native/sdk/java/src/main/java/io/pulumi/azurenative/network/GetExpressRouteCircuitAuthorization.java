// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetExpressRouteCircuitAuthorizationArgs;
import io.pulumi.azurenative.network.outputs.GetExpressRouteCircuitAuthorizationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExpressRouteCircuitAuthorization {
/**
 * Authorization in an ExpressRouteCircuit resource.
 * API Version: 2020-11-01.
 * 
 *
 * Authorization in an ExpressRouteCircuit resource.
 * 
 */
    public static CompletableFuture<GetExpressRouteCircuitAuthorizationResult> invokeAsync(GetExpressRouteCircuitAuthorizationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getExpressRouteCircuitAuthorization", TypeShape.of(GetExpressRouteCircuitAuthorizationResult.class), args == null ? GetExpressRouteCircuitAuthorizationArgs.Empty : args, Utilities.withVersion(options));
    }
}
