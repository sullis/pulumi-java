// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.netapp.inputs.GetSnapshotArgs;
import io.pulumi.azurenative.netapp.outputs.GetSnapshotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSnapshot {
    private GetSnapshot() {}
    public interface BuilderApplicator {
        public void apply(GetSnapshotArgs.Builder a);
    }
    private static GetSnapshotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetSnapshotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Snapshot of a Volume
 * API Version: 2020-12-01.
 * 
     *
     * Snapshot of a Volume
 * 
     */
    public static CompletableFuture<GetSnapshotResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Snapshot of a Volume
     * API Version: 2020-12-01.
     * 
     *
         * Snapshot of a Volume
     * 
     */
    public static CompletableFuture<GetSnapshotResult> invokeAsync(GetSnapshotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:netapp:getSnapshot", TypeShape.of(GetSnapshotResult.class), args == null ? GetSnapshotArgs.Empty : args, Utilities.withVersion(options));
    }
}