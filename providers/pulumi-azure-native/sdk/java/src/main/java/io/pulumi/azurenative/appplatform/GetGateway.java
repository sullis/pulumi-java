// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.GetGatewayArgs;
import io.pulumi.azurenative.appplatform.outputs.GetGatewayResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGateway {
/**
 * Spring Cloud Gateway resource
 * API Version: 2022-01-01-preview.
 * 
 *
 * Spring Cloud Gateway resource
 * 
 */
    public static CompletableFuture<GetGatewayResult> invokeAsync(GetGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getGateway", TypeShape.of(GetGatewayResult.class), args == null ? GetGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
