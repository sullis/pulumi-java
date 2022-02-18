// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetP2sVpnServerConfigurationArgs;
import io.pulumi.azurenative.network.outputs.GetP2sVpnServerConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetP2sVpnServerConfiguration {
/**
 * P2SVpnServerConfiguration Resource.
 * API Version: 2019-07-01.
 * 
 *
 * P2SVpnServerConfiguration Resource.
 * 
 */
    public static CompletableFuture<GetP2sVpnServerConfigurationResult> invokeAsync(GetP2sVpnServerConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getP2sVpnServerConfiguration", TypeShape.of(GetP2sVpnServerConfigurationResult.class), args == null ? GetP2sVpnServerConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
