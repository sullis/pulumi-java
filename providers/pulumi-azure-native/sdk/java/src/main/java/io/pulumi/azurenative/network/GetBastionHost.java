// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetBastionHostArgs;
import io.pulumi.azurenative.network.outputs.GetBastionHostResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBastionHost {
    private GetBastionHost() {}
    public interface BuilderApplicator {
        public void apply(GetBastionHostArgs.Builder a);
    }
    private static GetBastionHostArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBastionHostArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Bastion Host resource.
 * API Version: 2020-11-01.
 * 
     *
     * Bastion Host resource.
 * 
     */
    public static CompletableFuture<GetBastionHostResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Bastion Host resource.
     * API Version: 2020-11-01.
     * 
     *
         * Bastion Host resource.
     * 
     */
    public static CompletableFuture<GetBastionHostResult> invokeAsync(GetBastionHostArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getBastionHost", TypeShape.of(GetBastionHostResult.class), args == null ? GetBastionHostArgs.Empty : args, Utilities.withVersion(options));
    }
}