// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetSyncGroupArgs;
import io.pulumi.azurenative.sql.outputs.GetSyncGroupResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSyncGroup {
/**
 * An Azure SQL Database sync group.
 * API Version: 2020-11-01-preview.
 * 
 *
 * An Azure SQL Database sync group.
 * 
 */
    public static CompletableFuture<GetSyncGroupResult> invokeAsync(GetSyncGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getSyncGroup", TypeShape.of(GetSyncGroupResult.class), args == null ? GetSyncGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
