// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetGatewayHostnameConfigurationArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetGatewayHostnameConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGatewayHostnameConfiguration {
/**
 * Gateway hostname configuration details.
 * API Version: 2020-12-01.
 * 
 *
 * Gateway hostname configuration details.
 * 
 */
    public static CompletableFuture<GetGatewayHostnameConfigurationResult> invokeAsync(GetGatewayHostnameConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getGatewayHostnameConfiguration", TypeShape.of(GetGatewayHostnameConfigurationResult.class), args == null ? GetGatewayHostnameConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
