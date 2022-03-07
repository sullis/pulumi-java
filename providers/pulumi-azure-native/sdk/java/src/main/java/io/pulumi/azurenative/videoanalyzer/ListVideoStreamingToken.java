// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.inputs.ListVideoStreamingTokenArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.ListVideoStreamingTokenResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListVideoStreamingToken {
    private ListVideoStreamingToken() {}
    public interface BuilderApplicator {
        public void apply(ListVideoStreamingTokenArgs.Builder a);
    }
    private static ListVideoStreamingTokenArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = ListVideoStreamingTokenArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Video streaming token grants access to the video streaming URLs which can be used by an compatible HLS or DASH player.
 * API Version: 2021-05-01-preview.
 * 
     *
     * Video streaming token grants access to the video streaming URLs which can be used by an compatible HLS or DASH player.
 * 
     */
    public static CompletableFuture<ListVideoStreamingTokenResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Video streaming token grants access to the video streaming URLs which can be used by an compatible HLS or DASH player.
     * API Version: 2021-05-01-preview.
     * 
     *
         * Video streaming token grants access to the video streaming URLs which can be used by an compatible HLS or DASH player.
     * 
     */
    public static CompletableFuture<ListVideoStreamingTokenResult> invokeAsync(ListVideoStreamingTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:listVideoStreamingToken", TypeShape.of(ListVideoStreamingTokenResult.class), args == null ? ListVideoStreamingTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}