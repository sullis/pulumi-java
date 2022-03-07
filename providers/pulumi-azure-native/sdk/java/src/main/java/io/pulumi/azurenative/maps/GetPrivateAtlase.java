// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maps.inputs.GetPrivateAtlaseArgs;
import io.pulumi.azurenative.maps.outputs.GetPrivateAtlaseResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateAtlase {
    private GetPrivateAtlase() {}
    public interface BuilderApplicator {
        public void apply(GetPrivateAtlaseArgs.Builder a);
    }
    private static GetPrivateAtlaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetPrivateAtlaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * An Azure resource which represents which will provision the ability to create private location data.
 * API Version: 2020-02-01-preview.
 * 
     *
     * An Azure resource which represents which will provision the ability to create private location data.
 * 
     */
    public static CompletableFuture<GetPrivateAtlaseResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * An Azure resource which represents which will provision the ability to create private location data.
     * API Version: 2020-02-01-preview.
     * 
     *
         * An Azure resource which represents which will provision the ability to create private location data.
     * 
     */
    public static CompletableFuture<GetPrivateAtlaseResult> invokeAsync(GetPrivateAtlaseArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:maps:getPrivateAtlase", TypeShape.of(GetPrivateAtlaseResult.class), args == null ? GetPrivateAtlaseArgs.Empty : args, Utilities.withVersion(options));
    }
}