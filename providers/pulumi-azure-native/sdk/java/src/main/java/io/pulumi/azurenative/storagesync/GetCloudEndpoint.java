// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagesync.inputs.GetCloudEndpointArgs;
import io.pulumi.azurenative.storagesync.outputs.GetCloudEndpointResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCloudEndpoint {
    private GetCloudEndpoint() {}
    public interface BuilderApplicator {
        public void apply(GetCloudEndpointArgs.Builder a);
    }
    private static GetCloudEndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetCloudEndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Cloud Endpoint object.
 * API Version: 2020-03-01.
 * 
     *
     * Cloud Endpoint object.
 * 
     */
    public static CompletableFuture<GetCloudEndpointResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Cloud Endpoint object.
     * API Version: 2020-03-01.
     * 
     *
         * Cloud Endpoint object.
     * 
     */
    public static CompletableFuture<GetCloudEndpointResult> invokeAsync(GetCloudEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storagesync:getCloudEndpoint", TypeShape.of(GetCloudEndpointResult.class), args == null ? GetCloudEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}