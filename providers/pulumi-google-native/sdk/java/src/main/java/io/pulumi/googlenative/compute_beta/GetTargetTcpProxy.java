// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.inputs.GetTargetTcpProxyArgs;
import io.pulumi.googlenative.compute_beta.outputs.GetTargetTcpProxyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTargetTcpProxy {
    private GetTargetTcpProxy() {}
    public interface BuilderApplicator {
        public void apply(GetTargetTcpProxyArgs.Builder a);
    }
    private static GetTargetTcpProxyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = GetTargetTcpProxyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by making a list() request.
 * 
     */
    public static CompletableFuture<GetTargetTcpProxyResult> invokeAsync(BuilderApplicator argsBuilder, @Nullable InvokeOptions options) {
        return invokeAsync(buildArgs(argsBuilder), Utilities.withVersion(options));
    }
    /**
         * Returns the specified TargetTcpProxy resource. Gets a list of available target TCP proxies by making a list() request.
     * 
     */
    public static CompletableFuture<GetTargetTcpProxyResult> invokeAsync(GetTargetTcpProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:compute/beta:getTargetTcpProxy", TypeShape.of(GetTargetTcpProxyResult.class), args == null ? GetTargetTcpProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}