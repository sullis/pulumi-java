// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ids_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.ids_v1.inputs.GetEndpointArgs;
import io.pulumi.googlenative.ids_v1.outputs.GetEndpointResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEndpoint {
    private GetEndpoint() {}
    public interface BuilderApplicator {
        public void apply(GetEndpointArgs.Builder a);
    }
    private static GetEndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetEndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Gets details of a single Endpoint.
 * 
     */
    public static CompletableFuture<GetEndpointResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Gets details of a single Endpoint.
     * 
     */
    public static CompletableFuture<GetEndpointResult> invokeAsync(GetEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ids/v1:getEndpoint", TypeShape.of(GetEndpointResult.class), args == null ? GetEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}