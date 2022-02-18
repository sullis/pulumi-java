// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.inputs.GetFileShareArgs;
import io.pulumi.azurenative.storage.outputs.GetFileShareResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFileShare {
/**
 * Properties of the file share, including Id, resource name, resource type, Etag.
 * API Version: 2021-02-01.
 * 
 *
 * Properties of the file share, including Id, resource name, resource type, Etag.
 * 
 */
    public static CompletableFuture<GetFileShareResult> invokeAsync(GetFileShareArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storage:getFileShare", TypeShape.of(GetFileShareResult.class), args == null ? GetFileShareArgs.Empty : args, Utilities.withVersion(options));
    }
}
