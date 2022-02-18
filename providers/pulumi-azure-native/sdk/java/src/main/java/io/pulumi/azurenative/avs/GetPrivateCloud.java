// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetPrivateCloudArgs;
import io.pulumi.azurenative.avs.outputs.GetPrivateCloudResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateCloud {
/**
 * A private cloud resource
 * API Version: 2020-03-20.
 * 
 *
 * A private cloud resource
 * 
 */
    public static CompletableFuture<GetPrivateCloudResult> invokeAsync(GetPrivateCloudArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getPrivateCloud", TypeShape.of(GetPrivateCloudResult.class), args == null ? GetPrivateCloudArgs.Empty : args, Utilities.withVersion(options));
    }
}
