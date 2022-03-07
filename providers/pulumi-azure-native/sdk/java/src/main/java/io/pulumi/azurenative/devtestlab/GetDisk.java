// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetDiskArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetDiskResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDisk {
    private GetDisk() {}
    public interface BuilderApplicator {
        public void apply(GetDiskArgs.Builder a);
    }
    private static GetDiskArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetDiskArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A Disk.
 * API Version: 2018-09-15.
 * 
     *
     * A Disk.
 * 
     */
    public static CompletableFuture<GetDiskResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A Disk.
     * API Version: 2018-09-15.
     * 
     *
         * A Disk.
     * 
     */
    public static CompletableFuture<GetDiskResult> invokeAsync(GetDiskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getDisk", TypeShape.of(GetDiskResult.class), args == null ? GetDiskArgs.Empty : args, Utilities.withVersion(options));
    }
}