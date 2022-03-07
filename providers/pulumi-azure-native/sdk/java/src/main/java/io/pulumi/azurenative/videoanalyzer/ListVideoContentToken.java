// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.inputs.ListVideoContentTokenArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.ListVideoContentTokenResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListVideoContentToken {
    private ListVideoContentToken() {}
    public interface BuilderApplicator {
        public void apply(ListVideoContentTokenArgs.Builder a);
    }
    private static ListVideoContentTokenArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListVideoContentTokenArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * "Video content token grants access to the video content URLs."
 * API Version: 2021-11-01-preview.
 * 
     *
     * "Video content token grants access to the video content URLs."
 * 
     */
    public static CompletableFuture<ListVideoContentTokenResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * "Video content token grants access to the video content URLs."
     * API Version: 2021-11-01-preview.
     * 
     *
         * "Video content token grants access to the video content URLs."
     * 
     */
    public static CompletableFuture<ListVideoContentTokenResult> invokeAsync(ListVideoContentTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:listVideoContentToken", TypeShape.of(ListVideoContentTokenResult.class), args == null ? ListVideoContentTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}