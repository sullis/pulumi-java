// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.inputs.GetRegionNetworkArgs;
import io.pulumi.googlenative.compute_alpha.outputs.GetRegionNetworkResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionNetwork {
    private GetRegionNetwork() {}
    public interface BuilderApplicator {
        public void apply(GetRegionNetworkArgs.Builder a);
    }
    private static GetRegionNetworkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRegionNetworkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified network.
 * 
     */
    public static CompletableFuture<GetRegionNetworkResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified network.
     * 
     */
    public static CompletableFuture<GetRegionNetworkResult> invokeAsync(GetRegionNetworkArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/alpha:getRegionNetwork", TypeShape.of(GetRegionNetworkResult.class), args == null ? GetRegionNetworkArgs.Empty : args, Utilities.withVersion(options));
    }
}