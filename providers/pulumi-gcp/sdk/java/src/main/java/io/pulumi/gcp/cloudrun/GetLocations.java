// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.cloudrun.inputs.GetLocationsArgs;
import io.pulumi.gcp.cloudrun.outputs.GetLocationsResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocations {
    private GetLocations() {}
    public interface BuilderApplicator {
        public void apply(GetLocationsArgs.Builder a);
    }
    private static GetLocationsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLocationsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Get Cloud Run locations available for a project.
 * 
 * To get more information about Cloud Run, see:
 * 
 * * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/projects.locations)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/run/docs/)
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getLocations.
 * 
     *
     * A collection of values returned by getLocations.
 * 
     */
    public static CompletableFuture<GetLocationsResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Get Cloud Run locations available for a project.
     * 
     * To get more information about Cloud Run, see:
     * 
     * * [API documentation](https://cloud.google.com/run/docs/reference/rest/v1/projects.locations)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/run/docs/)
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getLocations.
     * 
     *
         * A collection of values returned by getLocations.
     * 
     */
    public static CompletableFuture<GetLocationsResult> invokeAsync(@Nullable GetLocationsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:cloudrun/getLocations:getLocations", TypeShape.of(GetLocationsResult.class), args == null ? GetLocationsArgs.Empty : args, Utilities.withVersion(options));
    }
}