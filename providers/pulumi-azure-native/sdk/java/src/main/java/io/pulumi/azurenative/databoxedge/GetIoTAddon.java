// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.inputs.GetIoTAddonArgs;
import io.pulumi.azurenative.databoxedge.outputs.GetIoTAddonResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIoTAddon {
    private GetIoTAddon() {}
    public interface BuilderApplicator {
        public void apply(GetIoTAddonArgs.Builder a);
    }
    private static GetIoTAddonArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetIoTAddonArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * IoT Addon.
 * API Version: 2020-12-01.
 * 
     *
     * IoT Addon.
 * 
     */
    public static CompletableFuture<GetIoTAddonResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * IoT Addon.
     * API Version: 2020-12-01.
     * 
     *
         * IoT Addon.
     * 
     */
    public static CompletableFuture<GetIoTAddonResult> invokeAsync(GetIoTAddonArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getIoTAddon", TypeShape.of(GetIoTAddonResult.class), args == null ? GetIoTAddonArgs.Empty : args, Utilities.withVersion(options));
    }
}