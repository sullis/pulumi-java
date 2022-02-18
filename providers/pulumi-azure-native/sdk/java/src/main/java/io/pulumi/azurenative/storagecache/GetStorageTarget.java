// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagecache.inputs.GetStorageTargetArgs;
import io.pulumi.azurenative.storagecache.outputs.GetStorageTargetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStorageTarget {
/**
 * Type of the Storage Target.
 * API Version: 2021-03-01.
 * 
 *
 * Type of the Storage Target.
 * 
 */
    public static CompletableFuture<GetStorageTargetResult> invokeAsync(GetStorageTargetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storagecache:getStorageTarget", TypeShape.of(GetStorageTargetResult.class), args == null ? GetStorageTargetArgs.Empty : args, Utilities.withVersion(options));
    }
}
