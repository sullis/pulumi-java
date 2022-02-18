// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetPrivateEndpointConnectionByNameArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetPrivateEndpointConnectionByNameResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnectionByName {
/**
 * The Private Endpoint Connection resource.
 * API Version: 2021-04-01-preview.
 * 
 *
 * The Private Endpoint Connection resource.
 * 
 */
    public static CompletableFuture<GetPrivateEndpointConnectionByNameResult> invokeAsync(GetPrivateEndpointConnectionByNameArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getPrivateEndpointConnectionByName", TypeShape.of(GetPrivateEndpointConnectionByNameResult.class), args == null ? GetPrivateEndpointConnectionByNameArgs.Empty : args, Utilities.withVersion(options));
    }
}
