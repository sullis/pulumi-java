// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetEntitiesGetTimelineArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetEntitiesGetTimelineResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEntitiesGetTimeline {
    private GetEntitiesGetTimeline() {}
    public interface BuilderApplicator {
        public void apply(GetEntitiesGetTimelineArgs.Builder a);
    }
    private static GetEntitiesGetTimelineArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEntitiesGetTimelineArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The entity timeline result operation response.
 * API Version: 2019-01-01-preview.
 * 
     *
     * The entity timeline result operation response.
 * 
     */
    public static CompletableFuture<GetEntitiesGetTimelineResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The entity timeline result operation response.
     * API Version: 2019-01-01-preview.
     * 
     *
         * The entity timeline result operation response.
     * 
     */
    public static CompletableFuture<GetEntitiesGetTimelineResult> invokeAsync(GetEntitiesGetTimelineArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getEntitiesGetTimeline", TypeShape.of(GetEntitiesGetTimelineResult.class), args == null ? GetEntitiesGetTimelineArgs.Empty : args, Utilities.withVersion(options));
    }
}