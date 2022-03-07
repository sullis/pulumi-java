// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurestackhci.inputs.GetClusterArgs;
import io.pulumi.azurenative.azurestackhci.outputs.GetClusterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCluster {
    private GetCluster() {}
    public interface BuilderApplicator {
        public void apply(GetClusterArgs.Builder a);
    }
    private static GetClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetClusterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Cluster details.
 * API Version: 2020-10-01.
 * 
     *
     * Cluster details.
 * 
     */
    public static CompletableFuture<GetClusterResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Cluster details.
     * API Version: 2020-10-01.
     * 
     *
         * Cluster details.
     * 
     */
    public static CompletableFuture<GetClusterResult> invokeAsync(GetClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurestackhci:getCluster", TypeShape.of(GetClusterResult.class), args == null ? GetClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}