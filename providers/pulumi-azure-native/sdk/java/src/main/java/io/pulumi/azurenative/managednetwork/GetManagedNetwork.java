// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.managednetwork.inputs.GetManagedNetworkArgs;
import io.pulumi.azurenative.managednetwork.outputs.GetManagedNetworkResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagedNetwork {
    private GetManagedNetwork() {}
    public interface BuilderApplicator {
        public void apply(GetManagedNetworkArgs.Builder a);
    }
    private static GetManagedNetworkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetManagedNetworkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The Managed Network resource
 * API Version: 2019-06-01-preview.
 * 
     *
     * The Managed Network resource
 * 
     */
    public static CompletableFuture<GetManagedNetworkResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The Managed Network resource
     * API Version: 2019-06-01-preview.
     * 
     *
         * The Managed Network resource
     * 
     */
    public static CompletableFuture<GetManagedNetworkResult> invokeAsync(GetManagedNetworkArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:managednetwork:getManagedNetwork", TypeShape.of(GetManagedNetworkResult.class), args == null ? GetManagedNetworkArgs.Empty : args, Utilities.withVersion(options));
    }
}