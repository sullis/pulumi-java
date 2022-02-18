// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetBackendArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetBackendResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBackend {
/**
 * Backend details.
 * API Version: 2020-12-01.
 * 
 *
 * Backend details.
 * 
 */
    public static CompletableFuture<GetBackendResult> invokeAsync(GetBackendArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getBackend", TypeShape.of(GetBackendResult.class), args == null ? GetBackendArgs.Empty : args, Utilities.withVersion(options));
    }
}
