// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hdinsight.inputs.GetPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.hdinsight.outputs.GetPrivateEndpointConnectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateEndpointConnection {
/**
 * The private endpoint connection.
 * API Version: 2021-06-01.
 * 
 *
 * The private endpoint connection.
 * 
 */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> invokeAsync(GetPrivateEndpointConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hdinsight:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args == null ? GetPrivateEndpointConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
