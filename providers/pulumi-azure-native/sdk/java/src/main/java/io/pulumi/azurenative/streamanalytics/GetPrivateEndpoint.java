// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.streamanalytics.inputs.GetPrivateEndpointArgs;
import io.pulumi.azurenative.streamanalytics.outputs.GetPrivateEndpointResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpoint {
/**
 * Complete information about the private endpoint.
 * API Version: 2020-03-01-preview.
 * 
 *
 * Complete information about the private endpoint.
 * 
 */
    public static CompletableFuture<GetPrivateEndpointResult> invokeAsync(GetPrivateEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getPrivateEndpoint", TypeShape.of(GetPrivateEndpointResult.class), args == null ? GetPrivateEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}
