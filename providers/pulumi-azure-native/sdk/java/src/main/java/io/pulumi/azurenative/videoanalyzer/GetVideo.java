// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.inputs.GetVideoArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.GetVideoResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVideo {
    private GetVideo() {}
    public interface BuilderApplicator {
        public void apply(GetVideoArgs.Builder a);
    }
    private static GetVideoArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVideoArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The representation of a single video in a Video Analyzer account.
 * API Version: 2021-05-01-preview.
 * 
     *
     * The representation of a single video in a Video Analyzer account.
 * 
     */
    public static CompletableFuture<GetVideoResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The representation of a single video in a Video Analyzer account.
     * API Version: 2021-05-01-preview.
     * 
     *
         * The representation of a single video in a Video Analyzer account.
     * 
     */
    public static CompletableFuture<GetVideoResult> invokeAsync(GetVideoArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getVideo", TypeShape.of(GetVideoResult.class), args == null ? GetVideoArgs.Empty : args, Utilities.withVersion(options));
    }
}