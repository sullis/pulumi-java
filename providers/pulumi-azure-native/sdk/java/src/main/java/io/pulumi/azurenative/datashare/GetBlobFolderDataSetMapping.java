// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetBlobFolderDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.GetBlobFolderDataSetMappingResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBlobFolderDataSetMapping {
    private GetBlobFolderDataSetMapping() {}
    public interface BuilderApplicator {
        public void apply(GetBlobFolderDataSetMappingArgs.Builder a);
    }
    private static GetBlobFolderDataSetMappingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetBlobFolderDataSetMappingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * A Blob folder data set mapping.
 * API Version: 2020-09-01.
 * 
     *
     * A Blob folder data set mapping.
 * 
     */
    public static CompletableFuture<GetBlobFolderDataSetMappingResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * A Blob folder data set mapping.
     * API Version: 2020-09-01.
     * 
     *
         * A Blob folder data set mapping.
     * 
     */
    public static CompletableFuture<GetBlobFolderDataSetMappingResult> invokeAsync(GetBlobFolderDataSetMappingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getBlobFolderDataSetMapping", TypeShape.of(GetBlobFolderDataSetMappingResult.class), args == null ? GetBlobFolderDataSetMappingArgs.Empty : args, Utilities.withVersion(options));
    }
}