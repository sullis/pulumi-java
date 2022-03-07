// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetVirtualApplianceSiteArgs;
import io.pulumi.azurenative.network.outputs.GetVirtualApplianceSiteResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualApplianceSite {
    private GetVirtualApplianceSite() {}
    public interface BuilderApplicator {
        public void apply(GetVirtualApplianceSiteArgs.Builder a);
    }
    private static GetVirtualApplianceSiteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetVirtualApplianceSiteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Virtual Appliance Site resource.
 * API Version: 2020-11-01.
 * 
     *
     * Virtual Appliance Site resource.
 * 
     */
    public static CompletableFuture<GetVirtualApplianceSiteResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Virtual Appliance Site resource.
     * API Version: 2020-11-01.
     * 
     *
         * Virtual Appliance Site resource.
     * 
     */
    public static CompletableFuture<GetVirtualApplianceSiteResult> invokeAsync(GetVirtualApplianceSiteArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getVirtualApplianceSite", TypeShape.of(GetVirtualApplianceSiteResult.class), args == null ? GetVirtualApplianceSiteArgs.Empty : args, Utilities.withVersion(options));
    }
}