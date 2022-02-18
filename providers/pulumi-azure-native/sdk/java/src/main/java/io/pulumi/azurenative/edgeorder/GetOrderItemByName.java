// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.edgeorder.inputs.GetOrderItemByNameArgs;
import io.pulumi.azurenative.edgeorder.outputs.GetOrderItemByNameResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrderItemByName {
/**
 * Represents order item contract
 * API Version: 2021-12-01.
 * 
 *
 * Represents order item contract
 * 
 */
    public static CompletableFuture<GetOrderItemByNameResult> invokeAsync(GetOrderItemByNameArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:edgeorder:getOrderItemByName", TypeShape.of(GetOrderItemByNameResult.class), args == null ? GetOrderItemByNameArgs.Empty : args, Utilities.withVersion(options));
    }
}
