// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetNetworkSecurityPerimeterArgs;
import io.pulumi.azurenative.network.outputs.GetNetworkSecurityPerimeterResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetworkSecurityPerimeter {
/**
 * The Network Security Perimeter resource
 * API Version: 2021-02-01-preview.
 * 
 *
 * The Network Security Perimeter resource
 * 
 */
    public static CompletableFuture<GetNetworkSecurityPerimeterResult> invokeAsync(GetNetworkSecurityPerimeterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getNetworkSecurityPerimeter", TypeShape.of(GetNetworkSecurityPerimeterResult.class), args == null ? GetNetworkSecurityPerimeterArgs.Empty : args, Utilities.withVersion(options));
    }
}
