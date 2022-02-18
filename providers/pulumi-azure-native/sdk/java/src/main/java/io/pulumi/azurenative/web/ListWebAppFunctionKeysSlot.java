// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppFunctionKeysSlotArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppFunctionKeysSlotResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppFunctionKeysSlot {
/**
 * String dictionary resource.
 * API Version: 2020-12-01.
 * 
 *
 * String dictionary resource.
 * 
 */
    public static CompletableFuture<ListWebAppFunctionKeysSlotResult> invokeAsync(ListWebAppFunctionKeysSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppFunctionKeysSlot", TypeShape.of(ListWebAppFunctionKeysSlotResult.class), args == null ? ListWebAppFunctionKeysSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}
