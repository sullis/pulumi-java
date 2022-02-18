// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetWorkloadNetworkPortMirroringArgs;
import io.pulumi.azurenative.avs.outputs.GetWorkloadNetworkPortMirroringResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkloadNetworkPortMirroring {
/**
 * NSX Port Mirroring
 * API Version: 2020-07-17-preview.
 * 
 *
 * NSX Port Mirroring
 * 
 */
    public static CompletableFuture<GetWorkloadNetworkPortMirroringResult> invokeAsync(GetWorkloadNetworkPortMirroringArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkPortMirroring", TypeShape.of(GetWorkloadNetworkPortMirroringResult.class), args == null ? GetWorkloadNetworkPortMirroringArgs.Empty : args, Utilities.withVersion(options));
    }
}
