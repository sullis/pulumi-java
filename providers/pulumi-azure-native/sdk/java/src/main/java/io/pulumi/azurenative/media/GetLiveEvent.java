// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.GetLiveEventArgs;
import io.pulumi.azurenative.media.outputs.GetLiveEventResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLiveEvent {
    private GetLiveEvent() {}
    public interface BuilderApplicator {
        public void apply(GetLiveEventArgs.Builder a);
    }
    private static GetLiveEventArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetLiveEventArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The live event.
 * API Version: 2020-05-01.
 * 
     *
     * The live event.
 * 
     */
    public static CompletableFuture<GetLiveEventResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The live event.
     * API Version: 2020-05-01.
     * 
     *
         * The live event.
     * 
     */
    public static CompletableFuture<GetLiveEventResult> invokeAsync(GetLiveEventArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getLiveEvent", TypeShape.of(GetLiveEventResult.class), args == null ? GetLiveEventArgs.Empty : args, Utilities.withVersion(options));
    }
}