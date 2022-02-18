// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.inputs.GetTableArgs;
import io.pulumi.azurenative.operationalinsights.outputs.GetTableResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTable {
/**
 * Workspace data table definition.
 * API Version: 2021-12-01-preview.
 * 
 *
 * Workspace data table definition.
 * 
 */
    public static CompletableFuture<GetTableResult> invokeAsync(GetTableArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:operationalinsights:getTable", TypeShape.of(GetTableResult.class), args == null ? GetTableArgs.Empty : args, Utilities.withVersion(options));
    }
}
