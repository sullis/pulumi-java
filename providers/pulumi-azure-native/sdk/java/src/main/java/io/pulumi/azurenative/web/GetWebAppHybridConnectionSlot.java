// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetWebAppHybridConnectionSlotArgs;
import io.pulumi.azurenative.web.outputs.GetWebAppHybridConnectionSlotResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebAppHybridConnectionSlot {
/**
 * Hybrid Connection contract. This is used to configure a Hybrid Connection.
 * API Version: 2020-12-01.
 * 
 *
 * Hybrid Connection contract. This is used to configure a Hybrid Connection.
 * 
 */
    public static CompletableFuture<GetWebAppHybridConnectionSlotResult> invokeAsync(GetWebAppHybridConnectionSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getWebAppHybridConnectionSlot", TypeShape.of(GetWebAppHybridConnectionSlotResult.class), args == null ? GetWebAppHybridConnectionSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}
