// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.inputs.GetDiskEncryptionSetArgs;
import io.pulumi.azurenative.compute.outputs.GetDiskEncryptionSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDiskEncryptionSet {
/**
 * disk encryption set resource.
 * API Version: 2020-12-01.
 * 
 *
 * disk encryption set resource.
 * 
 */
    public static CompletableFuture<GetDiskEncryptionSetResult> invokeAsync(GetDiskEncryptionSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getDiskEncryptionSet", TypeShape.of(GetDiskEncryptionSetResult.class), args == null ? GetDiskEncryptionSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
