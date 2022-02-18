// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.inputs.GetSnapshotArgs;
import io.pulumi.azurenative.containerservice.outputs.GetSnapshotResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSnapshot {
/**
 * A node pool snapshot resource.
 * API Version: 2021-08-01.
 * 
 *
 * A node pool snapshot resource.
 * 
 */
    public static CompletableFuture<GetSnapshotResult> invokeAsync(GetSnapshotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerservice:getSnapshot", TypeShape.of(GetSnapshotResult.class), args == null ? GetSnapshotArgs.Empty : args, Utilities.withVersion(options));
    }
}
