// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databricks.inputs.GetvNetPeeringArgs;
import io.pulumi.azurenative.databricks.outputs.GetvNetPeeringResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetvNetPeering {
    private GetvNetPeering() {}
    public interface BuilderApplicator {
        public void apply(GetvNetPeeringArgs.Builder a);
    }
    private static GetvNetPeeringArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetvNetPeeringArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Peerings in a VirtualNetwork resource
 * API Version: 2018-04-01.
 * 
     *
     * Peerings in a VirtualNetwork resource
 * 
     */
    public static CompletableFuture<GetvNetPeeringResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Peerings in a VirtualNetwork resource
     * API Version: 2018-04-01.
     * 
     *
         * Peerings in a VirtualNetwork resource
     * 
     */
    public static CompletableFuture<GetvNetPeeringResult> invokeAsync(GetvNetPeeringArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databricks:getvNetPeering", TypeShape.of(GetvNetPeeringResult.class), args == null ? GetvNetPeeringArgs.Empty : args, Utilities.withVersion(options));
    }
}