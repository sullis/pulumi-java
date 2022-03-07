// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.testbase.inputs.GetPackageDownloadURLArgs;
import io.pulumi.azurenative.testbase.outputs.GetPackageDownloadURLResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPackageDownloadURL {
    private GetPackageDownloadURL() {}
    public interface BuilderApplicator {
        public void apply(GetPackageDownloadURLArgs.Builder a);
    }
    private static GetPackageDownloadURLArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPackageDownloadURLArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The response of getting a download URL.
 * API Version: 2020-12-16-preview.
 * 
     *
     * The response of getting a download URL.
 * 
     */
    public static CompletableFuture<GetPackageDownloadURLResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The response of getting a download URL.
     * API Version: 2020-12-16-preview.
     * 
     *
         * The response of getting a download URL.
     * 
     */
    public static CompletableFuture<GetPackageDownloadURLResult> invokeAsync(GetPackageDownloadURLArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:testbase:getPackageDownloadURL", TypeShape.of(GetPackageDownloadURLResult.class), args == null ? GetPackageDownloadURLArgs.Empty : args, Utilities.withVersion(options));
    }
}