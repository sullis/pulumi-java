// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetProductArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetProductResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProduct {
/**
 * Product details.
 * API Version: 2020-12-01.
 * 
 *
 * Product details.
 * 
 */
    public static CompletableFuture<GetProductResult> invokeAsync(GetProductArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getProduct", TypeShape.of(GetProductResult.class), args == null ? GetProductArgs.Empty : args, Utilities.withVersion(options));
    }
}
