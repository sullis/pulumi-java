// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.inputs.GetRegionDiskArgs;
import io.pulumi.googlenative.compute_v1.outputs.GetRegionDiskResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegionDisk {
    private GetRegionDisk() {}
    public interface BuilderApplicator {
        public void apply(GetRegionDiskArgs.Builder a);
    }
    private static GetRegionDiskArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetRegionDiskArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns a specified regional persistent disk.
 * 
     */
    public static CompletableFuture<GetRegionDiskResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns a specified regional persistent disk.
     * 
     */
    public static CompletableFuture<GetRegionDiskResult> invokeAsync(GetRegionDiskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/v1:getRegionDisk", TypeShape.of(GetRegionDiskResult.class), args == null ? GetRegionDiskArgs.Empty : args, Utilities.withVersion(options));
    }
}