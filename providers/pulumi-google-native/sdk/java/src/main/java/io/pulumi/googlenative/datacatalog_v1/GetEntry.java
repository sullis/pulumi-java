// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1.inputs.GetEntryArgs;
import io.pulumi.googlenative.datacatalog_v1.outputs.GetEntryResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEntry {
    private GetEntry() {}
    public interface BuilderApplicator {
        public void apply(GetEntryArgs.Builder a);
    }
    private static GetEntryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEntryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets an entry.
 * 
     */
    public static CompletableFuture<GetEntryResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets an entry.
     * 
     */
    public static CompletableFuture<GetEntryResult> invokeAsync(GetEntryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datacatalog/v1:getEntry", TypeShape.of(GetEntryResult.class), args == null ? GetEntryArgs.Empty : args, Utilities.withVersion(options));
    }
}