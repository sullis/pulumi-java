// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetNetworkInterfaceArgs;
import io.pulumi.azurenative.network.outputs.GetNetworkInterfaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetworkInterface {
    private GetNetworkInterface() {}
    public interface BuilderApplicator {
        public void apply(GetNetworkInterfaceArgs.Builder a);
    }
    private static GetNetworkInterfaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetNetworkInterfaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A network interface in a resource group.
 * API Version: 2020-11-01.
 * 
     *
     * A network interface in a resource group.
 * 
     */
    public static CompletableFuture<GetNetworkInterfaceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A network interface in a resource group.
     * API Version: 2020-11-01.
     * 
     *
         * A network interface in a resource group.
     * 
     */
    public static CompletableFuture<GetNetworkInterfaceResult> invokeAsync(GetNetworkInterfaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getNetworkInterface", TypeShape.of(GetNetworkInterfaceResult.class), args == null ? GetNetworkInterfaceArgs.Empty : args, Utilities.withVersion(options));
    }
}