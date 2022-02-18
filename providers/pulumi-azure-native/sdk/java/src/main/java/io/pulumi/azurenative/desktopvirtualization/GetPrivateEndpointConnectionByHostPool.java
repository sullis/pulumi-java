// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.desktopvirtualization.inputs.GetPrivateEndpointConnectionByHostPoolArgs;
import io.pulumi.azurenative.desktopvirtualization.outputs.GetPrivateEndpointConnectionByHostPoolResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnectionByHostPool {
/**
 * The Private Endpoint Connection resource.
 * API Version: 2021-04-01-preview.
 * 
 *
 * The Private Endpoint Connection resource.
 * 
 */
    public static CompletableFuture<GetPrivateEndpointConnectionByHostPoolResult> invokeAsync(GetPrivateEndpointConnectionByHostPoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:desktopvirtualization:getPrivateEndpointConnectionByHostPool", TypeShape.of(GetPrivateEndpointConnectionByHostPoolResult.class), args == null ? GetPrivateEndpointConnectionByHostPoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
