// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.docdb.inputs.GetEngineVersionArgs;
import io.pulumi.aws.docdb.outputs.GetEngineVersionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEngineVersion {
    private GetEngineVersion() {}
    public interface BuilderApplicator {
        public void apply(GetEngineVersionArgs.Builder a);
    }
    private static GetEngineVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEngineVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Information about a DocumentDB engine version.
 * 
 * ## Example Usage
 * 
     *
     * A collection of arguments for invoking getEngineVersion.
 * 
     *
     * A collection of values returned by getEngineVersion.
 * 
     */
    public static CompletableFuture<GetEngineVersionResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Information about a DocumentDB engine version.
     * 
     * ## Example Usage
     * 
     *
         * A collection of arguments for invoking getEngineVersion.
     * 
     *
         * A collection of values returned by getEngineVersion.
     * 
     */
    public static CompletableFuture<GetEngineVersionResult> invokeAsync(@Nullable GetEngineVersionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:docdb/getEngineVersion:getEngineVersion", TypeShape.of(GetEngineVersionResult.class), args == null ? GetEngineVersionArgs.Empty : args, Utilities.withVersion(options));
    }
}