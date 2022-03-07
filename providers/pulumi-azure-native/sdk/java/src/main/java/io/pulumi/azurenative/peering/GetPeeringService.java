// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.peering.inputs.GetPeeringServiceArgs;
import io.pulumi.azurenative.peering.outputs.GetPeeringServiceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPeeringService {
    private GetPeeringService() {}
    public interface BuilderApplicator {
        public void apply(GetPeeringServiceArgs.Builder a);
    }
    private static GetPeeringServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPeeringServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Peering Service
 * API Version: 2021-01-01.
 * 
     *
     * Peering Service
 * 
     */
    public static CompletableFuture<GetPeeringServiceResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Peering Service
     * API Version: 2021-01-01.
     * 
     *
         * Peering Service
     * 
     */
    public static CompletableFuture<GetPeeringServiceResult> invokeAsync(GetPeeringServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:peering:getPeeringService", TypeShape.of(GetPeeringServiceResult.class), args == null ? GetPeeringServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}