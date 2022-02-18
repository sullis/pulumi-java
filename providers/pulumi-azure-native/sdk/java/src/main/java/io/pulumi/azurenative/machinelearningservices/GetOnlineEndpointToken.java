// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetOnlineEndpointTokenArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetOnlineEndpointTokenResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOnlineEndpointToken {
/**
 * Service Token
 * API Version: 2021-03-01-preview.
 * 
 *
 * Service Token
 * 
 */
    public static CompletableFuture<GetOnlineEndpointTokenResult> invokeAsync(GetOnlineEndpointTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getOnlineEndpointToken", TypeShape.of(GetOnlineEndpointTokenResult.class), args == null ? GetOnlineEndpointTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
