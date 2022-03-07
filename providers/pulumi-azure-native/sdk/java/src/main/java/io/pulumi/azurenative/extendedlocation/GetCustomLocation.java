// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.extendedlocation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.extendedlocation.inputs.GetCustomLocationArgs;
import io.pulumi.azurenative.extendedlocation.outputs.GetCustomLocationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomLocation {
    private GetCustomLocation() {}
    public interface BuilderApplicator {
        public void apply(GetCustomLocationArgs.Builder a);
    }
    private static GetCustomLocationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCustomLocationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Custom Locations definition.
 * API Version: 2021-03-15-preview.
 * 
     *
     * Custom Locations definition.
 * 
     */
    public static CompletableFuture<GetCustomLocationResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Custom Locations definition.
     * API Version: 2021-03-15-preview.
     * 
     *
         * Custom Locations definition.
     * 
     */
    public static CompletableFuture<GetCustomLocationResult> invokeAsync(GetCustomLocationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:extendedlocation:getCustomLocation", TypeShape.of(GetCustomLocationResult.class), args == null ? GetCustomLocationArgs.Empty : args, Utilities.withVersion(options));
    }
}