// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudtrail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudtrail.inputs.GetTrailArgs;
import io.pulumi.awsnative.cloudtrail.outputs.GetTrailResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTrail {
    private GetTrail() {}
    public interface BuilderApplicator {
        public void apply(GetTrailArgs.Builder a);
    }
    private static GetTrailArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTrailArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. A maximum of five trails can exist in a region, irrespective of the region in which they were created.
 * 
     */
    public static CompletableFuture<GetTrailResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. A maximum of five trails can exist in a region, irrespective of the region in which they were created.
     * 
     */
    public static CompletableFuture<GetTrailResult> invokeAsync(GetTrailArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudtrail:getTrail", TypeShape.of(GetTrailResult.class), args == null ? GetTrailArgs.Empty : args, Utilities.withVersion(options));
    }
}