// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridconnectivity;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridconnectivity.inputs.ListEndpointCredentialsArgs;
import io.pulumi.azurenative.hybridconnectivity.outputs.ListEndpointCredentialsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListEndpointCredentials {
/**
 * The endpoint access for the target resource.
 * API Version: 2021-10-06-preview.
 * 
 *
 * The endpoint access for the target resource.
 * 
 */
    public static CompletableFuture<ListEndpointCredentialsResult> invokeAsync(ListEndpointCredentialsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridconnectivity:listEndpointCredentials", TypeShape.of(ListEndpointCredentialsResult.class), args == null ? ListEndpointCredentialsArgs.Empty : args, Utilities.withVersion(options));
    }
}
