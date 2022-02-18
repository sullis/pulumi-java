// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurestack.inputs.ListProductDetailsArgs;
import io.pulumi.azurenative.azurestack.outputs.ListProductDetailsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListProductDetails {
/**
 * Extended description about the product required for installing it into Azure Stack.
 * API Version: 2017-06-01.
 * 
 *
 * Extended description about the product required for installing it into Azure Stack.
 * 
 */
    public static CompletableFuture<ListProductDetailsResult> invokeAsync(ListProductDetailsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestack:listProductDetails", TypeShape.of(ListProductDetailsResult.class), args == null ? ListProductDetailsArgs.Empty : args, Utilities.withVersion(options));
    }
}
