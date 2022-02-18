// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.inputs.GetReplicationProtectedItemArgs;
import io.pulumi.azurenative.recoveryservices.outputs.GetReplicationProtectedItemResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReplicationProtectedItem {
/**
 * Replication protected item.
 * API Version: 2018-07-10.
 * 
 *
 * Replication protected item.
 * 
 */
    public static CompletableFuture<GetReplicationProtectedItemResult> invokeAsync(GetReplicationProtectedItemArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:recoveryservices:getReplicationProtectedItem", TypeShape.of(GetReplicationProtectedItemResult.class), args == null ? GetReplicationProtectedItemArgs.Empty : args, Utilities.withVersion(options));
    }
}
