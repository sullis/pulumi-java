// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.botservice.inputs.GetChannelArgs;
import io.pulumi.azurenative.botservice.outputs.GetChannelResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetChannel {
    private GetChannel() {}
    public interface BuilderApplicator {
        public void apply(GetChannelArgs.Builder a);
    }
    private static GetChannelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetChannelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Bot channel resource definition
 * API Version: 2021-03-01.
 * 
     *
     * Bot channel resource definition
 * 
     */
    public static CompletableFuture<GetChannelResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Bot channel resource definition
     * API Version: 2021-03-01.
     * 
     *
         * Bot channel resource definition
     * 
     */
    public static CompletableFuture<GetChannelResult> invokeAsync(GetChannelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:botservice:getChannel", TypeShape.of(GetChannelResult.class), args == null ? GetChannelArgs.Empty : args, Utilities.withVersion(options));
    }
}