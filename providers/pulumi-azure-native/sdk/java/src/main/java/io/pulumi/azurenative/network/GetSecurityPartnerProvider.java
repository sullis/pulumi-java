// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetSecurityPartnerProviderArgs;
import io.pulumi.azurenative.network.outputs.GetSecurityPartnerProviderResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecurityPartnerProvider {
/**
 * Security Partner Provider resource.
 * API Version: 2020-11-01.
 * 
 *
 * Security Partner Provider resource.
 * 
 */
    public static CompletableFuture<GetSecurityPartnerProviderResult> invokeAsync(GetSecurityPartnerProviderArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getSecurityPartnerProvider", TypeShape.of(GetSecurityPartnerProviderResult.class), args == null ? GetSecurityPartnerProviderArgs.Empty : args, Utilities.withVersion(options));
    }
}
