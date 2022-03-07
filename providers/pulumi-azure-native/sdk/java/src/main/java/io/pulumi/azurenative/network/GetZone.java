// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetZoneArgs;
import io.pulumi.azurenative.network.outputs.GetZoneResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetZone {
    private GetZone() {}
    public interface BuilderApplicator {
        public void apply(GetZoneArgs.Builder a);
    }
    private static GetZoneArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetZoneArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Describes a DNS zone.
 * API Version: 2018-05-01.
 * 
     *
     * Describes a DNS zone.
 * 
     */
    public static CompletableFuture<GetZoneResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Describes a DNS zone.
     * API Version: 2018-05-01.
     * 
     *
         * Describes a DNS zone.
     * 
     */
    public static CompletableFuture<GetZoneResult> invokeAsync(GetZoneArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getZone", TypeShape.of(GetZoneResult.class), args == null ? GetZoneArgs.Empty : args, Utilities.withVersion(options));
    }
}