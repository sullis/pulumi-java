// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetConnectionGatewayArgs;
import io.pulumi.azurenative.web.outputs.GetConnectionGatewayResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectionGateway {
    private GetConnectionGateway() {}
    public interface BuilderApplicator {
        public void apply(GetConnectionGatewayArgs.Builder a);
    }
    private static GetConnectionGatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetConnectionGatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * The gateway definition
 * API Version: 2016-06-01.
 * 
     *
     * The gateway definition
 * 
     */
    public static CompletableFuture<GetConnectionGatewayResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * The gateway definition
     * API Version: 2016-06-01.
     * 
     *
         * The gateway definition
     * 
     */
    public static CompletableFuture<GetConnectionGatewayResult> invokeAsync(GetConnectionGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getConnectionGateway", TypeShape.of(GetConnectionGatewayResult.class), args == null ? GetConnectionGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}