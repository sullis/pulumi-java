// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.GetReplicationArgs;
import io.pulumi.azurenative.containerregistry.outputs.GetReplicationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReplication {
/**
 * An object that represents a replication for a container registry.
 * API Version: 2019-05-01.
 * 
 *
 * An object that represents a replication for a container registry.
 * 
 */
    public static CompletableFuture<GetReplicationResult> invokeAsync(GetReplicationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getReplication", TypeShape.of(GetReplicationResult.class), args == null ? GetReplicationArgs.Empty : args, Utilities.withVersion(options));
    }
}
