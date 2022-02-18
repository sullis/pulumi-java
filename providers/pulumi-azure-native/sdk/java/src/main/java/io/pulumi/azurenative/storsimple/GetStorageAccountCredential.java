// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.inputs.GetStorageAccountCredentialArgs;
import io.pulumi.azurenative.storsimple.outputs.GetStorageAccountCredentialResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStorageAccountCredential {
/**
 * The storage account credential.
 * API Version: 2017-06-01.
 * 
 *
 * The storage account credential.
 * 
 */
    public static CompletableFuture<GetStorageAccountCredentialResult> invokeAsync(GetStorageAccountCredentialArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storsimple:getStorageAccountCredential", TypeShape.of(GetStorageAccountCredentialResult.class), args == null ? GetStorageAccountCredentialArgs.Empty : args, Utilities.withVersion(options));
    }
}
