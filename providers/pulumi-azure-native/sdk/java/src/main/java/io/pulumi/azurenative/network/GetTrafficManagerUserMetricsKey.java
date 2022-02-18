// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetTrafficManagerUserMetricsKeyArgs;
import io.pulumi.azurenative.network.outputs.GetTrafficManagerUserMetricsKeyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTrafficManagerUserMetricsKey {
/**
 * Class representing Traffic Manager User Metrics.
 * API Version: 2018-08-01.
 * 
 *
 * Class representing Traffic Manager User Metrics.
 * 
 */
    public static CompletableFuture<GetTrafficManagerUserMetricsKeyResult> invokeAsync(@Nullable GetTrafficManagerUserMetricsKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getTrafficManagerUserMetricsKey", TypeShape.of(GetTrafficManagerUserMetricsKeyResult.class), args == null ? GetTrafficManagerUserMetricsKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
