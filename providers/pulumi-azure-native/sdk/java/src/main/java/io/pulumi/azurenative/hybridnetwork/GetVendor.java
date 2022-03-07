// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridnetwork.inputs.GetVendorArgs;
import io.pulumi.azurenative.hybridnetwork.outputs.GetVendorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVendor {
    private GetVendor() {}
    public interface BuilderApplicator {
        public void apply(GetVendorArgs.Builder a);
    }
    private static GetVendorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVendorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Vendor resource.
 * API Version: 2020-01-01-preview.
 * 
     *
     * Vendor resource.
 * 
     */
    public static CompletableFuture<GetVendorResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Vendor resource.
     * API Version: 2020-01-01-preview.
     * 
     *
         * Vendor resource.
     * 
     */
    public static CompletableFuture<GetVendorResult> invokeAsync(GetVendorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:getVendor", TypeShape.of(GetVendorResult.class), args == null ? GetVendorArgs.Empty : args, Utilities.withVersion(options));
    }
}